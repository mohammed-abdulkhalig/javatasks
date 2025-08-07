public class FullIntegration {
    public static void main(String[] args) {
        String name = "Mohammed";
        int age = 21;
        double height = 1.75;
        char gender = 'M';
        final int MAX_USERS = 100;

        int a = 10;
        int b = 5;

        System.out.println("Name: " + name.toUpperCase());
        System.out.println("Age: " + age);
        System.out.println("Height: " + Math.round(height));
        System.out.println("Gender: " + gender);
        System.out.println("Max Users: " + MAX_USERS);

        System.out.println("Sum: " + (a + b));
        System.out.println("a > b: " + (a > b));

        System.out.println("Square Root of a: " + Math.sqrt(a));
        System.out.println("Absolute of b: " + Math.abs(b));

        System.out.println("Welcome \"User\"\nEnjoy\tyour experience at C:\\Java");
    }
}