package me.xaanit.d4jscala.api

import sx.blah.discord.api.{ClientBuilder, IDiscordClient}
import sx.blah.discord.handle.obj.{IGuild, IUser, StatusType}
import sx.blah.discord.util.Image
import sx.blah.discord.util.cache.{Cache, ICacheDelegateProvider}

protected class DiscordClient(private val client: IDiscordClient) {


  def getApplicationClientID = ???

  def changeUsername(username: String): IDiscordClient = ???

  def invisible() = ???

  def getApplicationDescription = ???

  def getMessages(includePrivate: Boolean) = ???

  def getMessages = ???

  def getUsersByName(name: String) = ???

  def getUsersByName(name: String, ignoreCase: Boolean) = ???

  def getVoiceChannelByID(id: Long) = ???

  def getModuleLoader = ???

  def logout() = ???

  def getCategoryByID(categoryID: Long) = ???

  def getCategories = ???

  def getUsers = ???

  def fetchUser(id: Long) = ???

  def getCategoriesByName(name: String) = ???

  def dnd(playingText: String) = ???

  def dnd() = ???

  def getRoles = ???

  def getRegionByID(regionID: String) = ???

  def mute(guild: IGuild, isSelfMuted: Boolean) = ???

  def getShardCount = ???

  def getGuilds = ???

  def getConnectedVoiceChannels = ???

  def getGuildByID(guildID: Long) = ???

  def getOurUser = ???

  def isLoggedIn = ???

  def getChannelByID(channelID: Long) = ???

  def getApplicationOwner = ???

  def getRegions = ???

  def getApplicationName = ???

  def isReady = ???

  def login() = ???

  def getInviteForCode(code: String) = ???

  def getOrCreatePMChannel(user: IUser) = ???

  def getRoleByID(roleID: Long) = ???

  def getVoiceChannels = ???

  def streaming(playingText: String, streamingUrl: String) = ???

  def changePlayingText(playingText: String) = ???

  def getApplicationIconURL = ???

  def getMessageByID(messageID: Long) = ???

  def getUserByID(userID: Long) = ???

  def idle(playingText: String) = ???

  def idle() = ???

  def getDispatcher = ???

  def deafen(guild: IGuild, isSelfDeafened: Boolean) = ???

  def getShards = ???

  def changeAvatar(avatar: Image) = ???

  def getToken = ???

  def getChannels(includePrivate: Boolean) = ???

  def getChannels = ???

  def online(playingText: String) = ???

  def online() = ???
}


object DiscordClient {
  def apply(builder: ClientBuilder): DiscordClient = {
    new DiscordClient(builder.login)
  }

}
