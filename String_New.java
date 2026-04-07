class String_New
{

    public static void main(String[] args) {

        String str = "Hello, World!";
        System.out.println(str); // Using string literal

        String str2 = new String("Hello, Java!");
        System.out.println(str2); // Using new keyword to create a string object

        String s1 = "Rishi";
        String s2 = "Rishi";

        if (s1 == s2) {
            System.out.println("s1 and s2 reference the same object in the string pool.");
        } else {
            System.out.println("s1 and s2 reference different objects.");
        }
        // if its true because both s1 and s2 point to the same string literal in the string pool.

    }
}