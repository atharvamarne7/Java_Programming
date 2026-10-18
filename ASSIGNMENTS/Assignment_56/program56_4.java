import java.util.*;
import java.io.*;

class program56_4
{
    public static void main(String A[]) throws Exception
    {
        String FileName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.createNewFile())
        {
            System.out.println("File Successfully created...");
        }
        else
        {
            System.out.println("File already exist!");
            
        }
       
        sobj.close();
    }
}