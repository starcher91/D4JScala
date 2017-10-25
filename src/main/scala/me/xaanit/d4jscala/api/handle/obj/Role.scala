package me.xaanit.d4jscala.api.handle.obj

import java.awt.Color
import java.util

import me.xaanit.d4jscala._
import me.xaanit.d4jscala.api.DiscordClient
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

  def edit(color: Color, hoist: Boolean, name: String, permissions: Set[Permissions], isMentionable: Boolean): Queue[Unit] = Queue(() => role.edit(color, hoist, name, permissions.toEnumSet, isMentionable))

  def getPermissions: Set[Permissions] = role.getPermissions.toSet

  def isMentionable: Boolean = role.isMentionable

  def getColor: Color = role.getColor

  def isManaged: Boolean = role.isManaged

  def changeName(name: String): Queue[Unit] = Queue(() => role.changeName(name))

  def getPosition: Int = role.getPosition

  def isEveryoneRole: Boolean = role.isEveryoneRole

  def getShard: Shard = role.getShard.toWrappedShard

  def copy(): Role = role.copy.toWrappedRole

  def getClient: DiscordClient = role.getClient.toWrappedClient

  def getLongID: Long = role.getLongID
}

object Role {
  def apply(role: IRole): Role = new Role(role)
}
