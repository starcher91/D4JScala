package me.xaanit.d4jscala.api.handle.obj

import sx.blah.discord.handle.obj.IInvite

class Invite(invite: IInvite) {
  def getGuild = ???

  def getClient = ???

  def delete() = ???

  def getInviter = ???

  def getChannel = ???

  def getCode = ???
}

object Invite {
  def apply(invite: IInvite): Invite = new Invite(invite)
}