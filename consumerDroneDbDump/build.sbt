name := "consumerDroneDbDump"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.kafka" %% "kafka" % "2.4.0"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.3" % Runtime
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.9.0"
