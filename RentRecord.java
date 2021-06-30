import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class RentRecord 
{
	
	static ArrayList<RentRow> rentList = new ArrayList<RentRow>(50);
	private int apNumber;
		
	public void insertRent(RentRow Rent)
	{
    rentList.add(Rent);
	}

	public void display() throws FileNotFoundException
	{
		PrintStream o = new PrintStream(new File("RentRecord.txt"));
	  PrintStream console = System.out;
		System.setOut(o);
    System.out.println("AptNo Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec");
    System.out.println("------------------------------------------------------");
 		for(int i = 0; i < rentList.size(); i++)
    {
      System.out.println(rentList.get(i).getAptNum()+" " + rentList.get(i).toString());
    }
 		
 	  System.setOut(console);

 	  System.out.println("AptNo Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec");
 	  System.out.println("------------------------------------------------------");
 	 	for(int i = 0; i < rentList.size(); i++)
 	  {
 	    System.out.println(rentList.get(i).getAptNum()+" " + rentList.get(i).toString());
 	  }
 	 
  }

  public static float rentSum()
  {
	   float sum = 0;
	   for(int i = 0; i < rentList.size(); i++)
	       sum += rentList.get(i).getRent();
	   return sum;
  }


  
}
	


