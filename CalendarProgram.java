public class CalendarProgram {
    public static void main(String[] args) {
        calendar();
    }

    public static void calendar() {
        // Print numbers 0 to 11
        System.out.println("Numbers 0 to 11:");
        for (int i = 0; i < 12; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Calendar data
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Print calendar
        System.out.println("Calendar:");
        for (int i = 0; i < 12; i++) {
            System.out.println("\n" + months[i] + ":");
            for (int day = 1; day <= daysInMonth[i]; day++) {
                System.out.print(day + " ");
                if (day % 7 == 0) {
                    System.out.println(); // Line break every 7 days
                }
            }
            System.out.println(); // Line break after each month
        }
    }
}





