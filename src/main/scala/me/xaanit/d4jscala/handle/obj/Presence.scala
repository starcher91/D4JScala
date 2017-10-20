package me.xaanit.d4jscala.handle.obj

import sx.blah.discord.handle.obj.IPresence

class Presence(presence: IPresence) {
  def getStatus = ???

  def getPlayingText = ???

  def getStreamingUrl = ???

  def copy() = ???
}

object Presence {
  def apply(presence: IPresence): Presence = new Presence(presence)
}