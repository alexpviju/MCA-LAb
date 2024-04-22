import java.util.*;
import java.time.LocalDate;
interface Calculate {
    double calculate();
}
class Product implements Calculate {
    int product_id, quantity;
    double unit_price;
    String name;
    public void getData() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Product id : ");
        product_id = scn.nextInt();
        System.out.print("Product Name : ");
        name = scn.next();
        System.out.print("Quantity : ");
        quantity = scn.nextInt();
        System.out.print("Unit Price : ");
        unit_price = scn.nextDouble();
    }
    public double calculate() {
        return quantity*unit_price;
    }
    void disp() {
        System.out.println(product_id+"\t\t"+name+"\t\t"+quantity+"\t\t"+unit_price+"\t\t"+calculate());
    }
}
class pro16 {
    public static void main(String[] args) {
        int i;
        double net_amount = 0;
        int order_no = (int) (Math.random()*1000);
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the No of Products: ");
        int n = scn.nextInt();
        Product prod[] = new Product[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter Details of Product "+(i+1));
            prod[i] = new Product();
            prod[i].getData();
        }
        System.out.println("\nOrder No : "+order_no);
        System.out.println("Date : "+LocalDate.now());
        System.out.println("Product Id\tName\t\tQuantity\tUnit Price\tTotal");
        System.out.println("----------------------------------------------------------------------");
        for (i = 0; i < n; i++) {
            prod[i].disp();
            net_amount += prod[i].calculate();
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\t\t\t\tNet.Amount\t\t\t"+net_amount);
    }
}
