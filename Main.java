package Assignment;

public class Main
{
    public static void main(String[] args)
    {
        Restaurant r = new Restaurant(4);
        Customer s = new Customer("1-",r);
        Customer s1 = new Customer("2--",r);
        Customer s2 = new Customer("3---",r);
        Customer s3 = new Customer("4----",r);
        Customer s4 = new Customer("5-----",r);
        Customer s5 = new Customer("6------",r);
        Customer s6 = new Customer("7-------",r);
        Customer s7 = new Customer("8--------",r);
        Customer s8 = new Customer("9---------",r);
        Customer s9 = new Customer("10----------",r);
        s.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
        s7.start();
    }
}
