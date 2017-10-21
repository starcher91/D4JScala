package me.xaanit.d4jscala.handle.obj

import sx.blah.discord.handle.obj.IExtendedInvite

class ExtendedInvite(invite: IExtendedInvite) {
  def getUses = ???

  def getMaxUses = ???

  def isTemporary = ???

  def isRevoked = ???

  def getMaxAge = ???

  def getCreationTime = ???

  def getGuild = ???

  def getClient = ???

  def delete() = ???

  def getInviter = ???

  def getChannel = ???

  def getCode = ???
}

object ExtendedInvite {
  def apply(invite: IExtendedInvite): ExtendedInvite = new ExtendedInvite(invite)
}
