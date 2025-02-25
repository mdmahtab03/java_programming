
import java.util.Scanner;

public class AreaOfShaps{
   
  
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double h,w,area;
        System.out.println("To find area of sqaure enter side");
        h=sc.nextDouble();
        area=h*h;
        System.out.println("Area of square = " +area);
        System.out.println("To find the area of rectangle enter height & width");
        h=sc.nextDouble();
        w=sc.nextDouble();
        area=h*w;
        System.out.println("Area of rectangle ="+ area);
        System.out.println("To find the area of triangle enter base & height");
        w=sc.nextDouble();
        h=sc.nextDouble();
        area=(h*w)/2;
        System.out.println("Area of triangle ="+area);
        System.out.println("Than You for using area finder bye...................");

        sc.close();
    }
}