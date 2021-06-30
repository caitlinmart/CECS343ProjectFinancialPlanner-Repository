import java.util.Scanner;
import java.io.*;


public class RentInputScreen {
	TenantList list = new TenantList();
  RentRecord rRecord = new RentRecord();
  
	private String renter;
	private float rentPaid;
	private int month;
	private int aptNum;
  private float jan = 0; 
  private float feb = 0; 
  private float mar = 0; 
  private float apr = 0; 
  private float may = 0; 
  private float june = 0; 
  private float july = 0; 
  private float aug = 0; 
  private float sept = 0; 
  private float oct = 0;
  private float nov = 0;
  private float dec = 0;
  private float sum = 0;
  private String choice; 
  
	
	public void inputScreen()
	{
    Scanner scan = new Scanner(System.in);
    jan=0;feb=0;mar=0;apr=0;may=0;june=0;july=0;aug=0;sept=0;oct=0;nov=0;dec = 0;
    boolean moreRent = true; 
    
    System.out.println("Enter tenant's name (George Smith)");
		renter = scan.nextLine(); 
		aptNum = TenantInputScreen.list.getAptNumber(renter);

		 while(moreRent == true)
     {
		    System.out.println("Enter amount paid (345.67):");
		    rentPaid = scan.nextFloat();
		    System.out.println("Enter month rent (1-12)");
		    month = scan.nextInt();


        if(month == 1)
        {
          jan = rentPaid;
          
        }
        else if (month == 2)
        {
          feb = rentPaid;
         
        }
        else if(month == 3)
        {
          mar = rentPaid;
         
        }
        else if(month == 4)
        {
          apr = rentPaid;
          
        }
        else if(month == 5)
        {
          may = rentPaid;
         
        }
        else if(month == 6)
        {
          june = rentPaid;
        
        }
        else if(month == 7)
        {
          july = rentPaid;
      
        }
        else if(month == 8)
        {
          aug = rentPaid;
        }
        else if(month == 9)
        {
          sept = rentPaid;
        }
        else if(month == 10)
        {
          oct = rentPaid;
        }
        else if(month == 11)
        {
          nov = rentPaid;
        }
        else if(month == 12)
        {
          dec = rentPaid;
        }
        
        System.out.println("Would you like it input more rent payments for this user? (Yes/No)");
        choice = scan.next();
        if(choice.equals("Yes") || choice.equals("yes"))
        {
          moreRent = true; 
        }
        else if(choice.equals("No")|| choice.equals("no"))
        {
          moreRent = false;
          break; 
        }

        
     }
        RentRow rent = new RentRow(aptNum, jan,feb,mar,apr,may,june,july,aug,sept,oct,nov,dec);
		    rRecord.insertRent(rent);  
	}
    public void displayRentRecord() throws FileNotFoundException
  {
    rRecord.display();
  }
	
  
}

