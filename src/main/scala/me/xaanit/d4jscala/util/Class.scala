package me.xaanit.d4jscala.util

import sx.blah.discord.api.events.EventSubscriber
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent
import sx.blah.discord.handle.obj.{IChannel, IMessage}
import sx.blah.discord.util.RequestBuffer.IRequest

class Class {


  def main(args: Array[String]): Unit = {

  }


  @EventSubscriber
  def handle(event: MessageReceivedEvent): Unit = {
    if (event.getMessage.getContent.equals("!ping")) {

    }
  }

  def sendMessage(channel: IChannel, content: String): Queue[IMessage] = {
    new Queue[IMessage](irequest = Option.apply((new IRequest[IMessage] {() => channel.sendMessage(content)}))
  }
}
