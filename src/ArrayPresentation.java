public class ArrayPresentation {
    public static void main(String[] args) {

int [][] matrix = new int[3][3];
int total = 0;
for (int row = 0; row < matrix.length ; row++){
    for (int column = 0; column < matrix [row].length; column++){
        matrix[row][column] = (int)(Math.random() * 100);
        total += matrix [row][column];
        System.out.println(matrix[row][column]);
    }
    System.out.println(total + " ");
    System.out.println();
}


/*

        matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3;
        matrix[1][0] = 4; matrix[1][1] = 5; matrix[1][2] = 6;
        matrix[2][0] = 7; matrix[2][1] = 8; matrix[2][2] = 9;



        { 1, 2, 3},
        { 4, 5, 6},
        { 7, 8, 9}
*/










    }
}
