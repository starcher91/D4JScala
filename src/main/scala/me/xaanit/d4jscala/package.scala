package me.xaanit

import me.xaanit.d4jscala.api.handle.obj._
import sx.blah.discord.api.{IDiscordClient, IShard}
import sx.blah.discord.handle.obj._

import scala.collection.JavaConverters
import scala.collection.JavaConverters._
import scala.collection.immutable.Nil
import scala.collection.mutable.ListBuffer

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
    def toWrappedState(): me.xaanit.d4jscala.api.handle.obj.VoiceState = VoiceState(state)
  }

  implicit class ConversionPresence(val presence: IPresence) extends AnyVal {
    def toWrappedPresence(): Presence = Presence(presence)
  }

  import java.util

  implicit class ConversionEnumSet[E <: Enum[E]](val set: util.EnumSet[E]) extends AnyVal {
    def toSet(): Set[E] = {
      val mutable: scala.collection.mutable.Set[E] = scala.collection.mutable.Set()
      set.forEach(r => mutable += r)
      mutable.toSet
    }
  }

  implicit class ConversionList[WrappedType, UnwrappedType](val list: util.List[UnwrappedType]) extends AnyVal {
    def toWrappedList(map: UnwrappedType => WrappedType): List[WrappedType] = {
      list.asScala.map(map).toList
    }
  }
  implicit class ConversionSet[T <: Enum[T]](val set: Set[T]) extends AnyVal {
    def toEnumSet(): util.EnumSet[T] = {
      util.EnumSet.copyOf(JavaConverters.setAsJavaSet(set))
    }

    def toJavaSet(): util.Set[T] = {
      val javaSet: util.Set[T] = new util.HashSet[T]()
      set.foreach(javaSet.add)
      javaSet
    }
  }


}

