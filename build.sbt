lazy val root = project
  .in(file("."))
  .settings(
    scalaVersion := "2.12.8",
    logLevel := Level.Debug,
    incOptions := incOptions.value.withApiDebug(true).withRelationsDebug(true)
  )
