public class TicTacToeSkeleton {
    public static void main(String[] args) {
        char[][] state = {
                { '-', '-', '-' },
                { '-', '-', '-' },
                { '-', '-', '-' },
        };

        do {
            showBoard(state);
            doStep(state);
        } while(isTerminated(state));
        showResult(state);
    }

    private static void showBoard(char[][] state) {
    }

    private static void doStep(char[][] state) {
    }

    private static boolean isTerminated(char[][] state) {
        return false;
    }

    private static void showResult(char[][] state) {
    }
}
