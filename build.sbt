name := "miwa-possystem"

version := "1.0"

lazy val `miwa-possytem` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq( javaJdbc , javaEbean , cache , javaWs )

libraryDependencies += "com.mashape.unirest" % "unirest-java" % "1.4.7"

libraryDependencies += "commons-net" % "commons-net" % "3.3"

libraryDependencies += "com.rabbitmq" % "amqp-client" % "3.5.6"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  