/*
Name: FileToolBox Program -- DoesFileExist
Author: Stephen Williams
Date: March 4, 2020
Synopsis:  examples of file processing
*/
package filetoolbox;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author pupil
 */
public class DoesFileExist {
    
    public void test(String myfile) {
      
      try
      {
         File temp = File.createTempFile(myfile);
          
         boolean exists = temp.exists();
          
         System.out.println("Temp file exists : " + exists);
      } catch (IOException e)
      {
         System.out.println("error in catch in DoesFileExist");
      }    
    }

    
}
