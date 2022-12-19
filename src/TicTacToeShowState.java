public class TicTacToeShowState {
    public static void main(String[] args) {
        char[][] state = {
                { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
        };

        do {
            showBoard(state);
            doStep(state);
        } while(! isTerminated(state));
        showResult(state);
    }

    private static void showBoard(char[][] state) {
        for (int i = 0; i < state.length; ++i) {
            System.out.println("" + state[i][0] + state[i][1] + state[i][2]);
        }
    }

    private static void doStep(char[][] state) {
    }

    private static boolean isTerminated(char[][] state) {
        return true;
    }

    private static void showResult(char[][] state) {
    }
}
