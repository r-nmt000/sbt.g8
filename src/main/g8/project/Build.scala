import sbt._
import sbt.Keys._

object ProjectBuild extends Build {

  lazy val root = Project(
    id = "root",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scala_version$",
      libraryDependencies ++= Seq(
        // test
        "org.specs2" %% "specs2" % "2.3.6" % "test",
            
        //log
        "org.clapper" %% "grizzled-slf4j" % latest.integration,
        "ch.qos.logback" % "logback-classic" % latest.integration
      )
      // add other settings here
    )
  )
}
