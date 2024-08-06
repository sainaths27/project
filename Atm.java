

import java.util.*;
class program5

{

 public static class Atm{

public double balance ;

  public static Boolean verified( int acc , int  pin)
        {
            int accountno  = 12345;
            int pinacc= 1234;
if ((acc==accountno )&&( pin == pinacc))
{
    return true;
}
else
{
    return false;
}
 }

   public void getbalance()
   {
  
System.out.println(" your  balance is"+ balance);
   }
   public void getwithdrawl(int amount)
{
if (amount > balance)
{
    System.out.println("  balance is insufficient");
}
else
{
    balance = balance-amount;
    System.out.println(" amout is withdrwal"+amount);
    System.out.println(" remaining balance is"+balance);
}

}

   public void getdeposite(double amount)
{

    balance = balance+amount;
       System.out.println("Amount deposited: " + amount);
            System.out.println("New balance: " + balance);
}

}
 public static void main (String args[])
    {
     
        Scanner sobj = new Scanner(System.in);

        System.out.println("-------------Welcome to Atm ------------");

        System.out.println(" enter the Account number");

    int   acc = sobj.nextInt();

    
            System.out.println(" enter the pin code");

     int  pin = sobj.nextInt();
    
    Atm aobj = new Atm();

    Boolean bret = aobj.verified(acc,pin);
     if (bret == true)
     {
 System.out.println("Welcome to your account ");
Boolean exit = false;
  while (!exit) {
                System.out.println("1. Show balance");
                System.out.println("2. Withdraw balance");
                System.out.println("3. Deposit amount");
                System.out.println("4. Show mini statement");
                System.out.println("5. Exit");

 int choice =sobj.nextInt();
 switch (choice)
 {
    case 1 : aobj.getbalance();
    break;

    case 2 : 
    System.out.println(" enter amount you want to withdrawal");
    int amount = sobj.nextInt();
    aobj.getwithdrawl(amount);
    break;

    case 3:
         System.out.println(" enter amount you want to deposite");
    double amount1 = sobj.nextDouble();
    aobj.getdeposite(amount1);
    break;
     case 5:
        exit = true;
System.out.println("Exiting...");
System.out.println(" thank you for using ATM");
 break;
 }
 }
 }
else
     {
         System.out.println("please enter valid  account number ");
        
     }
     sobj.close();
      
}
}