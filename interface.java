import java.util.*;
interface Bnak
  {
    long Acccountno=123456789;
    public void rate_of_interest();  
    }
class SBI_Bank implements Bank
  {
    public void rate_of_interest()
    {
      System.out.println("rate of interest of SBI is 8%");
      
    }
  }
class AXIS_Bank implements Bank
  {
    public void rate_of_interest()
    {
      System.out.println("rate of interest of AXIS is 7%");
    }
  }
class Interface
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Bank sbi=new SBI_Bank();
      Bank axis=new AXIS_Bank();
      axis.rate_of_interest();
      sbi.rate_of_interest();
    }
  }
    
    
  }