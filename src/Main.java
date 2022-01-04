import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int year;

        System.out.println("Enter a year: ");
        year = userInput.nextInt();
        boolean isLeapYear = false;

        boolean isDivBy4 = year % 4 == 0;
        if (isDivBy4) {
            boolean isDivBy100 = year % 100 == 0;
            if (isDivBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
