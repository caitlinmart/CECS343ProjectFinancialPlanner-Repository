import java.util.ArrayList;
import java.util.*;


public class ExpenseRecord 
{
  static ArrayList<Expense> list = new ArrayList<Expense>(50);
  private int month; 
  private int day; 
  private String category; 
  private String payee; 
  private float amount; 
  float iSum; 
  float uSum; 
  float rSum; 

  public void addExpense(Expense expense)
  {
    list.add(expense);
  }

    public void displayExpenseRecord()
  {
    
    System.out.println("Date   Payee    Amount    Category");
    System.out.println("------------------------------------");
    
    for(int i = 0; i < list.size();i++)
    {
      System.out.println(list.get(i).toString());
    } 
    
  }

    public static float expenseSum()
  {
	  float sum = 0;
	   for(int i = 0; i < list.size(); i++)
	       sum += list.get(i).getAmount();
	   return sum;
  }


}