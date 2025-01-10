//print first n prime number

public class ex11 {
    public static void main(String[] args) {
        
       int count=0;

        for (int i=1; i <= 50; i++) {
            if(50%i==0){
                count=count+1;
                if(count==2){
                    i=i+1;
                    System.out.println(i);
                }

            }
        
        }
    }
}
    

