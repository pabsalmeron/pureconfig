import Utilities._

name := "pureconfig-cats-effect"

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-effect" % forScalaVersions { case (2, 11) => "2.0.0"; case _ => "2.3.0" }.value
)

developers := List(Developer("keirlawson", "Keir Lawson", "keirlawson@gmail.com", url("https://github.com/keirlawson")))

osgiSettings

OsgiKeys.exportPackage := Seq("pureconfig.module.catseffect.*")
OsgiKeys.privatePackage := Seq()
OsgiKeys.importPackage := Seq(
  s"""scala.*;version="[${scalaBinaryVersion.value}.0,${scalaBinaryVersion.value}.50)"""",
  "*"
)
