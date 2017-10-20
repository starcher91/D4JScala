package me.xaanit.d4jscala.api

import me.xaanit.d4jscala.util.Queue
import sx.blah.discord.api.{ClientBuilder, IDiscordClient}
import sx.blah.discord.handle.obj._
import sx.blah.discord.util.Image
import me.xaanit.d4jscala._
import me.xaanit.d4jscala.handle.obj._
import sx.blah.discord.api.internal.{DiscordClientImpl, ShardImpl}
import sx.blah.discord.modules.ModuleLoader

import scala.collection.mutable.ListBuffer

protected class DiscordClient(private val client: IDiscordClient) {

  def getApplicationClientID: Long = client.getApplicationClientID.toLong

  def changeUsername(username: String): Queue[Unit] = Queue(() => client.changeUsername(username))

  def invisible(): Queue[Unit] = Queue(() => client.invisible())

  def getApplicationDescription: String = client.getApplicationDescription

  def getMessages(includePrivate: Boolean): Queue[List[Message]] = Queue(() => {
    val messages: java.util.List[IMessage] = client.getMessages(true)
    val buffer: ListBuffer[Message] = ListBuffer[Message]()
    messages.forEach(m => buffer += m.toWrappedMessage)
    buffer.toList
  })

  def getMessages: Queue[List[Message]] = getMessages(true)

  def getUsersByName(name: String): List[User] = getUsersByName(name, ignoreCase = false)

  def getUsersByName(name: String, ignoreCase: Boolean): List[User] = {
    val users: java.util.List[IUser] = client.getUsersByName(name, ignoreCase)
    val buffer: ListBuffer[User] = ListBuffer[User]()
    users.forEach(u => buffer += u.toWrappedUser)
    buffer.toList
  }

  def getVoiceChannelByID(id: Long): Option[VoiceChannel] = {
    val channel: IVoiceChannel = client.getVoiceChannelByID(id)
    if (channel == null) Option.empty else Option[VoiceChannel](channel.toWrappedChannel)
  }

  def getModuleLoader: ModuleLoader = client.getModuleLoader

  def logout(): Queue[Unit] = Queue(() => client.logout())

  def getCategoryByID(id: Long): Option[Category] = {
   val category: ICategory = client.getCategoryByID(id)
    if(category == null) Option.empty else Option[category.toWrappedCategory]
  }

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
