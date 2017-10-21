package me.xaanit.d4jscala.api

import me.xaanit.d4jscala.util.Queue
import sx.blah.discord.api.{ClientBuilder, IDiscordClient}
import sx.blah.discord.handle.obj._
import sx.blah.discord.util.Image
import me.xaanit.d4jscala._
import me.xaanit.d4jscala.handle.obj._
import sx.blah.discord.modules.ModuleLoader
import scala.collection.mutable.ListBuffer

protected class DiscordClient(private val client: IDiscordClient) {

  def getApplicationClientID: Long = client.getApplicationClientID.toLong

  def changeUsername(username: String): Queue[Unit] = Queue(() => client.changeUsername(username))

  def invisible(): Queue[Unit] = Queue(() => client.invisible())

  def getApplicationDescription: String = client.getApplicationDescription

  def getMessages(includePrivate: Boolean): Queue[List[Message]] = Queue(() => getList[Message, IMessage](client.getMessages(includePrivate), _.toWrappedMessage))

  def getMessages: Queue[List[Message]] = getMessages(true)

  def getUsersByName(name: String): List[User] = getUsersByName(name, ignoreCase = false)

  def getUsersByName(name: String, ignoreCase: Boolean): List[User] = getList[User, IUser](client.getUsersByName(name, ignoreCase), _.toWrappedUser)

  def getVoiceChannelByID(id: Long): Option[VoiceChannel] = {
    val channel: IVoiceChannel = client.getVoiceChannelByID(id)
    if (channel == null) Option.empty else Option[VoiceChannel](channel.toWrappedChannel)
  }

  def getModuleLoader: ModuleLoader = client.getModuleLoader

  def logout(): Queue[Unit] = Queue(() => client.logout())

  def getCategoryByID(id: Long): Option[Category] = {
    val category: ICategory = client.getCategoryByID(id)
    if (category == null) Option.empty else Option[Category](category.toWrappedCategory)
  }

  def getCategories: List[Category] = getList[Category, ICategory](client.getCategories, _.toWrappedCategory)

  def getUsers: List[User] = getList[User, IUser](client.getUsers, _.toWrappedUser)

  def fetchUser(id: Long):Queue[Option[User]] = Queue(() => {
    val user: IUser = client.fetchUser(id)
    if(user == null) Option.empty else Option[User](user.toWrappedUser)
  })

  def getCategoriesByName(name: String): List[Category] = getList[Category, ICategory](client.getCategoriesByName(name), _.toWrappedCategory)

  def dnd(playingText: String): Queue[Unit] = Queue(() => client.dnd(playingText))

  def dnd(): Queue[Unit] = Queue(() => client.dnd())

  def getRoles: List[Role] = getList[Role, IRole](client.getRoles, _.toWrappedRole)

  def getRegionByID(regionID: String): Option[Region] = {
    val region: IRegion = client.getRegionByID(regionID)
    if(region == null) Option.empty else Option[Region](region.toWrappedRegion)
  }

  def mute(guild: IGuild, isSelfMuted: Boolean): Queue[Unit] = Queue(() => client.mute(guild, isSelfMuted))

  def getShardCount: Int = client.getShardCount

  def getGuilds: List[Guild] = getList[Guild, IGuild](client.getGuilds, _.toWrappedGuild)

  def getConnectedVoiceChannels: List[VoiceChannel] = getList[VoiceChannel, IVoiceChannel](client.getConnectedVoiceChannels, _.toWrappedChannel)

  def getGuildByID(id: Long): Option[Guild] = {
    val guild: IGuild = client.getGuildByID(id)
    if(guild == null) Option.empty else Option[Guild](guild.toWrappedGuild)
  }

  def getOurUser: User = client.getOurUser.toWrappedUser

  def isLoggedIn: Boolean = client.isLoggedIn

  def getChannelByID(id: Long): Option[Channel] = {
    val channel: IChannel = client.getChannelByID(id)
    if(channel == null) Option.empty else Option[Channel](channel.toWrappedChannel)
  }

  def getApplicationOwner: User = client.getApplicationOwner.toWrappedUser

  def getRegions: List[Region] = getList[Region, IRegion](client.getRegions, _.toWrappedRegion)

  def getApplicationName: String = client.getApplicationName

  def isReady: Boolean = client.isReady

  def login(): Queue[DiscordClient] = Queue(() => {
    client.login()
    this
  })

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

  private def getList[T, U](list: java.util.List[U], map: U => T): List[T] = {
    val buffer: ListBuffer[T] = ListBuffer[T]()
    list.forEach(e => buffer += map(e))
    buffer.toList
  }
}


object DiscordClient {
  def apply(builder: ClientBuilder): DiscordClient = {
    new DiscordClient(builder.login)
  }

}
