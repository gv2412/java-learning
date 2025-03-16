import java.util.*;
public class array_input {
    public static void main(String[] args){

    Scanner s=new Scanner(System.in);
    int arr[]=new int[10];
    for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
    }
    for(int j=arr.length-1;j>=arr.length/2;j--){
        System.out.print(arr[j]+" ");
    }
    System.out.println();
    for(int j=0;j<arr.length/2;j++){
        System.out.print(arr[j]+" ");
    }
    System.out.println();
    for(int j=arr.length/2;j<arr.length;j++){
        System.out.print(arr[j]+" ");
    }
    System.out.println();
    for(int j=(arr.length/2)-1;j>=0;j--){
        System.out.print(arr[j]+" ");
    }
}
}