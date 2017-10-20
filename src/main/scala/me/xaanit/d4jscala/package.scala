package me.xaanit

import me.xaanit.d4jscala.handle.obj._
import sx.blah.discord.handle.obj._

import scala.collection.mutable.ListBuffer

package object d4jscala {

  implicit class ConverisionUser(val user: IUser) extends AnyVal  {
     def toWrappedUser(): User = User(user)
  }

  implicit class ConversionMessage(val message: IMessage) extends AnyVal  {
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

  implicit class ListFunctions[T](val list: java.util.List[T]) extends AnyVal  {
     def toImmutableList(): List[T] = {
      val converted: ListBuffer[T] = new ListBuffer[T]()
      for(i <- list) converted += i
      converted.toList
    }
  }

}

