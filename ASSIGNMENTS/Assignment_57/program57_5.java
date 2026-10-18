import java.util.*;
import java.io.*;

class program57_3
{
    public static void main(String A[])  throws Exception
    {

        Scanner sobj = new Scanner(System.in);

        String DirName = null;
        

        System.out.println("Enter the name of Directory");
        DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.isDirectory())
        {
           File fArr[] = fobj.listFiles();
           
           for(int i = 0; i <fArr.length; i++)
           {
            System.out.println("File Name : " +fArr[i].getName() + "File Size : " +fArr[i].length());
           }
        }
        else
        {
              System.out.println("Invalid Directory");
        }
       
        sobj.close();
        
    }
}