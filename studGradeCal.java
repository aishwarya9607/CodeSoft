import java.util.Scanner;

public class studGradeCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumOfSubject = 4;

        int[] marks = new int[ NumOfSubject];

        // Input marks for each subject
        for (int i = 0; i <  NumOfSubject; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + " (out of 100):");
            marks[i] = scanner.nextInt();
        }

        // Calculate total marks and average percentage
        int totalMarks = 0;
        for (int mark : marks) {
           
            totalMarks=mark+totalMarks;
        }
        double AveragePercentage = (double) totalMarks /  NumOfSubject;

        // Assign grade
        String grade = AveragePercentage >= 80 ? "A" : AveragePercentage >= 60 ? "B" : "C";

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", AveragePercentage);
        System.out.println("Grade: " + grade);
    }
}

