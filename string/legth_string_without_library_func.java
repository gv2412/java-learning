public class legth_string_without_library_func {
    public static void main(String[] args) {
        String s="hello";
        int count=0;
        //char c[]=s.toCharArray();
        for(char c:s.toCharArray()){
            count++;
        }
        System.out.println(count);
    }
}
