package me.xaanit.d4jscala.api.handle.obj

import sx.blah.discord.handle.obj.IExtendedInvite

class ExtendedInvite(invite: IExtendedInvite) extends Invite(invite) {
  def getUses = ???

  def getMaxUses = ???

  def isTemporary = ???

  def isRevoked = ???

  def getMaxAge = ???

  def getCreationTime = ???

  override def getGuild = ???

  override def getClient = ???

  override def delete() = ???

  override def getInviter = ???

  override def getChannel = ???

  override def getCode = ???
}

object ExtendedInvite {
  def apply(invite: IExtendedInvite): ExtendedInvite = new ExtendedInvite(invite)
}
