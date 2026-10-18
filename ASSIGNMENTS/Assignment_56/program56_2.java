import java.io.*;
import java.util.*;

class program56_2
{
    public static void main(String A[]) throws Exception
    {
        int ch = 0;
        String FileName = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        FileReader frobj = new FileReader(FileName);

        while((ch = frobj.read()) != -1)
        {
            System.out.print((char)ch);
        }

        frobj.close();
        sobj.close();
    }
}