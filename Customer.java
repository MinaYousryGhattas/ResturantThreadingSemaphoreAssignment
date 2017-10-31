package Assignment;

import java.util.Random;

public class Customer extends Thread
{
    String name;
    Restaurant r;
    Random rand;

    Customer()
    {
        name = "";
        r = null;
        rand = new Random();
    }

    Customer(String n, Restaurant rest)
    {
        name = n;
        r = rest;
        rand = new Random();
    }

    public static synchronized void arrive(String name, Restaurant r)
    {
        try
        {
            System.out.println(name + " arrives " + r.semaphore.availablePermits());
            if (r.semaphore.availablePermits() <= 0)
                System.out.println(name + " is waiting");
            r.semaphore.acquire();
            System.out.println(name + " enters");
        } catch (InterruptedException e)
        {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }

    public synchronized void order()
    {

        System.out.println(name + " orders");
        try
        {
            Thread.sleep(rand.nextInt(10000));
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public synchronized void eat()
    {
        System.out.println(name + " eats");
        try
        {

            Thread.sleep(rand.nextInt(10000));
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public synchronized void leave()
    {
        System.out.println(name + " leaves");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void run()
    {
        arrive(name,r);
        order();
        eat();
        leave();
        r.semaphore.release();
    }

}
