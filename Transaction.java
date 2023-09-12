import java.util.Scanner;

public class Transaction 
//main interface
//create variables
//create methods
//create a constructor
{
    public String custID;
    public String descToenail, descBread, descEscargot, descGarlic;
    public double priceToenail, priceBread, priceEscargot, priceGarlic;
    public boolean done = false;
    public boolean fin = false;

    public boolean nextCustomer()
    {
        greet();
        while (!done)
        {
            scanItems();
        }
        checkOut();
        return fin;
    }

    public void greet()
    {
        System.out.println("Thank you for shopping with us today!");
    }

    public void scanItems()
    {
        for(int x = 0; x < 4; x++)
        {
            System.out.println("Please scan your next item.");
        }
        done = true;
    }

    public void checkOut()
    {
        System.out.println("Please insert cash or card.");
    }
}

