import java.util.*;
abstract class BankAccount
{
Scanner sc=new Scanner(System.in);
abstract void deposite(); 
abstract void withdraw();
abstract void checkBalance();
void getDetails()
{
System.out.println("Get the customer details :");
System.out.println("Name :");
String n=sc.next();
System.out.println("Email:");
String name=sc.next();
System.out.println("Mobile no:");
int m=sc.nextInt();
}
}

class Saving extends BankAccount
{
Scanner s=new Scanner(System.in);
int amount,withdraw,balance;
void deposite() 
{
System.out.println("Enter Amount :");
 amount=sc.nextInt();
System.out.println("Rs. "+amount+" is Deposited");
}
void withdraw()
{
System.out.println("Enter Amount :");
 withdraw=sc.nextInt();
System.out.println("Rs. "+withdraw+" is Withdrawl");
}
void checkBalance()
{
balance=amount-withdraw;
System.out.println("Available Balance :"+balance);
}
}

class Current extends BankAccount
{
Scanner s=new Scanner(System.in);
int amount,withdraw,balance;
void deposite()
{
System.out.println("Enter Amount :");
 amount=sc.nextInt();
System.out.println("Rs. "+amount+" is Deposited");
}
void withdraw()
{
System.out.println("Enter Amount :");
 withdraw=sc.nextInt();
System.out.println("Rs. "+withdraw+" is Withdrawl");

}
void checkBalance()
{
balance=amount-withdraw;
System.out.println("Available Balance :"+balance);
}
}

class TestAccount
{
public static void main(String args[])
{
Scanner a=new Scanner(System.in);
int choice,ch;
do
{
System.out.println("1.Saving Account");
System.out.println("2.Current Account");
choice =a.nextInt();

switch(choice)
{
case 1:
      BankAccount b=new Saving();
      b.getDetails();
      b.deposite();
      b.withdraw();
      b.checkBalance();
      break;

case 2:
      BankAccount c=new Current();
      c.getDetails();
      c.deposite();
      c.withdraw();
      c.checkBalance();
      break;
}
System.out.println("You want to open another Account :");
ch= a.nextInt();
}while(ch==1);
}
}