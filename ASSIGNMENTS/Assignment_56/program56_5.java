import java.util.*;
import java.io.*;

class program56_5
{
    public static void main(String A[]) throws Exception
    {
        String FolderName = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Directory : ");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder is present");
            String fArr[] = fobj.list();

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("Name of the files in this directory are : "+(String)(fArr[i]));
            }
        }
        else
        {
            System.out.println("There is no such element");
        }


    }
}