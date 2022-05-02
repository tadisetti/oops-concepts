import java.util.*;
class maths
  {
    int add(int l,int b)   //rectangle
    {
      return(l*b);
    }
  
int add(int s)    // square
  {
  return(s*s);
  }
double add(double j,double o)   //triangle
  {
    return(1/2*j*o);
  }
double add(double r)    // circle
  {
    return(3.14*r*r);
  }
}
class Area
  {
    public static void main(String args[])
    {
     Area a=new Area();
      int w=a.add(1,2);
      int x=a.add(2);
      double y=a.add(3,4);
      double z=a.add(4);
      System.out.println(w+" "+x+" "+y+" "+z);
    }
  }