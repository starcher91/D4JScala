package me.xaanit.d4jscala.handle.obj

import com.vdurmont.emoji
import sx.blah.discord.api.internal.json.objects.EmbedObject
import sx.blah.discord.handle.impl.obj.ReactionEmoji
import sx.blah.discord.handle.obj.{IEmoji, IMessage, IReaction, IUser}

class Message(message: IMessage) {
  def getGuild = ???

  def getAuthor = ???

  def mentionsEveryone() = ???

  def getContent = ???

  def getReactions = ???

  def removeReaction(reaction: IReaction) = ???

  def removeReaction(user: IUser, reaction: IReaction) = ???

  def removeReaction(user: IUser, emoji: ReactionEmoji) = ???

  def removeReaction(user: IUser, emoji: IEmoji) = ???

  def removeReaction(user: IUser, emoji: emoji.Emoji) = ???

  def removeReaction(user: IUser, emoji: String) = ???

  def delete() = ???

  def tokenize() = ???

  def getEditedTimestamp = ???

  def mentionsHere() = ???

  def getReactionByID(id: Long) = ???

  def addReaction(reaction: IReaction) = ???

  def addReaction(emoji: IEmoji) = ???

  def addReaction(emoji: emoji.Emoji) = ???

  def addReaction(emoji: String) = ???

  def addReaction(emoji: ReactionEmoji) = ???

  def isDeleted = ???

  def getChannel = ???

  def getTimestamp = ???

  def getReactionByUnicode(unicode: emoji.Emoji) = ???

  def getReactionByUnicode(unicode: String) = ???

  def removeAllReactions() = ???

  def getFormattedContent = ???

  def getRoleMentions = ???

  def reply(content: String) = ???

  def reply(content: String, embed: EmbedObject) = ???

  def getReactionByIEmoji(emoji: IEmoji) = ???

  def getReactionByEmoji(emoji: IEmoji) = ???

  def getReactionByEmoji(emoji: ReactionEmoji) = ???

  def isPinned = ???

  def edit(content: String) = ???

  def edit(content: String, embed: EmbedObject) = ???

  def edit(embed: EmbedObject) = ???

  def getMentions = ???

  def getEmbeds = ???

  def getChannelMentions = ???

  def getAttachments = ???

  def getWebhookLongID = ???

  def getShard = ???

  def copy() = ???

  def getClient = ???

  def getLongID = ???
}

object Message {
  def apply(message: IMessage): Message = new Message(message)
}
