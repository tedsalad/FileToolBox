/*
Name: FileToolBox Program -- CreateNewFile
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
public class CreateNewFile {


    
    public void test() throws IOException {
       try {
         File file = new File("F:\\dogcatcher.txt");
         
         if(file.createNewFile())  System.out.println("Success!");
         else System.out.println ("Error, file already exists.");
      }
      catch(IOException e) {
         System.out.println(e);
      } 
    }   
}




/*

public class Main {
   public static void main(String[] args) {
      try {
         File file = new File("C:/myfile.txt");
         
         if(file.createNewFile())System.out.println("Success!");
         else System.out.println ("Error, file already exists.");
      }
      catch(IOException ioe) {
         ioe.printStackTrace();
      }
   }
}



*/