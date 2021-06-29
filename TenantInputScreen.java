import java.util.Scanner;
import java.util.ArrayList; 
import java.util.List; 
import java.util.*;

public class TenantInputScreen
{
  private String name; 
  private int aptNum; 
  protected static TenantList list = new TenantList();


  public void inputScreen()
  {
    Scanner scan = new Scanner(System.in); 

    System.out.println("Enter tenant's name (George Smith): ");
    name = scan.nextLine(); 
    System.out.println("Enter tenant's apartment number (101): ");
    aptNum = scan.nextInt();
    Tenant tenant = new Tenant(aptNum,name);

    list.addTenant(tenant);
     
  }

  public void displayList()
  {
    list.displayTenantList();
  }
}