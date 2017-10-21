package me.xaanit.d4jscala.api.handle.obj

import java.io.{File, InputStream}
import java.time.LocalDateTime
import java.util

import sx.blah.discord.api.internal.json.objects.EmbedObject
import sx.blah.discord.handle.obj._
import sx.blah.discord.util.{AttachmentPartEntry, Image, MessageBuilder}

class PrivateChannel(channel: IPrivateChannel) extends Channel(channel) {
  override def createInvite(maxAge: Int, maxUses: Int, temporary: Boolean, unique: Boolean) = ???

  override def createWebhook(name: String) = ???

  override def createWebhook(name: String, avatar: Image) = ???

  override def createWebhook(name: String, avatar: String) = ???

  def getUserOverridesLong = ???

  override def getExtendedInvites = ???

  override def changeTopic(topic: String) = ???

  override def getWebhookByID(id: Long) = ???

  override def edit(name: String, position: Int, topic: String) = ???

  override def isNSFW = ???

  def getRecipient = ???

  def removePermissionsOverride(user: IUser) = ???

  def removePermissionsOverride(role: IRole) = ???

  override def changeName(name: String) = ???

  def getRoleOverridesLong = ???

  def overrideRolePermissions(role: IRole, toAdd: util.EnumSet[Permissions], toRemove: util.EnumSet[Permissions]) = ???

  override def getWebhooksByName(name: String) = ???

  def overrideUserPermissions(user: IUser, toAdd: util.EnumSet[Permissions], toRemove: util.EnumSet[Permissions]) = ???

  override def getGuild = ???

  override def getTopic = ???

  override def delete() = ???

  override def isDeleted = ???

  override def getWebhooks = ???

  override def copy() = ???

  override def getModifiedPermissions(role: IRole) = ???

  override def getPosition = ???

  override def changePosition(position: Int) = ???

  override def getMaxInternalCacheCount = ???

  override def getName = ???

  override def getMessageHistoryFrom(startDate: LocalDateTime) = ???

  override def getMessageHistoryFrom(startDate: LocalDateTime, maxMessageCount: Int) = ???

  override def getMessageHistoryFrom(id: Long) = ???

  override def getMessageHistoryFrom(id: Long, maxMessageCount: Int) = ???

  override def getMessageHistoryIn(startDate: LocalDateTime, endDate: LocalDateTime) = ???

  override def getMessageHistoryIn(startDate: LocalDateTime, endDate: LocalDateTime, maxMessageCount: Int) = ???

  override def getMessageHistoryIn(beginID: Long, endID: Long) = ???

  override def getMessageHistoryIn(beginID: Long, endID: Long, maxMessageCount: Int) = ???

  override def pin(message: IMessage) = ???

  override def toggleTypingStatus() = ???

  override def getFullMessageHistory = ???

  override def getCategory = ???

  override def changeCategory(category: ICategory) = ???

  override def bulkDelete() = ???

  override def bulkDelete(messages: util.List[IMessage]) = ???

  override def getPinnedMessages = ???

  override def getMessageHistoryTo(endDate: LocalDateTime) = ???

  override def getMessageHistoryTo(endDate: LocalDateTime, maxMessageCount: Int) = ???

  override def getMessageHistoryTo(id: Long) = ???

  override def getMessageHistoryTo(id: Long, maxMessageCount: Int) = ???

  override def isPrivate = ???

  override def getUsersHere = ???

  override def mention() = ???

  override def setTypingStatus(typing: Boolean) = ???

  def getUserOverrides = ???

  override def getMessageByID(messageID: Long) = ???

  override def getModifiedPermissions(user: IUser) = ???

  override def sendMessage(content: String) = ???

  override def sendMessage(embed: EmbedObject) = ???

  override def sendMessage(content: String, tts: Boolean) = ???

  override def sendMessage(content: String, embed: EmbedObject) = ???

  override def sendMessage(content: String, embed: EmbedObject, tts: Boolean) = ???

  def getRoleOverrides = ???

  override def changeNSFW(isNSFW: Boolean) = ???

  override def getTypingStatus = ???

  override def getMessageHistory = ???

  override def getMessageHistory(messageCount: Int) = ???

  override def sendFile(file: File) = ???

  override def sendFile(content: String, file: File) = ???

  override def sendFile(embed: EmbedObject, file: File) = ???

  override def sendFile(content: String, file: InputStream, fileName: String) = ???

  override def sendFile(embed: EmbedObject, file: InputStream, fileName: String) = ???

  override def sendFile(content: String, tts: Boolean, file: InputStream, fileName: String) = ???

  override def sendFile(content: String, tts: Boolean, file: InputStream, fileName: String, embed: EmbedObject) = ???

  override def sendFile(builder: MessageBuilder, file: InputStream, fileName: String) = ???

  override def getInternalCacheCount = ???

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

object PrivateChannel {
  def apply(channel: IPrivateChannel): PrivateChannel = new PrivateChannel(channel)
}
