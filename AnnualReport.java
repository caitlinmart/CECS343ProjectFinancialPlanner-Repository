//import java.io.File;
//import java.util.Scanner;
//import java.io.FileNotFoundException;

public class AnnualReport
{

private ExpenseRecord list = new ExpenseRecord();
private RentRecord rList = new RentRecord();

  public void display()
  {
    System.out.println("Annual Summary");
    System.out.println("-----------------");
    System.out.println("Rent");
    float r = RentRecord.rentSum();
    System.out.println(r);
    System.out.println("Expenses");
    float e  = ExpenseRecord.expenseSum();
    System.out.println(e);

    System.out.println("Balance:");
    float balance = r - e;
    System.out.println(balance);

  }


}
/*

protected static ExpenseRecord list = new ExpenseRecord();

  public void display()
  {
    try{
      File expenseFile = new File("ExpenseRecord");
      Scanner scan = new Scanner(expenseFile);
      scan.nextLine();

      while(scan.hasNextLine()){
        String data = scan.nextLine();
        String[]expense = data.split(",");
      }
    }

    catch(FileNotFoundException e){
      System.out.println("File not found.");
    }
    

    /*System.out.println("Annual Summary");
    System.out.println("-----------------");
    System.out.println("Rent");
    System.out.println("Expenses");
    System.out.println("Utilities   ");
    System.out.print(list.getUtilitiesSum());
    System.out.println("Insurance   " + list.getInsuranceSum());
    */

