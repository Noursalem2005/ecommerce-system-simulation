package projectass;

import java.util.Scanner;
import projectass.cart;
import projectass.elctronic;
import projectass.clothingproduct;
import projectass.bookproduct;
import projectass.order;
import projectass.product;
import projectass.custmer;

public class ecommerce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        elctronic e1 = new elctronic(1, "smartphone", 599.9f, "Samsung", 1);
        clothingproduct c1 = new clothingproduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
        bookproduct b1 = new bookproduct(3, "OOP", 39.99f, "O'Reilly", "X publications");
        System.out.println("plz enter UR ID : ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Plz enter your name : ");
        String name = input.nextLine();
        System.out.println("Ur address plz : ");
        String address = input.nextLine();
        custmer cust1 = new custmer(id, name, address);
        System.out.println("How many products you want to add to the cart ? ");
        int number_of_product = input.nextInt();
        cart ca = new cart(cust1.getcustmerid(), number_of_product);
        for (int i = 0; i < number_of_product; i++) {
            System.out.println(
                    "which products would you like to add ? 1- Smartphone  2- T-shirt  3- OOP ");
            int number2 = input.nextInt();
            if (number2 == 1) {
                ca.addproduct(e1);
            } else if (number2 == 2) {
                ca.addproduct(c1);
            } else if (number2 == 3) {
                ca.addproduct(b1);
            } else {
                System.out.println("Invalid input plz enter a valid number");
                i--;
                continue;
            }
        }
        System.out.println("your total is " + ca.calc_total_price()
                + " if you do not have enough money enter \"delete\" to delete item or \"continue\" to move on");
        String s1 = input.next();
        if (s1.equals("delete")) {
            System.out.println("how many items you want to remove ? ");
            int number = input.nextInt();
            for (int i = 0; i < number; i++) {
                System.out.println("what the name of the item you want to delete ? ");
                String remove = input.next();
                ca.removeproduct(remove);
            }

        }
        System.out.println("now everything is ready with total price of " + ca.calc_total_price()
                + "$ would you like to place the order press 1 or 2 ?  1: Yes  2: NO");
        int number5 = input.nextInt();
        if (number5 == 1) {
            System.out.println("SUMMARY :  \n");
            order o1 = new order(1, cust1.getcustmerid(), ca.getproducts(), ca.calc_total_price());
            o1.print_order_info();
        }

    }

}
