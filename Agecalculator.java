import java.util.Scanner;
public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for birth year
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Ask user for current year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        // Calculate age
        int age = calculateAge(birthYear, currentYear);

        // Print age
        System.out.println("Your age is: " + age);
        scanner.close();
    }

    /**
     * Calculates age based on birth year and current year.
     * 
     * @param birthYear  the year of birth
     * @param currentYear the current year
     * @return the age
     */
    public static int calculateAge(int birthYear, int currentYear) {
        return currentYear - birthYear;
    
    }
}

