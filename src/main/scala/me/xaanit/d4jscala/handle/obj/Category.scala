package me.xaanit.d4jscala.handle.obj

import java.util

import sx.blah.discord.handle.obj.{ICategory, IRole, IUser, Permissions}
import me.xaanit.d4jscala._

class Category(category: ICategory) {
  def getGuild: Guild = category.getGuild.toWrappedGuild

  def getName = ???

  def delete() = ???

  def isDeleted = ???

  def getUserOverrides = ???

  def isNSFW = ???

  def getModifiedPermissions(user: IUser) = ???

  def getModifiedPermissions(role: IRole) = ???

  def getRoleOverrides = ???

  def changeNSFW(isNSFW: Boolean) = ???

  def removePermissionsOverride(user: IUser) = ???

  def removePermissionsOverride(role: IRole) = ???

  def changeName(name: String) = ???

  def getPosition = ???

  def changePosition(position: Int) = ???

  def getChannels = ???

  def RolePermissions(role: IRole, toAdd: util.EnumSet[Permissions], toRemove: util.EnumSet[Permissions]) = ???

  def UserPermissions(user: IUser, toAdd: util.EnumSet[Permissions], toRemove: util.EnumSet[Permissions]) = ???

  def getShard = ???

  def copy() = ???

  def getClient = ???

  def getLongID = ???
}

object Category {
  def apply(category: ICategory): Category = new Category(category)
}
