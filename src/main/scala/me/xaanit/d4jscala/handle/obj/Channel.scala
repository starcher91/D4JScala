package me.xaanit.d4jscala.handle.obj

import java.io.{File, InputStream}
import java.time.LocalDateTime
import java.util

import sx.blah.discord.api.internal.json.objects.EmbedObject
import sx.blah.discord.handle.obj._
import sx.blah.discord.util.{AttachmentPartEntry, Image, MessageBuilder}

class Channel(channel: IChannel) {
  def getMaxInternalCacheCount = ???

  def createInvite(maxAge: Int, maxUses: Int, temporary: Boolean, unique: Boolean) = ???

  def getName = ???

  def getMessageHistoryFrom(startDate: LocalDateTime) = ???

  def getMessageHistoryFrom(startDate: LocalDateTime, maxMessageCount: Int) = ???

  def getMessageHistoryFrom(id: Long) = ???

  def getMessageHistoryFrom(id: Long, maxMessageCount: Int) = ???

  def createWebhook(name: String) = ???

  def createWebhook(name: String, avatar: Image) = ???

  def createWebhook(name: String, avatar: String) = ???

  def getUsersLong = ???

  def getExtendedInvites = ???

  def getMessageHistoryIn(startDate: LocalDateTime, endDate: LocalDateTime) = ???

  def getMessageHistoryIn(startDate: LocalDateTime, endDate: LocalDateTime, maxMessageCount: Int) = ???

  def getMessageHistoryIn(beginID: Long, endID: Long) = ???

  def getMessageHistoryIn(beginID: Long, endID: Long, maxMessageCount: Int) = ???

  def pin(message: IMessage) = ???

  def toggleTypingStatus() = ???

  def changeTopic(topic: String) = ???

  def getWebhookByID(id: Long) = ???

  def edit(name: String, position: Int, topic: String) = ???

  def isNSFW = ???

  def getFullMessageHistory = ???

  def getCategory = ???

  def removePermissions(user: IUser) = ???

  def removePermissions(role: IRole) = ???

  def changeName(name: String) = ???

  def changeCategory(category: ICategory) = ???

  def bulkDelete() = ???

  def bulkDelete(messages: util.List[IMessage]) = ???

  def getRolesLong = ???

  def RolePermissions(role: IRole, toAdd: util.EnumSet[Permissions], toRemove: util.EnumSet[Permissions]) = ???

  def getWebhooksByName(name: String) = ???

  def UserPermissions(user: IUser, toAdd: util.EnumSet[Permissions], toRemove: util.EnumSet[Permissions]) = ???

  def getPinnedMessages = ???

  def getGuild = ???

  def getMessageHistoryTo(endDate: LocalDateTime) = ???

  def getMessageHistoryTo(endDate: LocalDateTime, maxMessageCount: Int) = ???

  def getMessageHistoryTo(id: Long) = ???

  def getMessageHistoryTo(id: Long, maxMessageCount: Int) = ???

  def isPrivate = ???

  def getTopic = ???

  def getUsersHere = ???

  def delete() = ???

  def mention() = ???

  def setTypingStatus(typing: Boolean) = ???

  def isDeleted = ???

  def getWebhooks = ???

  def getUsers = ???

  def getMessageByID(messageID: Long) = ???

  def getModifiedPermissions(user: IUser) = ???

  def getModifiedPermissions(role: IRole) = ???

  def sendMessage(content: String) = ???

  def sendMessage(embed: EmbedObject) = ???

  def sendMessage(content: String, tts: Boolean) = ???

  def sendMessage(content: String, embed: EmbedObject) = ???

  def sendMessage(content: String, embed: EmbedObject, tts: Boolean) = ???

  def getRoles = ???

  def changeNSFW(isNSFW: Boolean) = ???

  def getTypingStatus = ???

  def getMessageHistory = ???

  def getMessageHistory(messageCount: Int) = ???

  def sendFile(file: File) = ???

  def sendFile(content: String, file: File) = ???

  def sendFile(embed: EmbedObject, file: File) = ???

  def sendFile(content: String, file: InputStream, fileName: String) = ???

  def sendFile(embed: EmbedObject, file: InputStream, fileName: String) = ???

  def sendFile(content: String, tts: Boolean, file: InputStream, fileName: String) = ???

  def sendFile(content: String, tts: Boolean, file: InputStream, fileName: String, embed: EmbedObject) = ???

  def sendFile(builder: MessageBuilder, file: InputStream, fileName: String) = ???

  def getPosition = ???

  def changePosition(position: Int) = ???

  def getInternalCacheCount = ???

  def unpin(message: IMessage) = ???

  def sendFiles(files: File*) = ???

  def sendFiles(content: String, files: File*) = ???

  def sendFiles(embed: EmbedObject, files: File*) = ???

  def sendFiles(content: String, entries: AttachmentPartEntry*) = ???

  def sendFiles(embed: EmbedObject, entries: AttachmentPartEntry*) = ???

  def sendFiles(content: String, tts: Boolean, entries: AttachmentPartEntry*) = ???

  def sendFiles(content: String, tts: Boolean, embed: EmbedObject, entries: AttachmentPartEntry*) = ???

  def getShard = ???

  def copy() = ???

  def getClient = ???

  def getLongID = ???
}

object Channel {
  def apply(channel: IChannel): Channel = new Channel(channel)
}