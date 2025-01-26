public class count_string {
    public static void main(String[] args) {
        String s="HeLlO";
        int n=s.length();
        int count1=0;
        int count2=0;
        char ch=s.charAt(n-1);
        
       
        if(ch>='A'&&ch<='Z'){
            for(int j=0;j<n;j++){
            count1 =count1+1;
            }
            System.out.println(count1);
        }
        else if(ch>='a'&&ch<='z'){
            for(int j=0;j<n;j++){
            count2=count2+1;
            }
            System.out.println(count2);
        }
    }
}
