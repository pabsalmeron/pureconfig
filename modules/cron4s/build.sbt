import Dependencies.Version._

name := "pureconfig-cron4s"

crossScalaVersions := Seq(scala212, scala213)

libraryDependencies += "com.github.alonsodomin.cron4s" %% "cron4s-core" % "0.6.1"

developers := List(
  Developer("bardurdam", "Bárður Viberg Dam", "bardurdam@gmail.com", url("https://github.com/bardurdam"))
)

osgiSettings

OsgiKeys.exportPackage := Seq("pureconfig.module.cron4s.*")
OsgiKeys.privatePackage := Seq()
OsgiKeys.importPackage := Seq(
  s"""scala.*;version="[${scalaBinaryVersion.value}.0,${scalaBinaryVersion.value}.50)"""",
  "*"
)
