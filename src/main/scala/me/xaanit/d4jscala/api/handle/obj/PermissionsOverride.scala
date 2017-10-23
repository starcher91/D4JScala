package me.xaanit.d4jscala.api.handle.obj

import sx.blah.discord.handle.obj.Permissions

class PermissionsOverride(val allow: Set[Permissions], val deny: Set[Permissions], val id: Long) {

  override def equals(obj: scala.Any): Boolean = {
    obj match {
      case over: PermissionsOverride => over.allow == allow && over.deny == deny
      case _ => false
    }
  }
}

object PermissionsOverride {
  def apply(allow: Set[Permissions], deny: Set[Permissions], id: Long): PermissionsOverride = new PermissionsOverride(allow, deny, id)
}