//Assignment Task 01: Row Rotation Policy
class AssgnTask1 {
    public static Integer rowRotation(Integer examWeek, String[][] matrix) {
        String[] arr = new String[matrix.length];
        int rot = (examWeek - 1) % matrix.length;
        Integer rowNum = -1;
        
        for (int i = 0; i < rot; i++) {
            arr = matrix[matrix.length - 1];
            for (int j = matrix.length - 1; j > 0; j--) {
                matrix[j] = matrix[j - 1];
            }
            matrix[0] = arr;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
                if (matrix[i][j].length() == 2)
                    System.out.print(" | ");

                else
                    System.out.print("  | ");
                if (matrix[i][j].equals("AA"))
                    rowNum = i + 1;
            }
            System.out.println();
        }
        return rowNum;
    }
    public static void main(String[] args) {
        String[][] seatStatus = {
                { "A", "B", "C", "D", "E" },
                { "F", "G", "H", "I", "J" },
                { "K", "L", "M", "N", "O" },
                { "P", "Q", "R", "S", "T" },
                { "U", "V", "W", "X", "Y" },
                { "Z", "AA", "BB", "CC", "DD" }
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);

        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");
        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        Integer rowNumber = rowRotation(examWeek, seatStatus);
        System.out.println("Your friend AA will be on row " + rowNumber);
    }
}
