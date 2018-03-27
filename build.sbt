scalaVersion := "2.11.8"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

libraryDependencies ++= Seq(
			"org.apache.kafka" % "kafka-streams" % "0.11.0.2",
			"org.apache.kafka" % "kafka-clients" % "0.11.0.2",
			"org.apache.spark" %% "spark-core" % "2.1.0",
  			"org.apache.spark" %% "spark-sql" % "2.1.0",
			"org.apache.spark" %% "spark-streaming-kafka" % "1.6.3",	
			"log4j" % "log4j" % "1.2.16")
