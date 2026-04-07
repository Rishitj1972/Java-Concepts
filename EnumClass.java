enum Laptop
{
    Asus(58000),Lenovo(55000),Hp(52000),Dell;

    private Laptop() {  // Default Constructor for Dell where price is not mentioned
        price = 500;
    }

    private int price;

    private Laptop(int price) {  // Parameterised Constructor.
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass
{
    public static void main(String[] args) {
        
        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " : "+lap.getPrice());
        }
    }
}