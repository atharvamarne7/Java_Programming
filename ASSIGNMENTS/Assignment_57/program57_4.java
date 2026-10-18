import java.util.*;
import java.io.*;

class program57_4
{
    public static void main(String A[])  throws Exception
    {

        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        

        System.out.println("Enter the name of file");
        FileName = sobj.nextLine();

        FileInputStream fiobj = new FileInputStream(FileName);

        int ch = 0;
        int checksum = 0;

        while((ch = fiobj.read()) != -1)
        {
            checksum = checksum + ch;
        }
       
        fiobj.close();
        sobj.close();

        System.out.println("Checksum of file is : " + checksum);    
        
    }
}