import java.util.*;
import java.io.*;

class program57_3
{
    public static void main(String A[])  throws Exception
    {

        Scanner sobj = new Scanner(System.in);

        String DirectoryName = null;
        

        System.out.println("Enter the name of Directory");
        DirectoryName = sobj.nextLine();

        File fobj = new File(DirectoryName);

        if(fobj.mkdir())
        {
           System.out.println("Directory created successfully"); 
        }
        else
        {
              System.out.println("Directory already exists or cannot be created");
        }
       
        sobj.close();
        
    }
}