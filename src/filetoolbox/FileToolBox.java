/*
Name: FileToolBox Program
Author: Stephen Williams
Date: March 4, 2020
Synopsis:  examples of file processing
*/
package filetoolbox;
import java.io.File;
import java.io.IOException;

public class FileToolBox {

    public static void main(String[] args) throws IOException {
       
       CreateNewFile cnf = new CreateNewFile();
       DoesFileExist dfe = new DoesFileExist();
       CanWriteFile cwf = new CanWriteFile();
       //CanReadFile crf = new CanReadFile();
       //DeleteFile df = new DeleteFile();
       //FileLength fl = new FileLength();
       //GetFileAbsolutePath ap = new GetFileAbsolutePath();
       //ListFiles lf = new ListFiles();
       //SetFileName sfn = new SetFileName();
       
       //cnf.test();
       //dfe.test();
       cwf.testAppend();
       
       
        
    }
    
}
