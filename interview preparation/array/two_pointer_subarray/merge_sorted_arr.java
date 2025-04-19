import java.util.*;
public class merge_sorted_arr {
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);    
            int n=s.nextInt();
            int m=s.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[m];
            for(int i=0;i<n;i++){
                arr1[i]=s.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=s.nextInt();
            }
            merge_sort(arr1,arr2,n,m);
        }
        public static void merge_sort(int a1[],int a2[],int n,int m){
            int res[]=new int[n+m];
            for(int i=0;i<n;i++){
                res[i]=a1[i];
            }
            for(int i=0;i<m;i++){
                res[n+i]=a2[i];
            }
            System.out.print(Arrays.toString(res));
        }
}
