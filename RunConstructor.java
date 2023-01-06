import java.util.Scanner;

/**
 * write a program using contructor in a getter and setter
 * consider a situation where you want to buy a shoe, given the shoe type, shoe size and colour
 */

public class RunConstructor {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Double shoeSize = 0.0;
        String shoeType = "";
        String shoeColour = "";

        // create an object to be call shoeShop
        Shoe shoeShop = new Shoe(23.5, "Fabiani","White");
        shoeShop.NewArrival();

        // calling the getter method from the other class
        System.out.println("The now shoe size is " +shoeShop.getShoeSize());
        System.out.println("The now show type is " +shoeShop.getShoeType());
        System.out.println("The now shoe colour is " +shoeShop.getShoeColour());

        /**
         * To add more shoe and their properties you have to create an array of size
         *         creating an arrey of shoes
         *         this arrey is of type shoes
         *         shoes is a class we created whic has a contructor that must be given values/parameter
         */

        Shoe myShoe[] = new Shoe[5];
        myShoe[0] = new Shoe(12.23,"Gucci","Red");
        System.out.println("please enter the shoe size, type and colour");

        System.out.print("Enter the shoe size: ");
        shoeSize = sc.nextDouble();
        System.out.print("Enter the shoe type: ");
        shoeType = sc.next();
        System.out.print("Enter the shoe colour: ");
        shoeColour = sc.next();

        // enter the first position in the array
        myShoe[1] = new Shoe(shoeSize, shoeType,shoeColour);
        // print out the new position in the array

        System.out.println("The new position1 of shoe size is " +shoeShop.getShoeSize());
        System.out.println("The new position1 of shoe type is " +shoeShop.getShoeType());
        System.out.println("The new position1 of shoe colour is " +shoeShop.getShoeColour());







    }
}
