package me.xaanit.d4jscala.api.handle.obj

import me.xaanit.d4jscala.util.Queue
import sx.blah.discord.api.IShard
import sx.blah.discord.handle.obj.IUser

class Shard(private[api] val shard: IShard) {
  def isReady: Boolean = shard.isReady

  def invisible(): Queue[Unit] = Queue(() => shard.invisible())

  def login(): Queue[Unit] = Queue(() => shard.login())

  def getMessages(includePrivate: Boolean) = ???

  def getMessages = ???

  def getOrCreatePMChannel(user: IUser) = ???

  def getRoleByID(roleID: Long) = ???

  def getVoiceChannelByID(id: Long) = ???

  def getVoiceChannels = ???

  def logout() = ???

  def streaming(playingText: String, streamingUrl: String) = ???

  def getCategoryByID(categoryID: Long) = ???

  def getCategories = ???

  def getUsers = ???

  def fetchUser(id: Long) = ???

  def dnd(playingText: String) = ???

  def dnd() = ???

  def changePlayingText(playingText: String) = ???

  def getResponseTime = ???

  def getRoles = ???

  def getMessageByID(messageID: Long) = ???

  def getUserByID(userID: Long) = ???

  def getInfo = ???

  def idle(playingText: String) = ???

  def idle() = ???

  def getGuilds = ???

  def getClient = ???

  def getConnectedVoiceChannels = ???

  def getGuildByID(guildID: Long) = ???

  def getChannels(includePrivate: Boolean) = ???

  def getChannels = ???

  def online(playingText: String) = ???

  def online() = ???

  def isLoggedIn = ???

  def getChannelByID(channelID: Long) = ???
}

object Shard {
  def apply(shard: IShard): Shard = new Shard(shard)
}
