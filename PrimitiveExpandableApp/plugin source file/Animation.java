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

public class Animation extends Plugin
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

      
    boolean on = false;
    public Animation(GamePanel ORG)
    {
        super(ORG,"Animation");     /*the string given in second argument will appear on the plugin button*/
    }

    public void OnLoad()
    {   
        new Thread()
        {
            int x,y;
            
            public void start()
            {
                super.start();
                x=WorldSpace.BLUE.getX();
                y=WorldSpace.BLUE.getY();
            }
            public void run()
            {
               while(true)
               {    
                   if(on)
                    {                 
                        if( x < 450 && y >= 140 )   x+=20;
                         else if ( x >= 450 && y > 50 )  y-=20;
                        else if ( x >10 && y <=50 ) x-=20;
                         else if ( x < 450 && y <= 140 ) y+=20;        
                        WorldSpace.BLUE.setLocation(x,y);
                        
                    }
//                 System.out.print(".");
                    try{sleep(90);}catch(Exception e){};
                }
            }
            
        }.start();
    }    

    public void OnClick()
    {
        on=!on;
        
    }

    public void BeforeEnd()
    { 
        //This method is called before the main program exit.
    }

}
