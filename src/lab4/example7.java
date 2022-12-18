package lab4;

public class example7 {
    public static void main(String[] args) {
        int sizeRow = 6;
        int sizeCol = 6;

        int value = 1;

        int[][] arr = new int[sizeRow][sizeCol];

        for (int i = 0; i < sizeCol; i++) {
            arr[0][i] = value;
            value++;
        }
        for (int j = 1; j < sizeRow; j++) {
            arr[j][sizeCol - 1] = value;
            value++;
        }
        for (int i = sizeCol - 2; i >= 0; i--) {
            arr[sizeRow - 1][i] = value;
            value++;
        }
        for (int j = sizeRow - 2; j > 0; j--) {
            arr[j][0] = value;
            value++;
        }
        int row = 1;
        int col = 1;

        while (value < sizeRow * sizeCol) {

            while (arr[row][col + 1] == 0) {
                arr[row][col] = value;
                value++;
                col++;
            }
            while (arr[row + 1][col] == 0) {
                arr[row][col] = value;
                value++;
                row++;
            }
            while (arr[row][col - 1] == 0) {
                arr[row][col] = value;
                value++;
                col--;
            }
            while (arr[row - 1][col] == 0) {
                arr[row][col] = value;
                value++;
                row--;
            }
        }
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = value;
                }
            }
        }
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeCol; j++) {;
                    System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
