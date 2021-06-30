public class RentRow
{
  private int aptNum; 
  private float jan; 
  private float feb; 
  private float mar; 
  private float apr; 
  private float may; 
  private float june; 
  private float july; 
  private float aug; 
  private float sept; 
  private float oct;
  private float nov;
  private float dec;

  public RentRow(int aptNum, float jan, float feb, float mar, float apr, float may, float june, float july, float aug, float sept, float oct, float nov, float dec) 
  {
    this.aptNum = aptNum; 
    this.jan = jan; 
    this.feb = feb; 
    this.mar = mar; 
    this.apr = apr; 
    this.may = may; 
    this.june = june;
    this.july = july; 
    this.sept = sept;
    this.oct = oct; 
    this.nov = nov; 
    this.dec = dec;
  }  

  public void setAptNum(int aptNum)
  {
    this.aptNum = aptNum; 
  }

  public void setJan(float jan)
  {
    this.jan = jan; 
  }
  public void setFeb(float feb)
  {
    this.feb = feb; 
  }
  public void setMar(float mar)
  {
    this.mar = mar; 
  }
  public void setApr(float apr)
  {
    this.apr = apr; 
  }
  public void setMay(float may)
  {
    this.may = may; 
  }
  public void setJune(float june)
  {
    this.june = june; 
  }
  public void setJuly(float july)
  {
    this.july = july; 
  }
  public void setAug(float aug)
  {
    this.aug = aug; 
  }
  public void setSept(float sept)
  {
    this.sept = sept; 
  }
  public void setOct(float oct)
  {
    this.oct = oct; 
  }
  public void setNov(float nov)
  {
    this.nov = nov; 
  }

  public void setDec(float dec)
  {
    this.dec = dec; 
  }

  public int getAptNum()
  {
    return aptNum; 
  }

  public float getJan()
  {
    return jan;
  }

  public float getFeb()
  {
    return feb; 
  }

  public float getMar()
  {
    return mar; 
  }

  public float getApr()
  {
    return apr; 
  }

  public float getMay()
  {
    return may; 
  }

  public float getJune()
  {
    return june; 
  }

  public float getJuly()
  {
    return july; 
  }

  public float getAug()
  {
    return aug; 
  }

  public float getSept()
  {
    return sept;
  }

  public float getOct()
  {
    return oct; 
  }

  public float getNov()
  {
    return nov;
  }
  
  public float getDec()
  {
    return dec; 
  }
   public float getRent()
  {
	 return getJan() +getFeb() + getMar() + getApr() + getMay() + getJune() + getJuly()
	 + getAug() + getSept() + getOct() + getNov() + getDec();
  }
 
  @Override
  public String toString()
  {
    return  getJan() + "  " + getFeb() + "  " + getMar() + "  " + getApr() +
    "  " + getMay() + "  " + getJune() + "  " + getJuly() + "  " + getAug() + "  " + getSept() + "  " + getOct() + "  " + getNov() + "  " + getDec();
  }
  


}