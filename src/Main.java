import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "1. What does 'give up' mean?\n" +
                        "a) Continue\n" +
                        "b) Start\n" +
                        "c) Quit\n" +
                        "d) Accept",
                "2. Choose the correct meaning of 'take off':\n" +
                        "a) Remove clothing\n" +
                        "b) Land (for a plane)\n" +
                        "c) Begin a journey\n" +
                        "d) Rest",
                // Додайте решту питань тут
        };
        String[] answers = {"c", "b"};
        int numQuestions = questions.length;
        int score = 0;

        System.out.println("Welcome to the Phrase Verbs Quiz!");

        while (true) {
            System.out.println("Enter 'q' to quit or any key to start the quiz:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            for (int i = 0; i < numQuestions; i++) {
                System.out.println(questions[i]);
                String userAnswer = scanner.nextLine().toLowerCase();

                if (userAnswer.equals("q")) {
                    break;
                }

                if (userAnswer.matches("[abcd]")) {
                    if (userAnswer.equals(answers[i])) {
                        score++;
                    }
                } else {
                    System.out.println("Invalid option! Please choose a valid answer (a, b, c, or d).");
                    i--; // Запитати те ж питання знову
                }
            }

            double percentage = (double) score / numQuestions * 100;
            System.out.println("Quiz completed! Your score: " + percentage + "%");
        }

        System.out.println("Goodbye!");
    }
}