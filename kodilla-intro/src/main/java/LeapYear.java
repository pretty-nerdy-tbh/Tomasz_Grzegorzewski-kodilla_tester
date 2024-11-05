public class LeapYear {
    public static void main(String[] args) {
        int year = 2018;

        System.out.println(year);

        if (year % 4 > 0) {
            System.out.println("Ten rok nie jest przestępy");
        } else if (year % 100 > 0 ) {
            System.out.println("Ten rok jest przestępy");
        } else if (year % 400 > 0) {
            System.out.println("Ten rok nie jest przestępy");
        } else {
            System.out.println("Ten rok jest przestępy");
        }
    }
}
