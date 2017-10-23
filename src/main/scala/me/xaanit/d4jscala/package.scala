package me.xaanit

import java.util

import me.xaanit.d4jscala.api.DiscordClient
import me.xaanit.d4jscala.api.handle.obj._
import sx.blah.discord.api.{IDiscordClient, IShard}
import sx.blah.discord.handle.obj._

package object d4jscala {

  implicit class ConverisionUser(val user: IUser) extends AnyVal {
    def toWrappedUser(): User = User(user)
  }

  implicit class ConversionMessage(val message: IMessage) extends AnyVal {
    def toWrappedMessage(): Message = Message(message)
  }

  implicit class ConversionVoiceChannel(val channel: IVoiceChannel) extends AnyVal {
    def toWrappedChannel(): VoiceChannel = VoiceChannel(channel)
  }

  implicit class ConversionGuild(val guild: IGuild) extends AnyVal {
    def toWrappedGuild(): Guild = Guild(guild)
  }

  implicit class ConversionCategory(val category: ICategory) extends AnyVal {
    def toWrappedCategory(): Category = Category(category)
  }

  implicit class ConversionRole(val role: IRole) extends AnyVal {
    def toWrappedRole(): Role = Role(role)
  }

  implicit class ConversionRegion(val region: IRegion) extends AnyVal {
    def toWrappedRegion(): Region = Region(region)
  }

  implicit class ConversionChannel(val channel: IChannel) extends AnyVal {
    def toWrappedChannel(): Channel = Channel(channel)
  }

  implicit class ConversionPrivateChannel(val channel: IPrivateChannel) extends AnyVal {
    def toWrappedChannel(): PrivateChannel = PrivateChannel(channel)
  }

  implicit class ConversionInvite(val invite: IInvite) extends AnyVal {
    def toWrappedInvite(): Invite = Invite(invite)
  }

  implicit class ConversionShard(val shard: IShard) extends AnyVal {
    def toWrappedShard(): Shard = Shard(shard)
  }

  implicit class ConversionExtendedInvite(val invite: IExtendedInvite) extends AnyVal {
    def toWrappedInvite(): ExtendedInvite = ExtendedInvite(invite)
  }

  implicit class ConversionPermissionOverride(val over: PermissionOverride) extends AnyVal {
    def toWrappedOverride(): PermissionsOverride = new PermissionsOverride(over.allow().toSet, over.deny.toSet, over.getLongID)
  }

  implicit class ConversionClient(val client: IDiscordClient) extends AnyVal {
   def toWrappedClient(): api.DiscordClient = new api.DiscordClient(client)
  }
  implicit class ConversionVoiceState(val state: IVoiceState) extends AnyVal {
    def toWrappedState(): VoiceState = VoiceState(state)
  }

  import java.util
  implicit class ConversionEnumSet[T](val set: util.EnumSet[T]) extends AnyVal {
    def toSet(): Set[T] = {
      val mutable: scala.collection.mutable.Set[T] = scala.collection.mutable.Set()
      for(t <- set) mutable += t
      mutable.toSet
    }
  }

}

