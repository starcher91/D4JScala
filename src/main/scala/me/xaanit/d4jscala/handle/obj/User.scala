package me.xaanit.d4jscala.handle.obj

import sx.blah.discord.handle.obj.{IGuild, IRole, IUser, IVoiceChannel}

 class User(user: IUser) {
  def getAvatarURL = ???

  def isBot = ???

  def getName = ???

  def getAvatar = ???

  def getOrCreatePMChannel() = ???

  def mention() = ???

  def mention(mentionWithNickname: Boolean) = ???

  def moveToVoiceChannel(channel: IVoiceChannel) = ???

  def getVoiceStates = ???

  def getVoiceStateForGuild(guild: IGuild) = ???

  def getVoiceStatesLong = ???

  def getColorForGuild(guild: IGuild) = ???

  def removeRole(role: IRole) = ???

  def getRolesForGuild(guild: IGuild) = ???

  def getPresence = ???

  def getNicknameForGuild(guild: IGuild) = ???

  def getDiscriminator = ???

  def getDisplayName(guild: IGuild) = ???

  def getPermissionsForGuild(guild: IGuild) = ???

  def addRole(role: IRole) = ???

  def getShard = ???

  def copy() = ???

  def getClient = ???

  def getLongID = ???
}

object User {
  def apply(user: IUser): User = new User(user)
}
