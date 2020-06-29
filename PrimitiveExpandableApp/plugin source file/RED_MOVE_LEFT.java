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

public class RED_MOVE_LEFT extends Plugin
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

     int x;
    
    public RED_MOVE_LEFT(GamePanel ORG)
    {
        super(ORG,"RED move(left)");     /*the string given in second argument will appear on the plugin button*/
    }

    public void OnLoad()
    {                   
        WorldSpace.RED.setText("RED");
    }    

    public void OnClick()
    {
        //This method is called everytime the plugin button is clicked
        x=WorldSpace.RED.getX();
        WorldSpace.RED.setLocation(x+=20,WorldSpace.RED.getY());
    }

    public void BeforeEnd()
    { 
        //This method is called before the main program exit.
    }

}
