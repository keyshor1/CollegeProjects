public class Pattern2   
{   
    public static void main(String args[])   
    {   
        //i is used for rows and j is used for columns      
        //row denotes the number of rows that is meant to be printed  
        int i, j, row=5;   
        //using outer loop for rows  
        for(i=0; i<row; i++)   
        {   
            //using inner loop for columns  
            for(j=0; j<=i; j++)   
            {   
                //printing stars as a result   
                System.out.print("* ");   
            }   
            //changing line while printing
            System.out.println();   
        }   
    }   
}