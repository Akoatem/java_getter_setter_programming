public class Shoe {
// here you declare shoe variables
// the variables has to start with capital letters to differentiate with main method variables
    Double ShoeSize = 0.0;
    String ShoeType = "";
    String ShoeColour = "";

    // create a contructor class
    public Shoe(){
        System.out.println("We are now in shoe class");
    }// end of contructor
    public Shoe(Double InputShoeSize, String InputShoeType, String InputShoeColour){
        ShoeSize = InputShoeSize;
        ShoeType = InputShoeType;
        ShoeColour = InputShoeColour;

    }
    // create a method to be call from the main main class
    public void NewArrival(){
        System.out.println("Welcome to the shoe shop");
    }

    // here you start to create getter and setter
    public void setShoeSize(double ShoeSizeInput){ // setter takes parameter
        ShoeSize = ShoeSizeInput;

    }
    public double getShoeSize(){   // getter do not take parameter
        return ShoeSize;
    }
    public void  setShoeType(String ShoeTypeInput){
        ShoeType = ShoeTypeInput;
    }
    public String getShoeType(){
        return ShoeType;
    }
    public  void setShoeColour(String ShoeColourInput) {
        ShoeColour = ShoeColourInput;

    }
    public String getShoeColour(){
        return ShoeColour;

    }
}
