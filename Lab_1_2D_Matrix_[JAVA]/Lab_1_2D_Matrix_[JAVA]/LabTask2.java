//Lab Task 02: Decryption Process
class LabTask2 {

    // Complete this method so that it gives the Expected Output
    public static Integer[] decryptMatrix(Integer[][] matrix) {
        Integer[] arr = new Integer[matrix[0].length];
        Integer[] arr1 = new Integer[matrix[0].length - 1];
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            arr[i] = sum;
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i + 1] - arr[i];
        }
        return arr1;
    }
    public static void main(String[] args) {
        Integer[][] matrix = {
                { 1, 3, 1 },
                { 6, 4, 2 },
                { 5, 1, 7 },
                { 9, 3, 3 },
                { 8, 5, 4 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        System.out.println("\nExpected Output:\n[ -13 1 ]");
        Integer[] returned_val_1 = decryptMatrix(matrix);
        System.out.print("\nYour Output:\n");
        Arr.print(returned_val_1);

    }
}
