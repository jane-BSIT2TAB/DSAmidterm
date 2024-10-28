import java.util.Scanner;

public class LargadoScoresArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];
        int count = 0;

        while (true) {
            System.out.println("--- Student Scores ---");
            System.out.println("1. Add Score");
            System.out.println("2. Delete Score");
            System.out.println("3. View All Scores");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (count < scores.length) {
                        System.out.print("Enter student score: ");
                        int score = scanner.nextInt();
                        scores[count] = score;
                        count++;
                        System.out.println("Score added.");
                    } else {
                        System.out.println("Array is full. Cannot add more scores.");
                    }
                    break;

                case 2:
                    if (count > 0) {
                        System.out.println("Enter index of score to delete (0 to " + (count - 1) + "): ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < count) {
                            for (int i = index; i < count - 1; i++) {
                                scores[i] = scores[i + 1];
                            }
                            count--;
                            System.out.println("Score deleted.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("No scores to delete.");
                    }
                    break;

                case 3:
                    System.out.print("Scores: ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(scores[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}