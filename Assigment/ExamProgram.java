import java.util.Scanner;

public class ExamProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] courseWork = {10, 15, 20, 25, 30}; // course work results
        double finalExam = 50; // final exam result

        double courseWorkTotal = 0;
        for (double score : courseWork) {
            courseWorkTotal += score;
        }
        double totalScore = courseWorkTotal + finalExam;

        int totalAssessments = courseWork.length;
        int assessmentsDone = 0;
        for (double score : courseWork) {
            if (score > 0) {
                assessmentsDone++;
            }
        }

        boolean completedTwoThirds = (assessmentsDone >= (2.0 / 3.0) * totalAssessments);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. View course work results");
            System.out.println("2. View exam results");
            System.out.println("3. Exit the program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Course Work Results:");
                    for (int numb = 0; numb < courseWork.length; numb++) {
                        System.out.println("Assessment " + (numb + 1) + ": " + courseWork[numb]);
                    }
                    break;
                case 2:
                    if (completedTwoThirds) {
                        System.out.println("Final Exam Result: " + finalExam);
                        System.out.println("Total Score: " + totalScore);
                    } else {
                        System.out.println("Student must repeat the course work as they have not completed 2/3 of the assessments.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
