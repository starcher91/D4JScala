package me.xaanit.d4jscala.api.handle.obj

import java.io.{File, InputStream}
import java.time.LocalDateTime
import java.util

import sx.blah.discord.api.internal.json.objects.EmbedObject
import sx.blah.discord.handle.obj._
import sx.blah.discord.util.{AttachmentPartEntry, Image, MessageBuilder}

class VoiceChannel(private[api] val channel: IVoiceChannel) extends Channel(channel) {
  override def getMaxInternalCacheCount = ???

  def getBitrate = ???

  override def getMessageHistoryFrom(startDate: LocalDateTime, maxCount: Int) = ???

  override def getMessageHistoryFrom(id: Long, maxCount: Int) = ???

  override def getMessageHistoryFrom(startDate: LocalDateTime) = ???

  override def getMessageHistoryFrom(id: Long) = ???

  override def createWebhook(name: String) = ???

  override def createWebhook(name: String, avatar: Image) = ???

  override def createWebhook(name: String, avatar: String) = ???

  def changeBitrate(bitrate: Int) = ???

  override def getMessageHistoryIn(startDate: LocalDateTime, endDate: LocalDateTime, maxCount: Int) = ???

  override def getMessageHistoryIn(beginID: Long, endID: Long, maxCount: Int) = ???

  override def getMessageHistoryIn(startDate: LocalDateTime, endDate: LocalDateTime) = ???

  override def getMessageHistoryIn(beginID: Long, endID: Long) = ???

  def leave() = ???

  override def toggleTypingStatus() = ???

  override def changeTopic(topic: String) = ???

  def join() = ???

  override def getWebhookByID(id: Long) = ???

  def edit(name: String, position: Int, bitrate: Int, userLimit: Int) = ???

  override def edit(name: String, position: Int, topic: String) = ???

  override def isNSFW = ???

  override def getFullMessageHistory = ???

  override def bulkDelete() = ???

  override def bulkDelete(messages: util.List[IMessage]) = ???

  override def getWebhooksByName(name: String) = ???

  override def getPinnedMessages = ???

  override def getMessageHistoryTo(endDate: LocalDateTime, maxCount: Int) = ???

  override def getMessageHistoryTo(id: Long, maxCount: Int) = ???

  override def getMessageHistoryTo(endDate: LocalDateTime) = ???

  override def getMessageHistoryTo(id: Long) = ???

  def isConnected = ???

  override def getTopic = ???

  override def getWebhooks = ???

  override def copy() = ???

  override def getMessageByID(messageID: Long) = ???

  def getUserLimit = ???

  override def sendMessage(content: String) = ???

  override def sendMessage(content: String, tts: Boolean) = ???

  def getConnectedUsers = ???

  def changeUserLimit(limit: Int) = ???

  override def getTypingStatus = ???

  override def getMessageHistory = ???

  override def getMessageHistory(messageCount: Int) = ???

  override def sendFile(file: File) = ???

  override def sendFile(content: String, file: File) = ???

  override def sendFile(content: String, tts: Boolean, file: InputStream, fileName: String) = ???

  override def getInternalCacheCount = ???

  override def createInvite(maxAge: Int, maxUses: Int, temporary: Boolean, unique: Boolean) = ???

  override def getName = ???

  def getUserOverridesLong = ???

  override def getExtendedInvites = ???

  override def pin(message: IMessage) = ???

  override def getCategory = ???

  def removePermissionsOverride(user: IUser) = ???

  def removePermissionsOverride(role: IRole) = ???

  override def changeName(name: String) = ???

  override def changeCategory(category: ICategory) = ???

  def getRoleOverridesLong = ???

  override def RolePermissions(role: IRole, toAdd: util.EnumSet[Permissions], toRemove: util.EnumSet[Permissions]) = ???

  override def UserPermissions(user: IUser, toAdd: util.EnumSet[Permissions], toRemove: util.EnumSet[Permissions]) = ???

  override def getGuild = ???

  override def isPrivate = ???

  override def getUsersHere = ???

  override def delete() = ???

  override def mention() = ???

  override def setTypingStatus(typing: Boolean) = ???

  override def isDeleted = ???

  def getUserOverrides = ???

  override def getModifiedPermissions(user: IUser) = ???

  override def getModifiedPermissions(role: IRole) = ???

  override def sendMessage(embed: EmbedObject) = ???

  override def sendMessage(content: String, embed: EmbedObject) = ???

  override def sendMessage(content: String, embed: EmbedObject, tts: Boolean) = ???

  def getRoleOverrides = ???

  override def changeNSFW(isNSFW: Boolean) = ???

  override def sendFile(embed: EmbedObject, file: File) = ???

  override def sendFile(content: String, file: InputStream, fileName: String) = ???

  override def sendFile(embed: EmbedObject, file: InputStream, fileName: String) = ???

  override def sendFile(content: String, tts: Boolean, file: InputStream, fileName: String, embed: EmbedObject) = ???

  override def sendFile(builder: MessageBuilder, file: InputStream, fileName: String) = ???

  override def getPosition = ???

  override def changePosition(position: Int) = ???

  override def unpin(message: IMessage) = ???

  override def sendFiles(files: File*) = ???

  override def sendFiles(content: String, files: File*) = ???

  override def sendFiles(embed: EmbedObject, files: File*) = ???

  override def sendFiles(content: String, entries: AttachmentPartEntry*) = ???

  override def sendFiles(embed: EmbedObject, entries: AttachmentPartEntry*) = ???

  override def sendFiles(content: String, tts: Boolean, entries: AttachmentPartEntry*) = ???

  override def sendFiles(content: String, tts: Boolean, embed: EmbedObject, entries: AttachmentPartEntry*) = ???

  override def getShard = ???

  override def getClient = ???

  override def getLongID = ???
}

object VoiceChannel {
  def apply(channel: IVoiceChannel): VoiceChannel = new VoiceChannel(channel)
}
