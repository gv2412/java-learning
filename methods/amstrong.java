import java.util.*;
public class amstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(armstrong(n));
    }
    public static String armstrong(int n){
        int temp=n;
        int res=0;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        n=temp;
        while(n>0){
            int d=n%10;
            res=res+(int)Math.pow(d,count);
            n=n/10;
        }
        if(res==temp){
            return "armstrong";
        }
        else{
            return "not armstrong";
        }
    }
}