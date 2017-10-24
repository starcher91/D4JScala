package me.xaanit.d4jscala.api.handle.obj

import sx.blah.discord.handle.obj.IWebhook
import sx.blah.discord.util.Image

class Webhook(webhook: IWebhook) extends DiscordObject[IWebhook](webhook) {
  def getGuild = ???

  def getDefaultAvatar = ???

  def getAuthor = ???

  def delete() = ???

  def changeDefaultName(name: String) = ???

  def isDeleted = ???

  def getChannel = ???

  def changeDefaultAvatar(avatar: String) = ???

  def changeDefaultAvatar(avatar: Image) = ???

  def getToken = ???

  def getDefaultName = ???
}

object Webhook {
  def apply(webhook: IWebhook): Webhook = new Webhook(webhook)
}
