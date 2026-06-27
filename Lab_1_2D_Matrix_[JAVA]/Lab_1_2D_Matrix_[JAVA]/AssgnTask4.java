//Assignment Task 04: Rotate Secret
class AssgnTask4 {
    public static void rotateSecret(Character[][] board) {
        int l = board.length / 2;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < (l - i); j++) {
                rotate(board, i);
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
        }
        System.out.println();
    }

    public static void rotate(Character[][] b, int pos) {
        Character br = b[pos][pos];
        for (int i = pos; i < (b.length - pos - 1); i++) {
            b[i][pos] = b[i + 1][pos];
        }
        for (int i = pos; i < (b.length - pos - 1); i++) {
            b[b.length - pos - 1][i] = b[b.length - pos - 1][i + 1];
        }
        for (int i = (b.length - pos - 1); i > pos; i--) {
            b[i][b.length - pos - 1] = b[i - 1][b.length - pos - 1];
        }
        for (int i = (b.length - pos - 1); i > pos; i--) {
            b[pos][i] = b[pos][i - 1];
        }
        b[pos][pos + 1] = br;
    }

    public static void main(String[] args) {
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
                { 'T', 'A', 'U', 'S' },
                { 'A', 'R', 'I', '.' },
                { 'D', 'T', 'T', 'N' },
                { 'S', 'C', 'F', 'U' }
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
                { 'D', 'A', 'T', 'A' },
                { 'S', 'T', 'R', 'U' },
                { 'C', 'T', 'I', 'S' },
                { 'F', 'U', 'N', '.' }
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);

        System.out.print("\nYour Output:\n");
        rotateSecret(board);
        Arr.print2D(board);

        if (Arr.compare2D(outputBoard, board))
            System.out.print("Test 1 Success");
        else
            System.out.println("Test 1 FAILED");

        System.out.print("\n===========Test#2===========\n");

        board = new Character[][] {
                { 'O', 'R', 'I', 'R', 'N', 'P' },
                { 'G', 'S', 'A', 'A', 'L', 'R' },
                { 'L', 'M', 'N', 'O', 'N', 'Y' },
                { 'A', 'H', 'U', 'O', 'O', 'P' },
                { 'T', 'F', 'C', 'T', 'H', 'S' },
                { 'E', 'D', 'Y', 'O', 'C', 'K' }
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][] {
                { 'A', 'L', 'G', 'O', 'R', 'I' },
                { 'T', 'H', 'M', 'S', 'A', 'R' },
                { 'E', 'F', 'U', 'N', 'A', 'N' },
                { 'D', 'C', 'O', 'O', 'L', 'P' },
                { 'Y', 'T', 'H', 'O', 'N', 'R' },
                { 'O', 'C', 'K', 'S', 'P', 'Y' }
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
        Arr.print2D(outputBoard);

        System.out.print("\nYour Output:\n");
        rotateSecret(board);
        Arr.print2D(board);

        if (Arr.compare2D(outputBoard, board))
            System.out.print("Test 2 Success");
        else
            System.out.println("Test 2 FAILED");
    }
}
