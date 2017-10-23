package me.xaanit.d4jscala.api.handle.obj

import sx.blah.discord.handle.obj.{IReaction, IUser}

class Reaction(reaction: IReaction) {
  def getUserReacted(user: IUser) = ???

  def getMessage = ???

  def getShard = ???

  def getClient = ???

  def getCustomEmoji = ???

  def getClientReacted = ???

  def getEmoji = ???

  def getUsers = ???

  def getUnicodeEmoji = ???

  def isCustomEmoji = ???

  def copy() = ???

  def getCount = ???
}

object Reaction{
  def apply(reaction: IReaction): Reaction = new Reaction(reaction)
}
