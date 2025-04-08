public class legth_string_without_library_func {
    public static void main(String[] args) {
        String s="hello world";
        int count=0;
        //char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){  
            count++;
        }
        System.out.println(count);
    }
}
