public class overide {

    public  void m1(int i)
    {
        System.out.println("parent");
    }
    public static void main(String [] args)
    {
        child c=new child();
        c.m1();
    }

}
class child extends overide{
    public void m1(float j)
    {
        System.out.println("child");
    }

}


