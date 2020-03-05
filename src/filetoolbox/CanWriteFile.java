/*
Name: FileToolBox Program -- CanWriteFile
Author: Stephen Williams
Date: March 4, 2020
Synopsis:  examples of file processing
*/
package filetoolbox;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author pupil
 */
public class CanWriteFile {
   
    public void test() throws IOException {


       String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";
     
        try (FileWriter fileWriter = new FileWriter("f:\\Dogcatcher_222.txt")) {
            fileWriter.write(fileContent);
            fileWriter.close();
        } catch(IOException e) {
            
            
        }
     }
     
     public void testAppend() throws FileNotFoundException, IOException {
        String textToAppend = "\r\n Happy !";
        try (FileOutputStream outputStream = new FileOutputStream("f:\\dogcatcher_222.txt", true)){
           byte[] strToBytes = textToAppend.getBytes();
           outputStream.write(strToBytes);
           System.out.println("the deed is done");
    
         }
     }
    

    
    
}
/*

public static void usingFileWriter() throws IOException 
{
    String fileContent = "Hello Learner !! Welcome to howtodoinjava.com.";
     
    FileWriter fileWriter = new FileWriter("c:/temp/samplefile2.txt");
    fileWriter.write(fileContent);
    fileWriter.close();
}


*/