package me.xaanit.d4jscala.api.handle.obj

import me.xaanit.d4jscala.util.Queue
import me.xaanit.d4jscala._
import me.xaanit.d4jscala.api.DiscordClient
import sx.blah.discord.api.internal.DiscordClientImpl
import sx.blah.discord.handle.obj._
import sx.blah.discord.util.cache.{Cache, LongMap}

class User(private[api] val user: IUser) {
  def getAvatarURL: String = user.getAvatarURL

  def isBot: Boolean = user.isBot

  def getName: String = user.getName

  def getAvatar: String = user.getAvatar

  def getOrCreatePMChannel(): Queue[PrivateChannel] = Queue(() => user.getOrCreatePMChannel().toWrappedChannel)

  def mention(): String = user.mention

  def mention(mentionWithNickname: Boolean): String = user.mention(mentionWithNickname)

  def moveToVoiceChannel(channel: VoiceChannel): Queue[Unit] = Queue(() => user.moveToVoiceChannel(channel.channel))

  def getVoiceStates: LongMap[VoiceState] = {
    val states: LongMap[IVoiceState] = user.getVoiceStates
    val cache: Cache[VoiceState] = new Cache[VoiceState](getClient.client.asInstanceOf[DiscordClientImpl], classOf[VoiceState])
    for(s <- states) {
      s match {
        case vs: IVoiceState => cache.put(vs.toWrappedState)
        case _ => // Ignore
      }
    }
    cache.mapCopy()
  }

  def getVoiceStateForGuild(guild: IGuild) = ???

  def getVoiceStatesLong = ???

  def getColorForGuild(guild: IGuild) = ???

  def removeRole(role: IRole) = ???

  def getRolesForGuild(guild: IGuild) = ???

  def getPresence = ???

  def getNicknameForGuild(guild: IGuild) = ???

  def getDiscriminator = ???

  def getDisplayName(guild: IGuild) = ???

  def getPermissionsForGuild(guild: IGuild) = ???

  def addRole(role: IRole) = ???

  def getShard = ???

  def copy() = ???

  def getClient: DiscordClient = user.getClient.toWrappedClient

  def getLongID = ???
}

object User {
  def apply(user: IUser): User = new User(user)
}
