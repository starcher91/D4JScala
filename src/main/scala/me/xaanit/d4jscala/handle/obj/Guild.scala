package me.xaanit.d4jscala.handle.obj

import sx.blah.discord.handle.audit.ActionType
import sx.blah.discord.handle.obj._
import sx.blah.discord.util.Image

class Guild(guild: IGuild) {
  def getName = ???

  def pardonUser(userID: Long) = ???

  def getEmojiByID(id: Long) = ???

  def createRole() = ???

  def getRolesForUser(user: IUser) = ???

  def getGeneralChannel = ???

  def getOwner = ???

  def getExtendedInvites = ???

  def getJoinTimeForUser(user: IUser) = ???

  def getUsersByName(name: String) = ???

  def getUsersByName(name: String, includeNicknames: Boolean) = ???

  def getVoiceChannelByID(id: Long) = ???

  def getConnectedVoiceChannel = ???

  def getCategoryByID(id: Long) = ???

  def createChannel(name: String) = ???

  def getCategories = ???

  def getUsers = ???

  def leave() = ???

  def createCategory(name: String) = ???

  def getCategoriesByName(name: String) = ???

  def getOwnerLongID = ???

  def getWebhookByID(id: Long) = ???

  def getRoles = ???

  def changeIcon(icon: Image) = ???

  def getTotalMemberCount = ???

  def changeAFKChannel(channel: IVoiceChannel) = ???

  def getUsersByRole(role: IRole) = ???

  def edit(name: String, region: IRegion, level: VerificationLevel, icon: Image, afkChannel: IVoiceChannel, afkTimeout: Int) = ???

  def banUser(user: IUser) = ???

  def banUser(user: IUser, deleteMessagesForDays: Int) = ???

  def banUser(user: IUser, reason: String) = ???

  def banUser(user: IUser, reason: String, deleteMessagesForDays: Int) = ???

  def banUser(userID: Long) = ???

  def banUser(userID: Long, deleteMessagesForDays: Int) = ???

  def banUser(userID: Long, reason: String) = ???

  def banUser(userID: Long, reason: String, deleteMessagesForDays: Int) = ???

  def getVerificationLevel = ???

  def getEmojiByName(name: String) = ???

  def reorderRoles(rolesInOrder: IRole*) = ???

  def changeName(name: String) = ???

  def getAFKChannel = ???

  def getRegion = ???

  def changeRegion(region: IRegion) = ???

  def changeAFKTimeout(timeout: Int) = ???

  def kickUser(user: IUser) = ???

  def kickUser(user: IUser, reason: String) = ???

  def getChannelByID(id: Long) = ???

  def getAFKTimeout = ???

  def getWebhooksByName(name: String) = ???

  def getAudioManager = ???

  def getBans = ???

  def getEmojis = ???

  def setDeafenUser(user: IUser, deafen: Boolean) = ???

  def pruneUsers(days: Int) = ???

  def getRoleByID(id: Long) = ???

  def getVoiceChannels = ???

  def setMuteUser(user: IUser, mute: Boolean) = ???

  def isDeleted = ???

  def getWebhooks = ???

  def getUsersToBePruned(days: Int) = ???

  def getAuditLog = ???

  def getAuditLog(actionType: ActionType) = ???

  def getAuditLog(user: IUser) = ???

  def getAuditLog(user: IUser, actionType: ActionType) = ???

  def changeVerificationLevel(verification: VerificationLevel) = ???

  def getMessageByID(id: Long) = ???

  def getUserByID(id: Long) = ???

  def getEveryoneRole = ???

  def editUserRoles(user: IUser, roles: Array[IRole]) = ???

  def getBannedUsers = ???

  def getVoiceChannelsByName(name: String) = ???

  def getIcon = ???

  def getDefaultChannel = ???

  def createVoiceChannel(name: String) = ???

  def setUserNickname(user: IUser, nick: String) = ???

  def getChannels = ???

  def getIconURL = ???

  def getChannelsByName(name: String) = ???

  def getRolesByName(name: String) = ???

  def getShard = ???

  def copy() = ???

  def getClient = ???

  def getLongID = ???
}

object Guild {
  def apply(guild: IGuild): Guild = new Guild(guild)
}
