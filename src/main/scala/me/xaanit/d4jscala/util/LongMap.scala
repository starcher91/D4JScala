package me.xaanit.d4jscala.util

import java.util

import com.koloboke.function.{LongObjConsumer, LongObjPredicate}

import scala.collection.mutable

class LongMap[T] extends sx.blah.discord.util.cache.LongMap[T] {

  private val map: mutable.Map[Long, T] = mutable.Map()

  override def forEachWhile(predicate: LongObjPredicate[_ >: T]): Unit =  {}


  override def containsKey(key: Long) = ???

  override def forEach(action: LongObjConsumer[_ >: T]) = ???

  override val values: Iterable[T] = map.values

  override def clear(): Unit = ???

  override def remove(key: Long): Unit = map.remove(key)

  override def put(key: Long, value: T): Unit = map += key -> value

  override val size = ???

  override def get(key: Long) = ???

  override val keySet: Iterable[Long] = map.keys
}
