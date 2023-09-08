public class MatrixMultiplication {
    public static void main(String[] args)
    {
        int matrix1[][] = {{29,13,14},{3,1,7},{2000,2000,1974}};
        int matrix2[][] = {{21,9,5},{19,25,29},{2001,1991,1999}};

        multiplicationMatrix(matrix1, matrix2);
    }

    public static void multiplicationMatrix(int matrix1[][], int matrix2[][])
    {
        int rowLength = matrix1.length;//Retrieve the length of the row
        int colLength = matrix2.length;//Retrieve the length of the columns
        int result[][] = new int[rowLength][colLength]; //Create a new array

        for(int a = 0; a < rowLength; a++)
        {
            for(int b = 0; b<colLength; b++)
            {
                for(int c = 0; c < rowLength; c++)
                {
                    result[a][b] += matrix1[a][c]*matrix2[c][b];
                }
            }
        }

        System.out.println("The matrix resultant is ");
        for(int a = 0; a < rowLength; a++)
        {
            for(int b = 0; b<colLength; b++)
            {
                System.out.print(result[a][b] + " ");
            }
            System.out.println();
        }
    }

}