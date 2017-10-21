package me.xaanit.d4jscala.handle.obj

import sx.blah.discord.handle.obj.IIDLinkedObject

class IDLinkedObject(obj: IIDLinkedObject) {
  def getLongID = ???
}

object IDLinkedObject {
  def apply(obj: IIDLinkedObject): IDLinkedObject = new IDLinkedObject(obj)
}
