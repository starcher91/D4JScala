package me.xaanit.d4jscala.util

import java.util.concurrent._
import java.util.function.Consumer

import sx.blah.discord.util.RequestBuffer
import sx.blah.discord.util.RequestBuffer.IRequest

import scala.util.Try

/**
  * A class to represent a request to discord that can be rate limited. Inspired by (but no code directly taken from) https://github.com/DV8FromTheWorld/JDA/wiki/7%29-Using-RestAction
  *
  * @param action The action to use.
  * @tparam T The
  * @author xaanit
  * @since 2.9.1
  */
class Queue[T](action: IRequest[T]) {
  val threadPool: Executor = new ThreadPoolExecutor(1, 3, 60, TimeUnit.SECONDS, new ArrayBlockingQueue[Runnable](128))

  /**
    * Runs the request in sync. Returns the result. <b>This blocks the thread. It's more advised to use the success consumer in Queue#queue()</b>
    *
    * @return The result.
    * @throws UnsupportedOperationException If the IRequest optional is empty.
    */
  def sync(): T = RequestBuffer.request(action).get()

  /**
    * Runs the request in async.
    *
    * @param success The code to run on the returned result.
    * @param failure The code to run on an error.
    */
  def async(success: Consumer[T] = () => {}, failure: Consumer[Throwable] = () => {}): Unit = {
    threadPool.execute(() => {
      Try(action.request()).fold((t) => failure.accept(t), (t) => success.accept(t))
    })
  }


}

object Queue {
  def apply[T](action: IRequest[T]): Queue[T] = new Queue(action)

}
