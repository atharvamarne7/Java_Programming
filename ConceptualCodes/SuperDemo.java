class Hello
{
     public int i;

     public Hello(int no)
     {
        System.out.println("Inside Hello constructor");
        this.i = no+1;
     }
      public void Display()
    {
     
        System.out.println("Inside Hello display");
    }
}

class Demo extends Hello
{
    public int i;
   
    public Demo(int a)
    {
        super(a);                                        //first use
        System.out.println("Inside Demo constuctor");
        this.i = a;                                                
    }
   
    
    public void Display()
    {
        int i = 0;
        System.out.println("Inside Hello display"+this.i);
        System.out.println("Inside display"+i);  
        System.out.println("Inside display"+super.i);   
        super.Display();                                     //third use

    }
}


class SuperDemo
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(51);
        dobj.Display();
        
    }
}