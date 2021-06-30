import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.*;


public class AnnualReport
{

private ExpenseRecord list = new ExpenseRecord();
private RentRecord rList = new RentRecord();

  public void display() throws FileNotFoundException
  {
	    
	 PrintStream o = new PrintStream(new File("AnnualReport.txt"));
    PrintStream console = System.out;
	  System.setOut(o);

    System.out.println("Annual Summary");
    System.out.println("-----------------");
    System.out.println("Income");
    System.out.print("Rent ");
    float r = RentRecord.rentSum();
    System.out.println(r);
    System.out.print("Expenses ");
    float e  = ExpenseRecord.expenseSum();
    System.out.println(e);
    System.out.print("Repairs ");
    float repair = ExpenseRecord.repairSum();
    System.out.println(repair);
    System.out.print("Insurance ");
    float insurance = ExpenseRecord.insuranceSum();
    System.out.println(insurance);
    System.out.print("Utilities ");
    float utilities = ExpenseRecord.utilitiesSum();
    System.out.println(utilities);
    System.out.println();
    System.out.print("Balance ");
    float balance = r - e;
    System.out.println(balance);
    

    System.setOut(console);

    System.out.println("Annual Summary");
    System.out.println("-----------------");
    System.out.println("Income");
    System.out.print("Rent ");
    r = RentRecord.rentSum();
    System.out.println(r);
    System.out.print("Expenses ");
    e  = ExpenseRecord.expenseSum();
    System.out.println(e);
    System.out.print("Repairs ");
    repair = ExpenseRecord.repairSum();
    System.out.println(repair);
    System.out.print("Insurance ");
    insurance = ExpenseRecord.insuranceSum();
    System.out.println(insurance);
    System.out.print("Utilities ");
    utilities = ExpenseRecord.utilitiesSum();
    System.out.println(utilities);
    System.out.println();
    System.out.print("Balance ");
    balance = r - e;
    System.out.println(balance);
    
 


  }
    

}
