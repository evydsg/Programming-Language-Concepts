public class MatrixMultiplication2 {
    public static void main(String[] args)
    {
        //This program will employ logic loops
        int matrix1[][] = {{29,13,14},{3,1,7},{2000,2000,1974}};
        int matrix2[][] = {{21,9,5},{19,25,29},{2001,1991,1999}};

        multiplicationMatrix(matrix1, matrix2);
    }
    public static void multiplicationMatrix(int matrix1[][], int matrix2[][])
    {
        int rowLength = matrix1.length;//Retrieve the length of the row
        int colLength = matrix2.length;//Retrieve the length of the columns
        int result[][] = new int[rowLength][colLength]; //Create a new array

        int a=0;
        while(a < rowLength)
        {
            int b = 0;//Initialize within the nexted loop
            while(b<colLength)
            {
                int c = 0; //Initialize within the nexted loop
                while(c< rowLength)
                {
                    result[a][b] += matrix1[a][c]*matrix2[c][b];
                    c++;
                }
                b++;
            }
            a++;
        }

        System.out.println("The matrix resultant is ");
        int d = 0;
        while(d < rowLength)
        {
            System.out.print("[");
            int e = 0;
            while(e<colLength)
            {
                System.out.print(result[d][e] + " ");
                e++;
            }
            d++;
            System.out.println("]");
        }

    }
}