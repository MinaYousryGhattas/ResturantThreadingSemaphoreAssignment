package Assignment;

import java.util.concurrent.Semaphore;

public class Restaurant
{
    int numberoftables;
    Customer[] tables;
    Semaphore semaphore;

    Restaurant()
    {
        numberoftables = 0;
        tables = null;
        semaphore = null;
    }

    Restaurant(int n)
    {
        numberoftables = n;
        tables = new Customer[n];
        semaphore = new Semaphore(n);
    }




}
