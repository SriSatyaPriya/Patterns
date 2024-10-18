public class Dimension 
{
    public static void main(String[] args)
    {
        int i, sum=0;
        int[] a= {10,20,30,40,50,60,70,80,90,100};
        for(i=0;i<a.length;i++)
        {  
              if(i%2==0)
              {
               System.out.println(a[i]); 
              }    
        }
        System.out.println("Squared Numbers are: ");
        for(int j:a)
        {
            System.out.print(j*j +" ");
        }
        System.out.println();
        System.out.println("The Elements which are divisible by 2 are ");
        for(int j:a)
        {
            if(j%2==0)
        {
            System.out.print(j+ " ");
           sum=sum+j;
           
        }
        System.out.println();
        }
        System.out.println("sum:" +sum);
    }
}