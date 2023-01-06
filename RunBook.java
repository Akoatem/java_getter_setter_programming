import java.util.Scanner;
import javax.swing.*;

/**
 * write a program that print out book title, price and copiesInStock using getter and setter
 */

public class RunBook {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String title = "";
        double price = 0.0;
        int copiesInstock = 0;

        Book b = new Book("Romoa",100.0, 1000);
        //System.out.println("This book title is " +b.getTitle());
        //System.out.println("This book price is " +b.getPrice());
        //System.out.println("This book copies in stock is " +b.getCopiesInStock());

        JOptionPane.showMessageDialog(null, b);
       // System.out.println(b.calcPrice(19));
        //System.out.println(b.discount(50));
       // System.out.println(b);
        JOptionPane.showMessageDialog(null, "Discount is R "+b.calcPrice(19));
    }
}
