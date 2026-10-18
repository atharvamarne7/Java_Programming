import java.io.*;
import java.util.*;

class program56_3
{
    public static void main(String A[]) throws Exception
    {
        int ch = 0;
        String FileName = null;
        String data = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file : ");
        FileName = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName,true);

        System.out.println("Enter the data that you want write : ");
        data = sobj.nextLine();

        fwobj.write(data);
        fwobj.write("\n");

        fwobj.close();
        sobj.close();
    }
}