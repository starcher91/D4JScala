package me.xaanit

import me.xaanit.d4jscala.api.internal.Converter
import me.xaanit.d4jscala.handle.obj._
import sx.blah.discord.handle.obj._

package object d4jscala {

  implicit class ConverisionUser(val user: IUser) extends AnyVal with Converter {
    override def convert(): User = User(user)
  }

  implicit class Conversionmessage(val message: IMessage) extends AnyVal with Converter {
    override def convert(): Message = Message(message)
  }

  implicit class

}

