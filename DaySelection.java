public class DaySelection {
    public static void main(String[] args) {
        int dayNumber = 2;

        switch (dayNumber) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("invalid number");
        }
    }
}