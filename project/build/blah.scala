import sbt._

class MyProject( info: ProjectInfo ) extends DefaultProject( info ) with AutoCompilerPlugins {

  val jsonlift = "net.liftweb" %% "lift-json" % "2.4-M4" withSources()
  val lift_json_ext = "net.liftweb" %% "lift-json-ext" % "2.4-M4" withSources()

}
