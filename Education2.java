import java.util.Scanner;
class Staff{
     String name;
     int code;
    Staff(String name,int code)
    {
        this.name=name;
        this.code=code;
    }
    void display()
    {
        System.out.println("name="+name);
        System.out.println("Code="+code);
    }
}
class Teacher extends Staff{
    String subject,publication;
    Teacher(String name,int code,String subject,String publication)
    {
        super(name,code);
        this.subject=subject;
        this.publication=publication ;
    }
    void display()
    {
        super.display();
        System.out.print("Subject="+subject);
        System.out.print("\nPublication="+publication);
    }
}
class Officer extends Staff{
    char grade;
    Officer(String name,int code,char grade)
    {
        super(name, code);
        this.grade=grade;
    }
    void display()
    {
        super.display();
        System.out.print("Grade="+grade);
    }
}
class Typist extends Staff{
    int speed;
    Typist(String name,int code,int speed)
    {
        super(name, code);
        this.speed=speed;
    }
    void display(){
        super.display();;
        System.out.print("\nSpeed="+speed);
    }
}
class Regular extends Typist{
    int dayworks;
    Regular(String name,int code,int speed,int dayworks)
    {
        super(name, code, speed);
        this.dayworks=dayworks;
    }
    void display()
    {
        super.display();
        System.out.print("\nDayworks="+dayworks);
    }
}
class Casual extends Typist{
    int dailywages;
    Casual(String name,int code,int speed,int dailywages)
    {
        super(name, code, speed);
        this.dailywages=dailywages;
    }
    void display()
    {
        super.display();
        System.out.print("\nDailwages="+dailywages);
    }
}
public class Education2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String name,subject,publication;
        int code,dailywages,dayworks,x,speed;
        char grade;
        do
        {
            System.out.print("\nSelect Your Option:");
            System.out.print("\n1.Teacher:");
            System.out.print("\n2.Officer:");
            System.out.print("\n3.Casual Typist:");
            System.out.print("\n4.Regular Typist:");
            System.out.print("\n5.Exit:");
            System.out.print("\nEnter Your option:");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                {
                System.out.print("Enter Name:");
                name=sc.next();
                System.out.print("Enter Code:");
                code=sc.nextInt();
                System.out.print("Enter Subject:");
                subject=sc.next();
                System.out.print("Enter Publication:");
                publication=sc.next();
                Teacher T1=new Teacher(name,code,subject,publication);
                T1.display();
                break;               
                }
                case 2:
                {
                System.out.print("Enter Name:");
                name=sc.next();
                System.out.print("Enter Code:");
                code=sc.nextInt();
                System.out.print("Enter Grade:");
                grade=sc.next().charAt(0);
                Officer O1=new Officer(name,code,grade);
                O1.display();
                break;
                }
                case 3:
                {
                 System.out.print("Enter Name:");
                name=sc.next();
                System.out.print("Enter Code:");
                code=sc.nextInt();
                System.out.print("Enter Speed=");
                speed=sc.nextInt();
                System.out.print("Enter Dailywages:");
                dailywages=sc.nextInt();
                Casual C1=new Casual(name,code,speed,dailywages);
                C1.display();break;
            }
            case 4:
            {
                System.out.print("Enter Name:");
                name=sc.next();
                System.out.print("Enter Code:");
                code=sc.nextInt();
                System.out.print("Enter Speed=");
                speed=sc.nextInt();
                System.out.print("Enter DayWorks:");
                dayworks=sc.nextInt();
                Regular R1=new Regular(name,code,speed,dayworks); 
                R1.display();break;
                }
                case 5:
                    break;
                default:
                    System.out.print("\nInvalid Input:");
            }
         }while(x!=5);
     }
  }
    

