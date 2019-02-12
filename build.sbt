lazy val root = project
  .in(file("."))
  .settings(
    fileTreeViewConfig := FileTreeViewConfig.sbt1_2_compat(pollInterval.value, watchAntiEntropy.value),
    scalaVersion := "2.12.8"
  )
