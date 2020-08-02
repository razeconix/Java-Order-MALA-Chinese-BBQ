
import java.sql.*;

import java.util.*;

class ListOrder extends MyConnection {
    
    private int orderId;
    private double totalPrice;
    private static double vat;
    private Customer customer;

    ArrayList<Integer> listMala = new ArrayList<Integer>(); //list mala from customer
    ArrayList<Integer> listSauce = new ArrayList<Integer>(); //list sauce from customer
    ArrayList<Integer> countMala = new ArrayList<Integer>(); // count mala all from customer
    Vector<Product> mala = new Vector<Product>(); //list mala all
    Vector<Sauce> sauce = new Vector<Sauce>(); //list sauce all

    Scanner sc = new Scanner(System.in);

    public ListOrder() {
        orderId = 1;
        totalPrice = 0.0;
    }
 

    public ListOrder(int orderIdPara, double totalPricePara) {
        this.orderId = orderIdPara;
        this.totalPrice = totalPricePara;
    }

    public void addMala(Product malaPara) {
        mala.addElement(malaPara);
    }

    public void addSauce(Sauce saucepara) {
        sauce.addElement(saucepara);
    }

    public void setOrderId(int orderIdPara) {
        orderId = orderIdPara;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setTotalPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < listMala.size(); i++) {
            this.totalPrice += countMala.get(i) * (10 + (10 * getVat()));

        }
    }

    public void setTotalPrice(double totalPricePara) {
        this.totalPrice = totalPricePara;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public static void setVat(double vatPara) {
        vat = vatPara;
    }

    public static double getVat() {
        return vat;
    }

    public void listOrderMala() {
        System.out.print("How many Mala : ");
        int numberMala = sc.nextInt();
        for (int i = 0; i < numberMala; i++) {
            System.out.println("------------------------------------------------------------------------");
            boolean y = true;
            boolean z = true;
            int selectMalaNew = 0; // veriable empty wait selectMala
            int selecSauceNew = 0;
            // Customer selectMala
            do {
                System.out.print((i + 1) + ") mala is : ");
                int selectMala = sc.nextInt() - 1;
                if (selectMala == 0) {
                    y = false;
                } else if (selectMala == 1) {
                    y = false;
                } else if (selectMala == 2) {
                    y = false;
                } else if (selectMala == 3) {
                    y = false;
                } else {
                    System.out.println("Please press 1 - 4 only");
                }

                selectMalaNew = selectMala;
            } while (y);

            // Customer selecSauce
            do {
                System.out.print("sauce is (Not sauce press 3) : ");
                int selecSauce = sc.nextInt() - 1;
                if (selecSauce == 0) {
                    z = false;
                } else if (selecSauce == 1) {
                    z = false;
                } else if (selecSauce == 2) {
                    z = false;
                } else {
                    System.out.println("Please press 1 or 2 or 3 or 4 only");
                }
                selecSauceNew = selecSauce;
            } while (z);

            System.out.print("How many amount? : ");
            int selectAmount = sc.nextInt();
            listMala.add(selectMalaNew);
            listSauce.add(selecSauceNew);
            countMala.add(selectAmount);
        }
    }

    public void showListOrderMala() {
        for (int i = 0; i < listMala.size(); i++) {
            System.out.println();
            System.out.print(mala.elementAt(listMala.get(i)).getMalaName() + " \t "); //name mala
            System.out.print(sauce.elementAt(listSauce.get(i)).getSauceName() + " \t\t "); //name sauce
            System.out.print(countMala.get(i)); //count
        }
    }

    public void addDb(Customer customer) {
        String x = "hi";
        try {
            for (int i = 0; i < listMala.size(); i++) {
                String sql = "INSERT INTO `mydb`.`tbl_employee` (`customer`, `phone`, `address`, `product`, `sauce`, `amount`) VALUES ('"+customer.getCustomerName()+"', '"+customer.getCustomerTel()+"', '"+customer.getCustomerAddress()+"', '"+mala.elementAt(listMala.get(i)).getMalaName()+"', '"+sauce.elementAt(listSauce.get(i)).getSauceName()+"','"+countMala.get(i)+"');";
                Statement comando = conn.createStatement();
                comando.executeUpdate(sql);
            }

        } catch (SQLException ex) {
            System.out.println("Employee Error in getEmployee()");
            ex.printStackTrace();
            x = "Employee Error in getEmployee()";
            
        }
    }

    }

