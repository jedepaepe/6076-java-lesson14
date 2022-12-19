import java.util.Scanner;

public class TicTacToeBasicX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] state = {
                { '-', '-', '-' },
                { '-', '-', '-' },
                { '-', '-', '-' },
        };

        do {
            showBoard(state);
            doStep(state, scanner);
        } while(! isTerminated(state));
        showResult(state);
    }

    private static void showBoard(char[][] state) {
        for (int i = 0; i < state.length; ++i) {
            System.out.println("" + state[i][0] + state[i][1] + state[i][2]);
        }
    }

    private static void doStep(char[][] state, Scanner scanner) {
        int line = scanner.nextInt();
        int column = scanner.nextInt();
        state[line][column] = 'X';
    }

    private static boolean isTerminated(char[][] state) {
        return false;
    }

    private static void showResult(char[][] state) {
    }
}
