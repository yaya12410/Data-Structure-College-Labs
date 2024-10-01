public class Lab2_3 {
    public double average(int[] arr)
    {
        if(arr.length==0)
        {
            return 0.0;
        }
        double avg=0.0;
        for(int i=0; i<arr.length; i++)
        {
            avg=avg+arr[i];
        }
        avg=avg/arr.length;
        return avg;
    }
    // public static void main(String[] args) 
    // {
    //     Lab2_3 obj3= new Lab2_3();
    //     int[] trialArray={1, 2, 3, 4, 5, 6};
    //     double result=obj3.average(trialArray);
    //     System.out.println(result);    
    // }
}
