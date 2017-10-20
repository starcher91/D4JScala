package me.xaanit.d4jscala.api

import sx.blah.discord.api.events.IListener

import scala.collection.mutable

class ListenerRegister {

  private val listeners: mutable.Set[Any] = mutable.Set()


  def register[T](listeners: IListener[T]*): Unit = {

  }
}
