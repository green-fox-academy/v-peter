public class CodingHours {

    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        int semesterWeeks = 17;
        int codingDaily = 6;

        System.out.println(semesterWeeks * codingDaily * 5);
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        double d = 5. * 6 / 52 * 100;
        System.out.printf("%.2f%n", d);
//        int intValue = 523456;
//        System.out.printf("%08d", intValue);
    }

}
