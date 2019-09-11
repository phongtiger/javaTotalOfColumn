import java.util.Scanner;

public class TotalOfColumn {
    public static void main(String[] args) {
        Support support = new Support();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size arr: ");

        int length = scanner.nextInt();
        int[][] arr1 = support.creatArr(length);
        support.showArr(arr1);

        int total = 0;
        System.out.println("Enter the column: ");
        int column = scanner.nextInt();
        int realColumn = column -1;
        for (int row = 0; row < arr1[0].length; row++) {
            total += arr1[realColumn][row];
        }
        System.out.println("Total of column "+ column+ " is "+ total);

    }
}
class Support {
    public int[][] creatArr(int a) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[a][a];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println("Enter value of index matrix["+row+"]["+column+"]");
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }
    public void showArr(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println("\n");
        }
    }
}