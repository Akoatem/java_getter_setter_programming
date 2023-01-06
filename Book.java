public class Book {
    String title = "";
    double price = 0.0;
    int copiesInStock = 0;

    public Book(){
        System.out.println("This the book class");
    }
    public Book(String InputTitle, double InputPrice, int InCopiesInStock){
        title = InputTitle;
        price = InputPrice;
        copiesInStock = InCopiesInStock;

    }
    // getter and setter section
    public  void setTitle(String titleInput){
        title = titleInput;
    }
    public String getTitle(){
        return this.title;
    }
    public void setPrice(double priceInput){
        price = priceInput;
    }
    public double getPrice(){
        return  this.price;
    }
    public void setCopiesInStock(int copiesInStockInput){
        copiesInStockInput = copiesInStockInput;
    }
    public int getCopiesInStock(){
        return this.copiesInStock;
    }
    // to string brings out the value format
    public String toString(){
        return String.format ("Book: %S\nCost : R %.2f\nCopies in stock: %d\nTotal book value: R %.2f",getTitle(), getPrice(), getCopiesInStock(), totalBookValue());
    }
    // perform some calculation here
    private double discount(int num) {
        double amount = 0.0;

        if (num >=21)
            amount = price *(100 - 20)/100;
        else if (num >= 11 && num < 21)
            amount = price * (100 - 15)/100;

        else
            amount = price * (100 - 10)/100;
        setCopiesInStock(copiesInStock - num);
        return amount;

    }

    public double calcPrice(int num)
    {
        double amount = 0.0;
        amount = discount(num);
        return amount;
    }

    public double totalBookValue() {
        return copiesInStock * price;
    }

}
