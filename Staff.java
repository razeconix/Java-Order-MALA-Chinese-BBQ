import java.sql.*;
import java.util.*;

class Staff extends MyConnection{
   
  public static void main(String[] args){
    ListOrder order = new ListOrder();
    Customer customer = new Customer("Dr.Winai Wongthai", "0910254053", "SC2-418");
    Scanner a=new Scanner(System.in);
    Setdb setdb=new Setdb();
       //System.out.print("show id :"); 
       //int i = a.nextInt();
    //setdb.getSetdb(i);
    // System.out.print(setdb.toString());
         
    System.out.print(setdb.getAllEmployee());
    //System.out.println(setdb.getOrder_id()+" "+setdb.getCustomerr()+" "+setdb.getPhone()+" "+setdb.getAddress()+" "+setdb.getProduct()+" "+setdb.getSaucee()+" "+setdb.getAmount());
    //show detail order & customer
    /*System.out.println("\n\n");
    System.out.println("************************************************************************");
    System.out.println("-------------------------- Purchase Order ------------------------------");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("Oreder number is "+order.getCid());
    System.out.println("------------------------------------------------------------------------");
    System.out.println("Mala \t\t Sauce \t\t Total ");
    System.out.println("                                                                        ");
    System.out.println("Thai Mala \t Popping Boba \t\t L \t\t 5");
    System.out.println("Milk Mala \t Puddinga \t\t M \t\t 5");
    System.out.println("Green Mala \t Coconut Jelly \t\t M \t\t 2");
    System.out.println("                                                                        ");
    System.out.println("------------------------------------------------------------------------");
    order.setTotalPrice(350.0);
    System.out.println("Total price is : "+order.getTotalPrice()+" Baht"); //show total price
    System.out.println("------------------------------------------------------------------------");
    System.out.println("Detail Customer");
    System.out.println("Name customer is : "+customer.getCustomerName());
    System.out.println("Telophone number is : "+customer.getCustomerTel());
    System.out.println("Address is : "+customer.getCustomerAddress());
    System.out.println("------------------------------------------------------------------------");
    System.out.println("************************************************************************");
    System.out.println("\n\n");
    //End show detail order & customer*/
  }

    
}
