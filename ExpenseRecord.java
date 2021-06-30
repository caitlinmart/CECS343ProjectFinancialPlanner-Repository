import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


public class ExpenseRecord 
{
  protected static ArrayList<Expense> list = new ArrayList<Expense>(50);
  private int month; 
  private int day; 
  private String category; 
  private String payee; 
  private float amount;  

  public void addExpense(Expense expense)
  {
    list.add(expense);
  }

  public void displayExpenseRecord() throws FileNotFoundException
  {
    
		PrintStream o = new PrintStream(new File("ExpenseRecord.txt"));
	  PrintStream console = System.out;
		System.setOut(o);
    
    System.out.println("Date   Payee    Amount    Category");
    System.out.println("------------------------------------");
    
    for(int i = 0; i < list.size();i++)
    {
      System.out.println(list.get(i).toString());
    }
    
    System.setOut(console);

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
    
  public static float repairSum()
  {
	  float amountR[] = new float[50];
	  float sum =0;
	  for(int i =0;i<list.size();i++)
	  {
	  if(list.get(i).getCategory().contains("Repairs"))
	  {
	  		amountR[i]=   list.get(i).getAmount();
	        sum = sum + amountR[i]; 
	  }
  }
	  return sum;
  }
  public static float utilitiesSum()
  {
	  float amountU[] = new float[50];
	  float sum =0;
	  for(int i =0;i<list.size();i++)
	  {
	  if(list.get(i).getCategory().contains("Utilities"))
	  {
	  		amountU[i]=   list.get(i).getAmount();
	      sum = sum + amountU[i]; 
	  }
  }
	  return sum;

  }
  public static float insuranceSum()
  {
	  float amountI[] = new float[50];
	  float sum =0;
	  for(int i =0;i<list.size();i++)
	  {
	  if(list.get(i).getCategory().contains("Insurance"))
	  {
	  		amountI[i]=   list.get(i).getAmount();
	      sum = sum + amountI[i]; 
	  }
  }
	  return sum;

  }




}