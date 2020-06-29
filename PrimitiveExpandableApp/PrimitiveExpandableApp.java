import javax.swing.*;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.lang.reflect.*;
import java.awt.event.*;
import bin.GamePanel;
import bin.Element;
import java.io.File;
import java.io.IOException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;  

class PrimitiveExpandableApp
{
    JPanel WorldSpace;
    JPanel Tools;
//    public Element RED, GREEN, BLUE, BLACK;

    PrimitiveExpandableApp()
    {
        JFrame f= new JFrame("Main Application");
        f.setSize(600,500);
        f.setLayout(new GridLayout(2,1,10,10));

        Tools = new JPanel(new FlowLayout());
        WorldSpace = new GamePanel();

        WorldSpace.setBackground(new Color(228,228,190));
        WorldSpace.setLayout(null);
     

        f.add(Tools);
        f.add(WorldSpace);
        
        //LOAD LPUGIN---------------------------------------------------------------------
        File modFILE =new File("./DataFile");
        String[] fileNames = modFILE.list();
        Object[] MODlist = new Object[fileNames.length];  
        Method[] MODmethod = new Method[fileNames.length];
        int i=0;
        for(String file:fileNames)          
        {
                int pos = file.lastIndexOf(".");
                if (pos > 0) 
                    file= file.substring(0, pos);            
        
                try 
                {
                    Class cls = Class.forName("DataFile."+file);
                    
                    Method m[] =new Method[4];
                    m[0] = cls.getMethod("OnLoad");            
                    m[1] = cls.getMethod("OnClick");
                    m[2] = cls.getMethod("BeforeEnd");
                    m[3] = cls.getMethod("getName");
        
                    Constructor c[] = cls.getDeclaredConstructors();
                    Object MODclass = c[0].newInstance(WorldSpace);                
                    m[0].invoke(MODclass);

                    MODlist[i]=MODclass;
                    MODmethod[i]=m[2];
                   
                    JButton btn;
                     btn=new JButton(m[3].invoke(MODclass).toString());
                     btn.addActionListener(
                                            new ActionListener()
                                            {   
                                                public void actionPerformed(ActionEvent e) 
                                                {try{m[1].invoke(MODclass);}catch(Exception ex){}}  
                                            }
                                          );
                    Tools.add(btn);
                                                                                                                                        
                }
                catch(Exception e){ System.out.println(e);  }
                i++;
        }
        //---PLUGINS LOADED----------------------------------------------------
        //--Before Closing application-----------------------------------------
        f.addWindowListener(new WindowAdapter() 
                    {
                      public void windowClosing(WindowEvent we) 
                      {
                        int i=0;
                        for(Method md:MODmethod)
                        {
                            try{
                                 md.invoke(MODlist[i++]);
                            }catch(Exception ex){}
                        }
                        System.exit(0);
                      }
                    });
        //---------------------------------------------------------------------
        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String a[])
    {   new PrimitiveExpandableApp();   }
}
