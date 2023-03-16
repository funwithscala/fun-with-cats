ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "3.2.2"

lazy val catsVersion = "3.4.8"

lazy val root = (project in file(".")).settings(
  name := "fun-with-cats",
  libraryDependencies ++= Seq(
    // "core" module - IO, IOApp, schedulers
    // This pulls in the kernel and std modules automatically.
    "org.typelevel" %% "cats-effect"        % catsVersion,
    // concurrency abstractions and primitives (Concurrent, Sync, Async etc.)
    "org.typelevel" %% "cats-effect-kernel" % catsVersion,
    // standard "effect" library (Queues, Console, Random etc.)
    "org.typelevel" %% "cats-effect-std"    % catsVersion
  )
)
