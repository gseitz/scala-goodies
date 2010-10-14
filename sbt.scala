//SBT #Protip by @jorgeortiz85
//Runs a given class with the provided arguments. E.g., run-class com.foo.bar.Baz arg0 arg1 ... argN
lazy val runClass = task { args => runTask(args.firstOption,runClasspath,args.drop(1).force) dependsOn(compile,copyResources) }

// Boots the akka kernel
val bootAkka = runTask("se.scalablesolutions.akka.kernel.Main") describedAs "Boot an Akka MicroKernel"

