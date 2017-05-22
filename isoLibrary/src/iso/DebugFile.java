/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package iso;


import java.io.File;
import java.io.FileOutputStream;

/**
 *
 * @author D115970
 */
public class DebugFile
{
   private String file_name;
   public void setFileName(String file_name)
   {
       this.file_name=file_name;
   }
   public String getFileName()
   {
       return this.file_name;
   }
   public void Write(String msg)
   {
        File arquivo;
        strFunc str1 = new strFunc();
        msg = str1.dateFormat("dd-MM-yyyy HH:mm:ss.SSS ")+msg+"\r\n";
        if (this.file_name == null)
            this.setFileName("./dbg/DBG-"+str1.dateFormat("yyyy-MM-dd")+".DBG");
        if (IsoGlobalVars.debug_level==2)
              System.out.print(msg);
        arquivo = new File( this.getFileName() );   
        try 
          {   
           FileOutputStream fos = new FileOutputStream(arquivo,true);      
           fos.write(msg.getBytes());  
           fos.close();
    	  }
    	catch(java.io.IOException exc) 
    	{ 
    	  System.out.println(exc.toString());
    	} 
        
     }


}
