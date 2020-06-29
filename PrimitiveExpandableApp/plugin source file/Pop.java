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
import java.awt.Dimension;

public class Pop extends Plugin
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

    Dimension org,New;
    int i=0;
    public Pop(GamePanel ORG)
    {
        super(ORG,"POP");     /*the string given in second argument will appear on the plugin button*/
        org=WorldSpace.RED.getSize();
        New = new Dimension(90,90);
    }

    public void OnLoad()
    {   
      //This method is called when the program is being loaded
    }    

    public void OnClick()
    {
        //This method is called everytime the plugin button is clicked
         WorldSpace.RED.setSize(i == 0? New : org);
        WorldSpace.GREEN.setSize(i == 1? New : org);
        WorldSpace.BLUE.setSize(i == 2? New : org);
        WorldSpace.BLACK.setSize(i == 3? New : org);
        i++;
        if(i==4) i=0;
          
    }

    public void BeforeEnd()
    { 
        //This method is called before the main program exit.
    }

}
