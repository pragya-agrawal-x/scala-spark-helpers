name := "scala-spark-helpers"

version := "1.0.0"

scalaVersion := "2.10.7"

val sparkVersion = "1.6.3"

// Spark Library
libraryDependencies += "org.apache.spark" %% "spark-core" % sparkVersion excludeAll
  ExclusionRule(organization = "org.eclipse.jetty")
libraryDependencies += "org.apache.spark" %% "spark-sql" % sparkVersion

// Source and Sink Library
libraryDependencies += "com.databricks" %% "spark-csv" % "1.3.0"
libraryDependencies += "com.datashop" %% "spark-avro" % "2.1.1"

libraryDependencies += "org.mongodb" %% "casbah" % "3.1.1"

libraryDependencies += "org.elasticsearch" %% "elasticsearch-spark-13" % "5.6.16" excludeAll
  ExclusionRule(organization = "org.apache.spark")

// Scala Unit Test Library
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0"

// Assembly Setting
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

