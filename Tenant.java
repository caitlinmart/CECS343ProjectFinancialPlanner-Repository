
import java.util.ArrayList;
import java.util.List; 
import java.util.*;

public class Tenant
{

  private String name; 
  private int aptNumber; 


  public Tenant(int aptNumber, String name)
  {
    this.aptNumber = aptNumber; 
    this.name = name; 
  }

  public void setAptNumber(int aptNumber)
  {
    this.aptNumber = aptNumber;
  }

  public void setName(String name)
  {
    this.name = name; 
  }

  public int getAptNumber()
  {
    return aptNumber; 
  }

  public String getName()
  {
    return name; 
  }

 @Override
 public String toString()
 {
    return getAptNumber() + " " + getName()  ;
 }
  
}