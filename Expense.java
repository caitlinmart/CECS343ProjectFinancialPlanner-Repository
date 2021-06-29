public class Expense 
{
  private int month; 
  private int day; 
  private String category; 
  private String payee; 
  private float amount; 

  public Expense()
  {
    month = 0;
    day = 0;
    category = null;
    payee = null;
    amount = 0.0f;

  }
  public Expense(int m, int d, String p, float a, String c)
  {
    month = m;
    day = d;
    payee = p;
    amount = a;
    category = c;
  }
  public int getMonth(){
    return month;
  }
  
  public void setMonth(int month){
    this.month = month;
  }
  public int getDay(){
    return day;
  }
  public void setDay(int day){
    this.day = day;
  }
  public String getCategory(){
    return category;
  }
  public void setCategory(String category){
    this.category = category;
  }
  public String getPayee(){
    return payee;
  }
  public void setPayee(String payee){
    this.payee = payee;
  }
  public float getAmount(){
    return amount;
  }
  public void setAmount(float amount){
    this.amount = amount;
  }

  @Override
  public String toString()
  {
    return getMonth() + "/" + getDay() + "   " + getPayee() + "   " + getAmount() + "   " + getCategory();
  }
  

}