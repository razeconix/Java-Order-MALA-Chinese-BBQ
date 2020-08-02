import java.sql.*;
import java.util.*;

public class Setdb extends MyConnection {

    private int order_id,phone;
    private String customerr,address,product,sauce,amount;
    public Setdb() {
    }

 public Setdb(int order_id,String customer,int phone,String address,String product,String sauce,String amount){
         this.setOrder_id(order_id);
        this.setCustomerr(customer);
        this.setPhone(phone);
        this.setAddress(address);
        this.setProduct(product);
        this.setSauce(sauce);
        this.setAmount(amount);
    }


    public Setdb getSetdb(int id) {
        try {
            String sql = "select * from `tbl_employee`  where `order_id` = ? ";         
            pre = conn.prepareStatement(sql);
            pre.setInt(1, id);
            ResultSet rec = pre.executeQuery();
            if ((rec != null) && (rec.next())) {
                return new Setdb(
                        Integer.parseInt(rec.getString("order_id")),
                        rec.getString("customer"),
                        Integer.parseInt(rec.getString("phone")),
                        rec.getString("address"),
                        rec.getString("product"),
                        rec.getString("sauce"),
                        rec.getString("amount"));
            }
            return new Setdb();
        } catch (SQLException ex) {
            System.out.println("Setdb Error in getSetdb()");
            ex.printStackTrace();
            return new Setdb();
        }
    }
    public Setdb getEmployee() {
        try {
            String sql = "select * from tbl_employee where emp_id = ? ";
            pre = conn.prepareStatement(sql);
            ResultSet rec = pre.executeQuery();
            if ((rec != null) && (rec.next())) {
              return new Setdb(
                        Integer.parseInt(rec.getString("order_id")),
                        rec.getString("customer"),
                        Integer.parseInt(rec.getString("phone")),
                        rec.getString("address"),
                        rec.getString("product"),
                        rec.getString("sauce"),
                        rec.getString("amount"));
            }
           
            return new Setdb();
        } catch (SQLException ex) {
            System.out.println("Employee Error in getEmployee()");
            ex.printStackTrace();
            return new Setdb();
        }
    }
    
    public ArrayList<Setdb> getAllEmployee() {
        ArrayList<Setdb> out;
        out = new ArrayList<Setdb>();
        try {
            String sql = "select * from tbl_employee ";
            pre = conn.prepareStatement(sql);
            ResultSet rec = pre.executeQuery();
            while ((rec != null) && (rec.next())) {
                out.add(new Setdb(
                        Integer.parseInt(rec.getString("order_id")),
                        rec.getString("customer"),
                        Integer.parseInt(rec.getString("phone")),
                        rec.getString("address"),
                        rec.getString("product"),
                        rec.getString("sauce"),
                        rec.getString("amount"))
                );
            }
            return out;
        } catch (SQLException ex) {
            System.out.println("Error in getAllEmployee()");
            ex.printStackTrace();
            return null;
        }

    }
    public String toString() {
        return "ID = " + this.getOrder_id()
               + " customer = " + this.getCustomerr()
               + " phone = " + "0"+this.getPhone()
               + " address = " + this.getAddress()
               + " product = " + this.getProduct()
               + " sauce = " + this.getSauce()
               + " amount = " + this.getAmount()
               + "\n" ;
                
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getPhone() {
        return phone;
    }

    public String getCustomerr() {
        return customerr;
    }

    public String getAddress() {
        return address;
    }

    public String getProduct() {
        return product;
    }

    public String getSauce() {
        return sauce;
    }

    public String getAmount() {
        return amount;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setCustomerr(String customerr) {
        this.customerr = customerr;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


}
