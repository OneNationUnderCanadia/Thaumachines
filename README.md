Thaumachines
============

Repository for Minecraft mod I am making for a final project

To run, you will need:

An IDE (Eclipse or IntelliJ IDEA):
https://www.jetbrains.com/idea/download/
http://www.eclipse.org/downloads/?

Minecraft Forge 1.7.10-10.13.2.1230:
http://files.minecraftforge.net/

Thaumcraft 4.2.0.0:
http://www.curse.com/mc-mods/minecraft/223628-thaumcraft/2212317

CodeChickenCore 1.7.10-1.0.1.8:
http://www.curse.com/mc-mods/minecraft/222213-codechickencore/2207568


Create a folder called "Thaumachines" anywhere on your computer.
Place all of the files from Forge into it.
Download the files from this github, and move them to the same folder.
Navigate a command line to your "Thaumachines" folder.
Run "gradlew tasks" with this command line to ensure gradle is working properly.  It should come up with a list of options.  This may take a minute.
Assuming it works properly, run "gradlew setupDecompWorkspace".  This will also take a bit.
After that, run either "gradlew idea" or "gradlew eclipse" depending on which IDE you'd rather use.  Again, this may take a couple minutes.
Once that is complete, you should be able to find a file in Thaumachines that is marked as a project for IDEA or Eclipse.  Run that file.
Once your IDE starts, near the "run" button select "Minecraft client".
Run, then close Minecraft.
Find the folder in Thaumachines where your data is being stored (by default, they are in "Thaumachines/eclipse").
From there, navigate to a folder called "mods".
Place Thaumcraft and CodeChickenCore into it.
Hit run in your IDE.
Play Minecraft with Thaumcraft and Thaumachines!
