public class string_rigth_triangle {
    public static void main(String[]args){
        String str="hello world";

        int n=str.length();
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
