import java.util.*;
class addition
  {
    int add(int a,int b)
    {
      return(a+b);
    }
    int add(int a,int b,int c)
      {
        return(a+b+c);
      }

  double add(double a,double b)
    {
      return(a+b);
    }
}
class polyOverloading
  {
    public static void main(String args[])
    {
      addition a=new addition();
      int x=a.add(4,5);
      int y=a.add(2,3,5);
      double z=a.add(2.3,4.5);
    System.out.println(x+" "+y+" "+z);
    }
  }
