package me.xaanit.d4jscala.api.handle.obj

import java.awt.Color
import java.util

import me.xaanit.d4jscala._
import me.xaanit.d4jscala.util.Queue
import sx.blah.discord.handle.obj.{IRole, Permissions}

class Role(private[api] val role: IRole) {
  def getGuild: Guild = role.getGuild.toWrappedGuild

  def getName: String = role.getName

  def changeColor(color: Color): Queue[Unit] = Queue(() => role.changeColor(color))

  def changeMentionable(isMentionable: Boolean): Queue[Unit] = Queue(() => role.changeMentionable(isMentionable))

  def delete(): Queue[Unit] = Queue(() => role.delete())

  def changeHoist(hoist: Boolean): Queue[Unit] = Queue(() => role.changeHoist(hoist))

  def mention(): String = role.mention()

  def isDeleted: Boolean = role.isDeleted

  def isHoisted: Boolean = role.isHoisted

  def changePermissions(permissions: Set[Permissions]): Queue[Unit] = Queue(() => role.changePermissions(permissions.toEnumSet))

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
