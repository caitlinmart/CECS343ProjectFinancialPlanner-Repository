
import java.util.ArrayList;
import java.util.List; 
import java.util.*;

public class TenantList 
{
  private ArrayList<Tenant> list = new ArrayList<Tenant>(50); 
  private int aptNumber;

  public void addTenant(Tenant tenant)
  {
    list.add(tenant);
    
  }

  public void displayTenantList()
  {
    
    System.out.println("Apt #  Tenant Name");
    System.out.println("-------------------");
    
    for(int i = 0; i < list.size();i++)
    {
      //Tenant tenant = list.get(i);
      System.out.println(list.get(i).toString());
    } 
    
  }

  public int getAptNumber(String name)
  {
 	  for(int i =0; i<list.size(); i++) //list is empty? 
 	  {
 			 String l = list.get(i).toString();

 		  if(l.contains(name))
 		  {
 				
 			  String numberOnly = list.get(i).toString().replaceAll("[^0-9]", "");
 			  aptNumber = Integer.parseInt(numberOnly);
 			  return aptNumber;
 		  }
 	  }
 	  return aptNumber;
  
 }
}