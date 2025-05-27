public class CalendarProgram {
    public static void main(String[] args) {
        calendar();
    }

    public static void calendar() {
        // Print numbers 0 to 11 before the calendar
        for (int i = 0; i < 12; i++) {
            System.out.println(i);
        }

        System.out.println(); // Optional: adds a line break

        // Calendar data
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30,
                             31, 31, 30, 31, 30, 31};

        // Print calendar
        for (int i = 0; i < 12; i++) {
            System.out.println(months[i] + ":");
            for (int j = 1; j <= daysInMonth[i]; j++) {
                System.out.print(j + " ");
            }
            System.out.println("\n");
        }
    }
}
