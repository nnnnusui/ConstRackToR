name := "ConstRackToR"

version := "0.1"

scalaVersion := "2.13.1"

val javaFXVersion = "12.0.2"
val scalaFXVersion = s"$javaFXVersion-R18"
libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafx" % scalaFXVersion
 ,"org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
 ,"com.beachape" %% "enumeratum" % "1.5.13"
)

// Determine OS version of JavaFX binaries
lazy val osName = System.getProperty("os.name") match {
  case n if n.startsWith("Linux")   => "linux"
  case n if n.startsWith("Mac")     => "mac"
  case n if n.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
}
// Add dependency on JavaFX libraries, OS dependent
lazy val javaFXModules = Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
libraryDependencies ++= javaFXModules.map( m =>
  "org.openjfx" % s"javafx-$m" % javaFXVersion classifier osName
)