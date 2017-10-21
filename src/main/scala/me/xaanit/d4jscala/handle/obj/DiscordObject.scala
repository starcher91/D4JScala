package me.xaanit.d4jscala.handle.obj

import sx.blah.discord.handle.obj.IDiscordObject

class DiscordObject[T](obj: IDiscordObject[T]){
   def getShard = ???

   def getClient = ???

   def copy() = ???

   def getLongID = ???
}

object DiscordObject {
  def apply[T](obj: IDiscordObject[T]): DiscordObject[T] = new DiscordObject[T](obj)
}
