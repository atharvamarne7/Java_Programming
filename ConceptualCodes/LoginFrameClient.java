import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JLabel Userlabel, Resultlabel;

    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);
        

        Userlabel = new JLabel("Message");
        Userlabel.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30);

        bobj = new JButton("SEND");
        bobj.setBounds(150,150,100,30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(Userlabel);
        fobj.add(Resultlabel);

        bobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
         String uname = tobj.getText();

        if((uname.equals("hello")))
        {
            Resultlabel.setText("Server says : hi");
        }
       
    }
}

class LoginFrameClient
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Client",400,300);




        Socket sobj = new Socket();
        
    }
}