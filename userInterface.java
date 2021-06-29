import java.util.Scanner; 
import java.util.ArrayList;
import java.util.List; 
import java.util.*;

public class userInterface
{
  
  private String username = "username"; 
  private String password = "password";  
  private char input; 
  private char input1; 
  private TenantInputScreen tenantScreen = new TenantInputScreen();
  private RentInputScreen rentScreen= new RentInputScreen();
  private ExpenseInputScreen expenseScreen = new ExpenseInputScreen();
  private AnnualReport annualReport = new AnnualReport();
  

  public void login()
  {
    int valid = 0;

    while(valid == 0)
    {
      Scanner scan = new Scanner(System.in); 

      System.out.println("Enter username: (username)");
      String usernameInput = scan.next(); 
      System.out.println("Enter password (password):");
      String passwordInput = scan.next(); 

      if( (usernameInput.equals(username)) && (passwordInput.equals(password)))
      {
        valid = 1; 
        System.out.println("login valid");
        userMenu(); 
      }
      else if( (username != usernameInput) && (password != passwordInput))
      {
        System.out.println("username or password is invalid, try again");
      }
    }
    
  }

  public void userMenu()
  {

    //TenantList list = new TenantList();
    Scanner scan = new Scanner(System.in);
    int quitProgram = 0; 

    while(quitProgram == 0)
    {
      System.out.println("Enter 'i' to input data,\n'd' to display a report,\n'q' to quit program:");
      input = scan.next().charAt(0);

        if(input == 'i')
        {
          System.out.println("Enter 't' to add tenant,\n'r' to record rent payment,\n'e' to record expense:");
          input = scan.next().charAt(0);

          if(input == 't')
          {
            /*Scanner in = new Scanner(System.in); 

            System.out.println("Enter tenant's name (George Smith): ");
            String name = in.nextLine(); 
            System.out.println("Enter tenant's apartment number (101): ");
            int aptNum = in.nextInt();
    

           // TenantList list = new TenantList();
            Tenant tenant = new Tenant(aptNum, name);
            list.addTenant(tenant);
            */
            tenantScreen.inputScreen();
          }
          else if(input == 'r')
          {
            rentScreen.inputScreen();
          }
          else if(input == 'e')
          {
            expenseScreen.inputScreen();
          }
        }
        else if(input == 'd')
        {
          System.out.println("Enter 't' to display tenants,\n'r' to display rents,\n'e' to display expenses,\n'a' to display annual report:");
          input1 = scan.next().charAt(0);

          if(input1 == 't')
          {
            //display tenants
           // TenantList list = new TenantList();
        	 //list.displayTenantList();

           tenantScreen.displayList();
          }
          else if(input1 == 'r')
          {
            //RentRecord record = new RentRecord();
            rentScreen.displayRentRecord();
          }
          else if(input1 == 'e')
          {
            expenseScreen.displayExpenseRecord();
          }
          else if(input1 == 'a')
          {
            annualReport.display();
          }
        }
        else if(input == 'q')
        {
          break; 
        }
      }

    }
    
  }


