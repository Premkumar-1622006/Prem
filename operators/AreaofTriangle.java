import java.util.Scanner;
public class AreaofTriangle{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter base of Triangle:");
    int base=sc.nextInt();
    System.out.println("Enter height of Triangle:");
    int height=sc.nextInt();
    int area=(base*height)/2;
    System.out.println("Area of Triangle is:"+area);

    }
}