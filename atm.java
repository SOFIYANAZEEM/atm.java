import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int pin=0000;//initialize the mandatory values
	    int balance=22000;
	    int addAmount=0;
	    int takeAmount=0;
	    String name;//dec of name
	    Scanner sc=new Scanner(System.in);//get input from user
	    System.out.println("Enter your pin number:");
	    int password=sc.nextInt();
	    if(password==pin){//password and pin number must be same
	        System.out.println("Enter your name:");
	        name=sc.next();
	        System.out.println("WELCOME "+name+"!");
	        while(true){//using while loop for process repitition
	           System.out.println("Press 1 to CHECK BALANCE");
	           System.out.println("Press 2 to CREDIT AMOUNT");
	           System.out.println("Press 3 to DEBIT AMOUNT");
	           System.out.println("Press 4 to TAKE RECEIPT");
	           System.out.println("Press 5 to EXIT");
	           
	           int option=sc.nextInt();//getting option from the user
	           switch(option)
	           {
	               case 1:
	                   System.out.println("YOUR CURRENT BALANCE IS:"+balance);//available bal is printed
	                   break;
	               case 2:
	                   System.out.println("ENTER THE AMOUNT TO BE CREDITED:");
	                   addAmount=sc.nextInt();
	                   System.out.println("SUCCESSFULLY CREDITED!");
	                   balance=balance+addAmount;//bal=20000+5000=250000
	                   break;
	               case 3:
	                   System.out.println("ENTER THE AMOUNT TO BE DEBITED:");
	                   takeAmount=sc.nextInt();
	                   if(takeAmount>balance){//if takeAmount is more than available bal
	                   System.out.println("OOPS!INSUFFICIENT BALANCE");
	                   }
	                   else{
	                      System.out.println("SUCCESSFULLY DEBITED!");
	                      balance=balance-takeAmount;//bal=25000-2000=23000
	                   }
	                   break;
	               case 4:
	                   System.out.println("WELCOME TO ABC ATM...!");
	                   System.out.println("YOUR CURRENT BALANCE IS:"+balance);
	                   System.out.println("AMOUNT DEPOSITED:"+addAmount);
	                   System.out.println("AMOUNT TAKEN:"+takeAmount);
	                   System.out.println("THANKS FOR COMING!VISIT AGAIN!");
	                   break;
	               default:
	                System.out.println("Press enter valid option!");//if input is more than 5
	                break;
	                   
	           }
	        }
	    }
	           else{
	                System.out.println("WRONG PIN NUMBER!");//if pin number is incorrect
	           }
	    }
	}
