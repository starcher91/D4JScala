package me.xaanit.d4jscala.api

import me.xaanit.d4jscala.util.Queue
import sx.blah.discord.api.{ClientBuilder, IDiscordClient, IShard}
import sx.blah.discord.handle.obj._
import sx.blah.discord.util.Image
import me.xaanit.d4jscala._
import me.xaanit.d4jscala.api.handle.obj._
import sx.blah.discord.api.events.EventDispatcher
import sx.blah.discord.api.internal.{DiscordClientImpl, ShardImpl}
import sx.blah.discord.modules.ModuleLoader

import scala.collection.mutable.ListBuffer

protected[d4jscala] class DiscordClient(private[api] val client: IDiscordClient) {

  def getApplicationClientID: Long = client.getApplicationClientID.toLong

  def changeUsername(username: String): Queue[Unit] = Queue(() => client.changeUsername(username))

  def invisible(): Queue[Unit] = Queue(() => client.invisible())

  def getApplicationDescription: String = client.getApplicationDescription

  def getMessages(includePrivate: Boolean): Queue[List[Message]] = Queue(() => client.getMessages(includePrivate).toWrappedList(_.toWrappedMessage))

  def getMessages: Queue[List[Message]] = getMessages(true)

  def getUsersByName(name: String): List[User] = getUsersByName(name, ignoreCase = false)

  def getUsersByName(name: String, ignoreCase: Boolean): List[User] = client.getUsersByName(name, ignoreCase).toWrappedList(_.toWrappedUser)

  def getVoiceChannelByID(id: Long): Option[VoiceChannel] = {
    obj.getVoiceChannelByID(id) match {
      case null => None
      case channel => Some[VoiceChannel](channel.toWrappedVoiceChannel)
    }
  }

  def getModuleLoader: ModuleLoader = client.getModuleLoader

  def logout(): Queue[Unit] = Queue(() => client.logout())

  def getCategoryByID(id: Long): Option[Category] = {
    obj.getCategoryByID(id) match {
      case null => None
      case category => Some[Category](category.toWrappedCategory)
    }
  }

  def getCategories: List[Category] = client.getCategories.toWrappedList(_.toWrappedCategory)

  def getUsers: List[User] = client.getUsers.toWrappedList(_.toWrappedUser)

  def fetchUser(id: Long): Queue[Option[User]] = Queue(() => {
    val user: IUser = client.fetchUser(id)
    if (user == null) None else Some[User](user.toWrappedUser)
  })

  def getCategoriesByName(name: String): List[Category] = client.getCategories.toWrappedList(_.toWrappedCategory)

  def dnd(playingText: String): Queue[Unit] = Queue(() => client.dnd(playingText))

  def dnd(): Queue[Unit] = Queue(() => client.dnd())

  def getRoles: List[Role] = client.getRoles.toWrappedList(_.toWrappedRole)

  def getRegionByID(regionID: String): Option[Region] = {
    obj.getRegionByID(id) match {
      case null => None
      case region => Some[Region](region.toWrappedRegion)
    }
  }

  def mute(guild: IGuild, isSelfMuted: Boolean): Queue[Unit] = Queue(() => client.mute(guild, isSelfMuted))

  def getShardCount: Int = client.getShardCount

  def getGuilds: List[Guild] = client.getGuilds.toWrappedList(_.toWrappedGuild)

  def getConnectedVoiceChannels: List[VoiceChannel] = client.getConnectedVoiceChannels.toWrappedList(_.toWrappedChannel)

  def getGuildByID(id: Long): Option[Guild] = {
    obj.getGuildByID(id) match {
      case null => None
      case guild => Some[Guild](guild.toWrappedGuild)
    }
  }

  def getOurUser: User = client.getOurUser.toWrappedUser

  def isLoggedIn: Boolean = client.isLoggedIn

  def getChannelByID(id: Long): Option[Channel] = {
    obj.getChannelByID(id) match {
      case null => None
      case channel => Some[Channel](channel.toWrappedChannel)
    }
  }

  def getApplicationOwner: User = client.getApplicationOwner.toWrappedUser

  def getRegions: List[Region] = client.getRegions.toWrappedList(_.toWrappedRegion)

  def getApplicationName: String = client.getApplicationName

  def isReady: Boolean = client.isReady

  def login(): Queue[DiscordClient] = Queue(() => {
    client.login()
    this
  })

  def getInviteForCode(code: String): Option[Invite] = {
    val invite: IInvite = client.getInviteForCode(code)
    if (invite == null) None else Some[Invite](invite.toWrappedInvite)
  }

  def getOrCreatePMChannel(user: User): Queue[PrivateChannel] = Queue(() => client.getOrCreatePMChannel(user.user).toWrappedChannel)

  def getRoleByID(id: Long): Option[Role] = {
    obj.getRoleByID(id) match {
      case null => None
      case role => Some[Role](role.toWrappedRole)
    }
  }

  def getVoiceChannels: List[VoiceChannel] = client.getVoiceChannels.toWrappedList(_.toWrappedChannel)

  def streaming(playingText: String, streamingUrl: String): Queue[Unit] = Queue(() => client.streaming(playingText, streamingUrl))

  def changePlayingText(playingText: String): Queue[Unit] = Queue(() => client.changePlayingText(playingText))

  def getApplicationIconURL: String = client.getApplicationIconURL

  def getMessageByID(id: Long): Option[Message] = {
    obj.getMessageByID(id) match {
      case null => None
      case message => Some[Message](message.toWrappedMessage)
    }
  }

  def getUserByID(id: Long): Option[User] = {
    obj.getUserByID(id) match {
      case null => None
      case user => Some[User](user.toWrappedUser)
    }
  }

  def idle(playingText: String): Queue[Unit] = Queue(() => client.idle(playingText))

  def idle(): Queue[Unit] = Queue(() => client.idle())

  def getDispatcher: EventDispatcher = client.getDispatcher

  def deafen(guild: Guild, isSelfDeafened: Boolean): Queue[Unit] = Queue(() => client.deafen(guild.guild, isSelfDeafened))

  def getShards: List[Shard] = client.getShards.toWrappedList(_.toWrappedShard)

  def changeAvatar(avatar: Image): Queue[Unit] = Queue(() => client.changeAvatar(avatar))

  def getToken: String = client.getToken

  def getChannels(includePrivate: Boolean): List[Channel] = client.getChannels(includePrivate).toWrappedList(_.toWrappedChannel)

  def getChannels: List[Channel] = getChannels(includePrivate = true)

  def online(playingText: String): Queue[Unit] = Queue(() => client.online(playingText))

  def online(): Queue[Unit] = Queue(() => client.online)

}


object DiscordClient {
  def apply(builder: ClientBuilder): DiscordClient = {
    new DiscordClient(builder.login)
  }


}
