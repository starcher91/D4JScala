package me.xaanit.d4jscala.api.handle.obj

import sx.blah.discord.handle.obj.IDiscordObject

case class DiscordObject[T <: IDiscordObject[T]](obj: T) {
  def getShard = ???

  def getClient = ???

  def copy() = ???

  def getLongID = ???
}

