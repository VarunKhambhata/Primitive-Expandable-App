# Primitive-Expandable-App
A primitive application that can be expanded by creating java plugin file without changing the source code.


<h2>Content description</h2>

* **bin** - A directory containing class files that are shared bewteen plugins and main application

* **DataFiles** - A directory that contains compiled plugins that will be loaded in the main application

* **plugin source file** - A directory that contains source code of plugins

> * _**PrimitiveExpandableApp.class**_ - The main program

> * _**Element.java**_ - The source code of one of the file from **bin** directory

> * _**GamePanel.java**_ - The source code of one of the file from **bin** directory

> * _**TemplatePlugin.java**_ - A template for creating new plugins

<h2> Creating a new Plugin </h2>

* Copy and paste **TemplatePlugin.java** in the same directory.
  
  Rename the duplicate file to [Your Plugin Name].java, open the file and change the class & constructor name to [Your Plugin Name].

  After creating the new plugin compile the plugin with command as: _**" javac -d . [Your Plugin Name].java "**_
  
  (A new Plugin file will be added in DataFile directory)
  
<h2> Run the Program </h2>
  
  Start the program with command: _**" java PrimitiveExpandableApp "**_
