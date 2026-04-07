class Type_Conversion {

    public static void main(String[] args) {

        int a = 10;

        double b = a; // Implicit conversion from int to double

        int c = (int) b; // Explicit conversion from double to int

        // Implicit is called Type Conversion
        // Explicit is called Type Casting

        System.out.println("Value of a: " + b);
        System.out.println("Value of b: " + c);

        float f = 12.5f;

        int d = (int) f; // Explicit conversion from float to int

        System.out.println("Value of f: " + d);
    }
}