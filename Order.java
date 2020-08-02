
import java.util.*;

class Order
{
  public Order()
  {
    Scanner sc = new Scanner(System.in);
    ListOrder order = new ListOrder();

    System.out.println("\n\n************************************************************************");
    System.out.println("****************** Welcome to Mala Paja***********************\n");

    //Show list mala
    System.out.println("List Mala");
    Product mala1 = new Product(1, "Chicken");
    Product mala2 = new Product(2, "Pork");
    Product mala3 = new Product(3, "mushroom");
    Product mala4 = new Product(4, "corn");

    System.out.println(mala1.getMalaId()+" \t"+mala1.getMalaName()+" \t"+mala2.getMalaId()+" \t"+mala2.getMalaName());
    System.out.println(mala3.getMalaId()+" \t"+mala3.getMalaName()+" \t"+mala4.getMalaId()+" \t"+mala4.getMalaName());
    
    //End show list mala

    //add mala
    order.addMala(mala1);
    order.addMala(mala2);
    order.addMala(mala3);
    order.addMala(mala4);

    //end add mala

    //Show sauc
    System.out.println("\nList Sauce");
    Sauce sauc1 = new Sauce(1, "Hot Sauce");
    Sauce sauc2 = new Sauce(2, "Sweet Sauce");

    System.out.println(sauc1.getSauceId()+" \t\t"+sauc1.getSauceName());
    System.out.println(sauc2.getSauceId()+" \t\t"+sauc2.getSauceName());
    //End show sauc

    //add sauc
    order.addSauce(sauc1);
    order.addSauce(sauc2);
    //end add sauc

    //vat 7 %
    ListOrder.setVat(0.07);
    System.out.println("\n------------------------------------------------------------------------");
    System.out.println("Vat is : "+ListOrder.getVat());
    System.out.println("------------------------------------------------------------------------\n");

    //customer place mala
    System.out.println("Select mala");
    order.setOrderId(1);
    System.out.println("Order : "+order.getOrderId());
    order.listOrderMala();
    System.out.println("------------------------------------------------------------------------\n");
    System.out.println("---------------------- Your list order mala -----------------------------");
    System.out.println("------------------------------------------------------------------------");
    System.out.println("Mala \t\t Sauce \t\t Size \t\t Total/glass");
    order.showListOrderMala(); //show order
    order.setTotalPrice();
    System.out.println("\n------------------------------------------------------------------------");
    System.out.println("Total price is : "+order.getTotalPrice()+" Baht"); //show total price
    System.out.println("------------------------------------------------------------------------\n");
    //end customer place mala

    //customer want to change order
    boolean gg = true;
    int change = 0;
    do {
      System.out.print("Do you want to change list mala? [Yes:1][No:0] : ");
      change = sc.nextInt();
      if (change == 1)
      {
        gg = false;
      }
      else
      {
        if (change == 0)
        {
          gg = false;
        }
        else
        {
          System.out.println("\nPlease press 1 or 0 only\n");
        }
      }
    } while (gg);
    System.out.println("\n------------------------------------------------------------------------\n");
    if (change == 0)
    {
      //Customer enter detail customer
      System.out.println("Customer Enter detail");
      String error1 = sc.nextLine();
      System.out.print("Enter name : ");
      String customerName = sc.nextLine();
      System.out.print("Enter telophone : ");
      String customerTel = sc.nextLine();
      System.out.print("Enter address : ");
      String customerAddress = sc.nextLine();
      Customer customer1 = new Customer(customerName, customerTel, customerAddress);
      System.out.println("------------------------------------------------------------------------\n");
      //end coustomer enter Detail

      //customer check detail
      boolean a = true;
      do
      {
        System.out.println("\n\n------------------------------------------------------------------------");
        System.out.println("Please check your detail");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Name customer is : "+customer1.getCustomerName());
        System.out.println("Telophone number is : "+customer1.getCustomerTel());
        System.out.println("Address is : "+customer1.getCustomerAddress());
        System.out.println("------------------------------------------------------------------------\n");
        boolean ez = true;
        int changeDetail = 0;
        do {
          System.out.print("Do you want change detail [Yes:1][No:0] : ");
          changeDetail = sc.nextInt();
          if (changeDetail == 1)
          {
            ez = false;
          }
          else
          {
            if (changeDetail == 0)
            {
              ez = false;
            }
            else
            {
              System.out.println("\nPlease press 1 or 0 only\n");
            }
          }
        } while (ez);
        if (changeDetail == 1)
        {
          System.out.println("------------------------------------------------------------------------");
          String error2 = sc.nextLine();
          System.out.println("Edit your detail");
          System.out.print("Enter name : ");
          String customerNameNew = sc.nextLine();
          System.out.print("Enter telophone : ");
          String customerTelNew = sc.nextLine();
          System.out.print("Enter address : ");
          String customerAddressNew = sc.nextLine();
          customer1.setCustomerName(customerNameNew);
          customer1.setCustomerTel(customerTelNew);
          customer1.setCustomerAddress(customerAddressNew);
          System.out.println("------------------------------------------------------------------------");
        }
        else
        {
          a = false;
        }
      } while (a);
      //end customer check detail

      System.out.print("\n\n\n\n");

      //show detail order & customer
      System.out.println("************************************************************************");
      System.out.println("-------------------------- Purchase Order ------------------------------");
      System.out.println("------------------------------------------------------------------------");
      System.out.println("Oreder number is "+order.getOrderId());
      System.out.println("------------------------------------------------------------------------");
      System.out.println("Mala \t\t Sauce \t\t Size \t\t Total/glass");
      order.showListOrderMala(); //show order
      System.out.println("\n\n------------------------------------------------------------------------");
      order.setTotalPrice();
      System.out.println("Total price is : "+order.getTotalPrice()+" Baht"); //show total price
      System.out.println("------------------------------------------------------------------------");
      System.out.println("Detail Customer");
      System.out.println("Name customer is : "+customer1.getCustomerName());
      System.out.println("Telophone number is : "+customer1.getCustomerTel());
      System.out.println("Address is : "+customer1.getCustomerAddress());
      System.out.println("------------------------------------------------------------------------");
      System.out.println("************************************************************************");
      //End show detail order & customer

      //customer confirm Detail
      System.out.println("\n\n");
      System.out.println("------------------------------------------------------------------------\n");
      boolean lol = true;
      int choiceExit = 0;
      do {
        System.out.print("Would you like to confirm your order? [Yes:1][No:0] || Cancel Order [Press:2] : ");
        choiceExit = sc.nextInt();
        if (choiceExit == 1)
        {
          lol = false;
        }
        else
        {
          if (choiceExit == 0)
          {
            lol = false;
          }
          else
          {
            if (choiceExit == 2)
            {
              lol = false;
            }
            else
            {
              System.out.println("\nPlease press 1 or 0 or 2 only\n");
            }
          }
        }
      } while (lol);
      System.out.println("------------------------------------------------------------------------");
      if ( choiceExit == 1 )
      {
        order.addDb(customer1);
        System.out.println("\n\n");
        System.out.println("                    Confirm Successfully!!!");
        System.out.println("\n\n");
      }
      else
      {
        if ( choiceExit == 0 )
        {
          new Order();
        }
        else
        {
          if ( choiceExit == 2 )
          {
            System.out.println("\n\n");
            System.out.println("                    Your Order Cancel!!!");
            System.out.println("\n\n");
          }
        }
      }
    }
    else
    {
      new Order();
    }
  }
}
