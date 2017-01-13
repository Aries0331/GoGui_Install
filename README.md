# GoGui_Install   

The gogui-1.4.9 folder has included all the files you needed to install GoGui   
Since GoGui has not been maintain for a long time, a lot of problems will be caused while install   
This is aimed to help.   

First clone the repository   
Then change the directory to gogui-1.4.9   
run $ ant gogui.app -Ddocbook-xsl.dir=docbook-xsl-1.76.1/ -Ddocbook.dtd-4.2=docbook-xml-4.2/docbookx.dtd   
    
Then you may cross some errors when compile, something like 
#######################   
BUILD FAILED   
/Users/Aries/Downloads/gogui-1.4.9/build.xml:376: Execute failed: java.io.IOException: Cannot run program "/Developer/Tools/SetFile" (in directory "/Users/Aries/Downloads/gogui-1.4.9"): error=2, No such file or directory
	at java.lang.ProcessBuilder.start(ProcessBuilder.java:1048)
	at java.lang.Runtime.exec(Runtime.java:620)
	at org.apache.tools.ant.taskdefs.launcher.Java13CommandLauncher.exec(Java13CommandLauncher.java:58)
	at org.apache.tools.ant.taskdefs.Execute.launch(Execute.java:426)
	at org.apache.tools.ant.taskdefs.Execute.execute(Execute.java:440)
	at org.apache.tools.ant.taskdefs.ExecTask.runExecute(ExecTask.java:629)
	at org.apache.tools.ant.taskdefs.ExecTask.runExec(ExecTask.java:670)
	at org.apache.tools.ant.taskdefs.ExecTask.execute(ExecTask.java:496)
	at org.apache.tools.ant.UnknownElement.execute(UnknownElement.java:293)
	at sun.reflect.GeneratedMethodAccessor4.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at org.apache.tools.ant.dispatch.DispatchUtils.execute(DispatchUtils.java:106)
	at org.apache.tools.ant.Task.perform(Task.java:348)
	at org.apache.tools.ant.Target.execute(Target.java:435)
	at org.apache.tools.ant.Target.performTasks(Target.java:456)
	at org.apache.tools.ant.Project.executeSortedTargets(Project.java:1405)
	at org.apache.tools.ant.Project.executeTarget(Project.java:1376)
	at org.apache.tools.ant.helper.DefaultExecutor.executeTargets(DefaultExecutor.java:41)
	at org.apache.tools.ant.Project.executeTargets(Project.java:1260)
	at org.apache.tools.ant.Main.runBuild(Main.java:857)
	at org.apache.tools.ant.Main.startAnt(Main.java:236)
	at org.apache.tools.ant.launch.Launcher.run(Launcher.java:287)
	at org.apache.tools.ant.launch.Launcher.main(Launcher.java:113)
Caused by: java.io.IOException: error=2, No such file or directory
	at java.lang.UNIXProcess.forkAndExec(Native Method)
	at java.lang.UNIXProcess.<init>(UNIXProcess.java:248)
	at java.lang.ProcessImpl.start(ProcessImpl.java:134)
	at java.lang.ProcessBuilder.start(ProcessBuilder.java:1029)
	... 23 more
############################   
   
  what to do is:   
  open build.xml file and change line 27 to "<property name="osx.setfile" value="SetFile"/>"      
  save it and run the command again then it should works    
  you will see "BUILD SUCCESSFUL"   
    
  Finally, go to folder gogui-1.4.9/gogui/build, double click on GoGui    
  Congratulations!    

  BTW when you run GoGui, it may ask you to install java,    
  here is the link for mac https://support.apple.com/kb/DL1572?locale=zh_CN       
  
  
  
  
  Reference:   
  https://sourceforge.net/p/gogui/bugs/28/   
  http://blog.csdn.net/mosenyang/article/details/50856473
