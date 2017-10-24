package me.xaanit.d4jscala.api.handle.obj

import java.util

import com.koloboke.collect.set.LongSet
import com.koloboke.function.{LongObjConsumer, LongObjPredicate}
import sx.blah.discord.handle.obj._
import me.xaanit.d4jscala._
import me.xaanit.d4jscala.util.Queue
import sx.blah.discord.util.cache.LongMap

class Category(category: ICategory) {
  def getGuild: Guild = category.getGuild.toWrappedGuild

  def getName: String = category.getName

  def delete(): Queue[Unit] = Queue(() => category.delete)

  def isDeleted: Boolean = category.isDeleted

  def getUserOverrides: PermissionsOverride = {
    val over: LongMap[PermissionOverride] = category.getUserOverrides
    null
  }

  def isNSFW = ???

  def getModifiedPermissions(user: IUser): Set[Permissions] = ???

  def getModifiedPermissions(role: IRole): Set[Permissions] = ???

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
