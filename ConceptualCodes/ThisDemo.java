
class Demo
{
    public int i;
    public static int j;

    static
    {
        j = 21;
    }
    public Demo()
    {   
        System.out.println("Inside default");
        this.i = 11;                                 //first use
    }
    public Demo(int a)
    {
        this();                                        //Second use
        System.out.println("Inside parameterised");
    }
    public void Display()
    {
        System.out.println("Inside display"+this.i);               //third use
    }
}


class ThisDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
    }
}