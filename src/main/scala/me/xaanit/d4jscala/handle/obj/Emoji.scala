package me.xaanit.d4jscala.handle.obj

import sx.blah.discord.handle.obj.IEmoji

class Emoji(emoji: IEmoji) {
  def getGuild = ???

  def getName = ???

  def requiresColons() = ???

  def isManaged = ???

  def getImageUrl = ???

  def getRoles = ???

  def getShard = ???

  def getClient = ???

  def copy() = ???

  def getLongID = ???
}

object Emoji {
  def apply(emoji: IEmoji): Emoji = new Emoji(emoji)
}
