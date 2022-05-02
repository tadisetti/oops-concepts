import java.util.Scanner;
class Student
  {
    private int rollno;
    private String name;

    void setRollno(int rollno)
    {
      this.rollno=rollno;
    }
    int getRollno()
    {
      return this.rollno;
    }
    void setName(String name)
    {
      this.name=name;
    }
    String getName()
    {
      return this.name;
    }
  }

class pppp
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
       
        Student std=new Student();
       
        System.out.println("Enter Name:");
        std.setName(sc.next());

      System.out.println("Enter Rollno:");
        std.setRollno(sc.nextInt());


     
       System.out.println(std.getName()+std.getRollno());
    }
  }