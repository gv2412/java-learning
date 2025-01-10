//without args with return type
import java.util.*;
class basic_type1{
    public static void main(String[] args){
        basic_type1 obj=new basic_type1();
        int res=obj.area();
        System.out.println("Area of rectangle is "+res);
    }
    public static int area(){
        Scanner s=new Scanner(System.in);
        int length=s.nextInt();
        int breath=s.nextInt();
        return length*breath;
    }
}