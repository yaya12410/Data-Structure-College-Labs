public class Lab2
{
    public static int[] reverse(int[] arr)
    {
        int num=arr.length;
        int[] output=new int[num];
        int j=0;
        for(int i=num-1; i>=0; i--){
            output[j++]=arr[i];
        }
        return output;
    }
    public static void main(String[] args)
    {
        int[] A={1, 2, 3, 4};   
        int[] reversed= reverse(A);
        for (int i = 0; i < reversed.length; i++) {
        System.out.print(reversed[i] + " ");
}
    }
}