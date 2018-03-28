scalaVersion := "2.11.8"

// grading libraries
libraryDependencies += "junit" % "junit" % "4.10" % Test
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.2",
  "org.apache.spark" %% "spark-sql" % "1.5.2",
"org.apache.spark" %% "spark-streaming" % "1.5.2",
"org.apache.spark" %% "spark-streaming-kafka" % "1.6.3",
"org.apache.bahir" %% "spark-streaming-twitter" % "2.0.0",
"log4j" % "log4j" % "1.2.16"
)

