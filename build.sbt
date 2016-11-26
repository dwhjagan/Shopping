name := "naiduplayproj"

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"


libraryDependencies ++= Seq(
  "org.assertj" % "assertj-core" % "3.0.0" % Test,
  "junit" % "junit" % "4.12" % Test,
  "org.specs2" %% "specs2-core" % "3.6.1" % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"