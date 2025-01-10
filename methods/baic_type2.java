//without args without return type
import java.util.*;
public class baic_type2 {
    public static void area(){
        Scanner s=new Scanner(System.in);
        int length=s.nextInt();
        int height=s.nextInt();
        System.out.println("Area of triangle is "+(length*height)/2);
    }
    public static void main(String[] args){
       area();
    }
}
