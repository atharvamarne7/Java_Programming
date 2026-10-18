import java.util.*;
import java.io.*;

class program57_2
{
    public static void main(String A[])  throws Exception
    {

        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        

        System.out.println("Enter the name of File ");
        FileName= sobj.nextLine();

        File fobj = new File(FileName);

        if((fobj.exists()) && (fobj.isFile()))
        {
            System.out.println("It is a regular file");
        }
        else
        {
            System.out.println("It is not a regular file");
        }
       

    }
}