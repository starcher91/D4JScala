package me.xaanit.d4jscala.util

import java.util.concurrent._
import java.util.function.Consumer

import sx.blah.discord.util.RequestBuffer

class Queue[T](irequest: Option[RequestBuffer.IRequest[T]] = Option.empty, void: Option[RequestBuffer.IVoidRequest] = Option.empty) {
  private val threadPool: Executor = new ThreadPoolExecutor(1, 3, 5, TimeUnit.MINUTES, new ArrayBlockingQueue[Runnable](128), new ThreadFactory {
    override def newThread(r: Runnable): Thread = {
      val thread: Thread = new Thread()
      thread.setDaemon(true)
      thread.setName("Queue Thread")
      thread
    }
  })

  /**
    * Runs the request in sync. Returns the result.
    *
    * @return The result.
    * @throws UnsupportedOperationException If the IRequest optional is empty.
    */
  def sync(): T = if (irequest.isDefined) RequestBuffer.request(irequest.get).get() else throw new UnsupportedOperationException("Void requests can not be used with sync!")

  /**
    * Runs the request in async.
    */
  def async(): Unit = if (irequest.isDefined) RequestBuffer.request(irequest.get) else RequestBuffer.request(void.get)

  def async(success: Consumer[T] = (t) => {}, failure: Consumer[Throwable] = (t) => {}): Unit = {
    threadPool.execute(() => {
      if (irequest.isDefined) {
        try {
          val future = RequestBuffer.request(irequest.get)
          while (!future.isDone) {
            Thread.sleep(100)
          }
          val value: T = future.get()
          success.accept(value)
        } catch {
          case e: Throwable => failure.accept(e)
        }
      } else {
        try {
          val future = RequestBuffer.request(void.get)
          while (!future.isDone) {
            Thread.sleep(100)
          }
          // Idk what to do here
        } catch {
          case e: Throwable => failure.accept(e)
        }
      }
    })
  }
}
