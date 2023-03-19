ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "3.2.2"

lazy val canoeVersion = "0.6.0"
lazy val logbackVersion = "1.4.5"

lazy val root = (project in file(".")).settings(
  name := "fun-with-cats",
  libraryDependencies ++= Seq(
    // canoe
    "org.augustjune" %% "canoe" % canoeVersion,
    "ch.qos.logback" % "logback-classic" % logbackVersion
  )
)
