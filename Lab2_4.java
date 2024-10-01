public class Lab2_4 
{
    public int[] moveValue(int[] arr, int val)
    {
        int i=0, j=1, temp=0, numOfVal=0;
        for(int counting=0; counting<arr.length; counting++)
        {
            if(arr[counting]==val)
            {
                numOfVal++;
            }
        }
        for(int repeat=0; repeat<numOfVal; repeat++)
        {
            while(j<arr.length)
            {
                if(arr[i]==val)
                {
                    temp=arr[j];
                    arr[j++]=arr[i];
                    arr[i++]=temp;
                }
                else
                {
                    i++;
                    j++;
                }
            }
            i=0; j=1;
        }
        return arr;
    }    
    // public static void main(String[] args) 
    // {
    //     Lab2_4 obj4= new Lab2_4();
    //     int[] Lab4Trial={1, 2, 3, 4, 4, 5, 4, 6, 7, 8};
    //     Lab4Trial=obj4.moveValue(Lab4Trial, 4);
    //     for(int i=0; i<Lab4Trial.length; i++)
    //     {
    //         System.out.print(Lab4Trial[i]+" ");
    //     }     
    // }
}
