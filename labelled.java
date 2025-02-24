import java.util.*;
class labelled
{
    public static void main(String[] args)
    {
      x:  for(int i=1;i<=10;i++)
        {
          y:  for(int j=2;j<=5;j++)
            {
        
                if(i==5)
                break x;
                System.out.print(j);
            }
        }
    }
}