import java.util.Scanner; 
import java.util.*;
//import java.io.FilenotFoundException;

public class ExpenseInputScreen 
{
  private int month;
  private int day;
  private String category; 
  private String payee; 
  private float amount; 
  //private
  protected static ExpenseRecord list = new ExpenseRecord();

  public void inputScreen()
  {

    Scanner scan = new Scanner(System.in); 
    System.out.println("Enter month (1-12): ");
    month = scan.nextInt();
    System.out.println("Enter day (1-31): ");
    day = scan.nextInt(); 
    scan.nextLine();
    System.out.println("Enter expense category (Repairs, Utilities, or Insurance): "); 
    category = scan.nextLine();
    System.out.println("Enter payee (Bob's Hardware, Big ELectric Co, etc.): ");
    payee = scan.nextLine(); 

 

    System.out.println("Enter amount (39.95): ");
    amount = scan.nextFloat(); 


    Expense expense = new Expense(month,day,payee,amount,category);
    list.addExpense(expense);

  }

  public void displayExpenseRecord()
  {
    list.displayExpenseRecord();
  }




  
} 
