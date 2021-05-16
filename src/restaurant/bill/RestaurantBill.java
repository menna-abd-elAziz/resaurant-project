package restaurant.bill;
import java.util.Scanner;
public class RestaurantBill {

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("what is your order please?");
        
        burger c=new burger();
        c.setName(Sc.nextLine());
        System.out.println("which type of meat do you want:");
        
        c.setTypeofmeat(Sc.nextLine());
        
    System.out.println("which type of bread do you want:");
c.setTypeofbread(Sc.nextLine());

        System.out.println("the price is :");
c.setPrice(Sc.nextDouble());
        System.out.println("the price of burger :"+c.getPrice());

       c.addition1("cheese",25.0);
       c.addition2("soft drink", 6.0);
       c.addition3("maionez",2.0);
       c.addition("katchap", 1.0);
       c.finalprice();
        System.out.println("ih bill:"+c.finalprice());
    
    



                System.out.println("what is your order please?");
              //  System.out.println("i ll have healihy burger called:");
                healthyburger h=new healthyburger();
             h.setName(Sc.nextLine());
             //h.setRollbread(Sc.nextLine());
             System.out.println("enter the name of meat");
             h.setTypeofmeat(Sc.nextLine());
             System.out.println("enter the price");
           h.setTotalprice(Sc.nextInt()); ; 
        System.out.println("the bill before addition"+h.getTotalprice());
           System.out.println();
                   System.out.println("do ya like any addition");

        h.addition1("lettice ", 3.0);
        h.addition2("soda", 10.0);
       System.out.println(    h.finalprice());
       
       
        Deluxe z=new Deluxe();
              
              
              z.setName(Sc.nextLine());
             //h.setRollbread(Sc.nextLine());
             System.out.println("enter the name of meat");
             z.setTypeofmeat(Sc.nextLine());
             System.out.println("enter the price");
z.setTotalprice(Sc.nextInt());  
        System.out.println("the bill before addition"+z.getTotalprice());
           System.out.println();
                   System.out.println("do ya like any addition");
        z.addition1("chips ", 3.0);
        z.addition2("drink", 10.0);

                   System.out.println( "the final price:"  + z.finalprice());

    }
    }