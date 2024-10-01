public class Lab2_5 
{
    public int[][] transpose(int[][] arr)
    {
        int rows=0;
        int columns=0;
        for(int[] row : arr)
        {
            rows++;
            columns=row.length;
        }
        int transposeMatrix[][]=new int[rows][columns];
        
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<columns; j++)
            {
                transposeMatrix[i][j]=arr[j][i];
            }
        }
        return transposeMatrix;
    }
    // public static void main(String[] args) 
    // {
    //     Lab2_5 obj5=new Lab2_5();
    //     int[][] Array5={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //     Array5=obj5.transpose(Array5);
    //     for(int i=0; i<3; i++)
    //     {
    //         for(int j=0; j<3; j++)
    //         {
    //             System.out.print(Array5[i][j]);
    //         }
    //         System.err.println();
    //     }
    // }   
}
