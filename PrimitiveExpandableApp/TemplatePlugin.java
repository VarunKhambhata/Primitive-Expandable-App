/*
This java file is only for reference to create a new plugin
To make a new Plugin 
- Copy and Paste this file. Rename the file name and the class name.
- Write teh program in this new file.

    * TO COMPILE THE PLUGIN PROGRAM *
    
   -make sure that new java file is in the same directory as TemplatePlugin.java file
   -compile using the command:-
                                "javac -d . [filename.java]"

*/

package DataFile;
import bin.*;

public class TemplatePlugin extends Plugin
{
    // WorldSpace is a global Object among all plugins.
    // WorldSpace represent the viewport in the main application windows
    // WorldSpace is extended from JPanel
    // WorldSpace has following member components:
    //                              WorldSpace.RED
    //                              WorldSpace.GREEN
    //                              WorldSpace.BLUE
    //                              WorldSpace.BLACK
    // These components are extended from JLabel
    // setPosition(int,int) and setSize(int,int) are added methods for these components

      
    
    public TemplatePlugin(GamePanel ORG)
    {
        super(ORG,"[plugin name]");     /*the string given in second argument will appear on the plugin button*/
    }

    public void OnLoad()
    {   
      //This method is called when the program is being loaded
    }    

    public void OnClick()
    {
        //This method is called everytime the plugin button is clicked
    }

    public void BeforeEnd()
    { 
        //This method is called before the main program exit.
    }

}
