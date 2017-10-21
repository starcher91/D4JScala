package me.xaanit.d4jscala.api.handle.obj

import sx.blah.discord.handle.obj.IRegion

class Region(region: IRegion) {
  def getName = ???

  def getID = ???

  def isVIPOnly = ???
}

object Region {
  def apply(region: IRegion): Region = new Region(region)
}
