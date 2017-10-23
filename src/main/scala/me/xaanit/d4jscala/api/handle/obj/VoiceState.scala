package me.xaanit.d4jscala.api.handle.obj

import sx.blah.discord.handle.obj.IVoiceState

class VoiceState(state: IVoiceState) extends IDLinkedObject(state) {
  def isSelfMuted = ???

  def getGuild = ???

  def isSuppressed = ???

  def getUser = ???

  def isDeafened = ???

  def getChannel = ???

  def isSelfDeafened = ???

  def getSessionID = ???

  def isMuted = ???
}

object VoiceState {
  def apply(state: IVoiceState): VoiceState = new VoiceState(state)
}
