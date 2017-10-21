package me.xaanit.d4jscala.api.handle.obj

import java.awt.Color
import java.util

import sx.blah.discord.handle.obj.{IRole, Permissions}

class Role(role: IRole) {
  def getGuild = ???

  def getName = ???

  def changeColor(color: Color) = ???

  def changeMentionable(isMentionable: Boolean) = ???

  def delete() = ???

  def changeHoist(hoist: Boolean) = ???

  def mention() = ???

  def isDeleted = ???

  def isHoisted = ???

  def changePermissions(permissions: util.EnumSet[Permissions]) = ???

  def edit(color: Color, hoist: Boolean, name: String, permissions: util.EnumSet[Permissions], isMentionable: Boolean) = ???

  def getPermissions = ???

  def isMentionable = ???

  def getColor = ???

  def isManaged = ???

  def changeName(name: String) = ???

  def getPosition = ???

  def isEveryoneRole = ???

  def getShard = ???

  def copy() = ???

  def getClient = ???

  def getLongID = ???
}

object Role {
  def apply(role: IRole): Role = new Role(role)
}
