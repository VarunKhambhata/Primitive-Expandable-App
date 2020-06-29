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

public class RED_MOVE_DOWN extends Plugin
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


    int y;
    public RED_MOVE_DOWN(GamePanel ORG)
    {
        super(ORG,"RED move(down)");     /*the string given in second argument will appear on the plugin button*/
    }

    public void OnLoad()
    {   
        WorldSpace.RED.setText("RED");
    }    

    public void OnClick()
    {
        //This method is called everytime the plugin button is clicked
        y=WorldSpace.RED.getY();
        WorldSpace.RED.setLocation(WorldSpace.RED.getX(),y+=20);
    }

    public void BeforeEnd()
    { 
        //This method is called before the main program exit.
    }

}
