package me.xaanit.d4jscala.api.handle.obj

import me.xaanit.d4jscala.util.Queue
import sx.blah.discord.api.IShard
import sx.blah.discord.handle.obj._
import me.xaanit.d4jscala._
import me.xaanit.d4jscala.api.DiscordClient

class Shard(private[api] val shard: IShard) {
  def isReady: Boolean = shard.isReady

  def invisible(): Queue[Unit] = Queue(() => shard.invisible())

  def login(): Queue[Unit] = Queue(() => shard.login())

  def getMessages(includePrivate: Boolean): List[Message] = shard.getMessages(includePrivate).toWrappedList(_.toWrappedMessage)

  def getMessages: List[Message] = getMessages(false)

  def getOrCreatePMChannel(user: User): Queue[PrivateChannel] = Queue(() => shard.getOrCreatePMChannel(user.user).toWrappedChannel)

  def getRoleByID(id: Long): Option[Role] = {
    obj.getRoleByID(id) match {
      case null => None
      case role => Some[Role](role.toWrappedRole)
    }
  }

  def getVoiceChannelByID(id: Long): Option[VoiceChannel] = {
    obj.getVoiceChannelByID(id) match {
      case null => None
      case channel => Some[VoiceChannel](channel.toWrappedVoiceChannel)
    }
  }

  def getVoiceChannels: List[VoiceChannel] = shard.getVoiceChannels.toWrappedList(_.toWrappedChannel)

  def logout(): Queue[Unit] = Queue(() => shard.logout())

  def streaming(playingText: String, streamingUrl: String): Queue[Unit] = Queue(() => shard.streaming(playingText, streamingUrl))

  def getCategoryByID(id: Long): Option[Category] = {
    obj.getCategoryByID(id) match {
      case null => None
      case category => Some[Category](category.toWrappedCategory)
    }
  }

  def getCategories: List[Category] = shard.getCategories.toWrappedList(_.toWrappedCategory)

  def getUsers: List[User] = shard.getUsers.toWrappedList(_.toWrappedUser)

  def fetchUser(id: Long): Option[User] = {
    val user: IUser = shard.fetchUser(id)
    if (user == null) None else Some[User](user.toWrappedUser)
  }

  def dnd(playingText: String): Queue[Unit] = Queue(() => shard.dnd(playingText))

  def dnd(): Queue[Unit] = Queue(() => shard.dnd())

  def changePlayingText(playingText: String): Queue[Unit] = Queue(() => shard.changePlayingText(playingText))

  def getResponseTime: Long = shard.getResponseTime

  def getRoles: List[Role] = shard.getRoles.toWrappedList(_.toWrappedRole)

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

  def getInfo: Array[Int] = shard.getInfo

  def idle(playingText: String): Queue[Unit] = Queue(() => shard.idle(playingText))

  def idle(): Queue[Unit] = Queue(() => shard.idle())

  def getGuilds: List[Guild] = shard.getGuilds.toWrappedList(_.toWrappedGuild)

  def getClient: DiscordClient = shard.getClient.toWrappedClient

  def getConnectedVoiceChannels: List[VoiceChannel] = shard.getConnectedVoiceChannels.toWrappedList(_.toWrappedChannel)

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
