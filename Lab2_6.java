public class Lab2_6 
{
    public int fibonacci(int n)
    {
        if(n==0 || n==1)
        {
            return 0;
        }
        else if(n==2 || n==3)
        {
            return 1;
        }
        else
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }    
    // public static void main(String[] args) 
    // {
    //     Lab2_6 obj6=new Lab2_6();
    //     System.out.println(obj6.fibonacci(7));    
    // }
}
