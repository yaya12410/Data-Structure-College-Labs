public class Lab2_2
{
    public int[] sumEvenOdd(int[] arr)
    {
        if(arr.length==0)
        {
            int[] empty={0, 0};
            return empty;
        }
        int sumEven=0;
        int sumOdd=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                sumEven=sumEven+arr[i];
            }
            else
            {
                sumOdd=sumOdd+arr[i];
            }
        }
        int[] calculated={sumEven, sumOdd};
        return calculated;
    }
    // public static void main(String[] args)
    // {
    //     Lab2_2 obj2=new Lab2_2();
    //     int[] Array={1, 2, 3, 4, 5, 6};
    //     int[] result=obj2.sumEvenOdd(Array);
    //     for(int i=0; i<result.length; i++)
    //     {
    //         System.out.print(result[i]+" ");
    //     }   
    // }
}