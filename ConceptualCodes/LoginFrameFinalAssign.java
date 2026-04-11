import javax.swing.*;
import java.awt.event.*;


class MarvellousLogin implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton bobj1;
    JButton bobj2;
    JButton bobj3;
    JButton bobj4;
    JTextField tobj1;
    JTextField tobj2;
    JPasswordField pobj;
    JLabel Userlabel1, Userlabel2, Resultlabel;

    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);
        

        Userlabel1 = new JLabel("Number 1");
        Userlabel1.setBounds(50,50,100,30);

        tobj1 = new JTextField();
        tobj1.setBounds(150,50,150,30);

        Userlabel2 = new JLabel("Number 2");
        Userlabel2.setBounds(50,100,100,30);

        tobj2 = new JTextField();
        tobj2.setBounds(150,100,150,30);

        bobj1 = new JButton("+");
        bobj1.setBounds(50,150,50,30);

        bobj2 = new JButton("-");
        bobj2.setBounds(120,150,50,30);

        bobj3 = new JButton("*");
        bobj3.setBounds(190,150,50,30);

        bobj4 = new JButton("/");
        bobj4.setBounds(260 ,150,50,30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(Userlabel1);
        fobj.add(Userlabel2);
        fobj.add(Resultlabel);

        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        int num1 = Integer.parseInt(tobj1.getText());
        int num = Integer.parseInt(tobj2.getText());

        if((num1==10) && (num == 1))
        {
            Resultlabel.setText("Result is: 11");
        }
        else
        {
            Resultlabel.setText("Result invalid");
        }
    }
}

class LoginFrameFinalAssign
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Login",400,300);
    }
}