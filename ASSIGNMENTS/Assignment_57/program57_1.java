import java.util.*;
import java.io.*;

class program57_1
{
    public static void main(String A[])  throws Exception
    {

        Scanner sobj = new Scanner(System.in);

        String FileName1 = null;
        String FileName2 = null;

        System.out.println("Enter the name of Source file");
        FileName1= sobj.nextLine();

        System.out.println("Enter the name of Destination file");
        FileName2= sobj.nextLine();

        File src = new File(FileName1);
        File dest = new File(FileName2);

        if(!src.exists())
        {
            System.out.println("Source file does not exists ");
            return;
        }

        FileReader frobj = new FileReader(src); 
        FileWriter fwobj = new FileWriter(dest); 

        int ch ;
        while((ch = frobj.read()) != -1)
        {
            fwobj.write(ch);
        }

        frobj.close();
        fwobj.close();
        sobj.close();

        System.out.println("File copied successfully");
        

    }
}