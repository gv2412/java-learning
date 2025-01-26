import java.util.Arrays;  
import java.util.Scanner;  

class TreeNode {  
    int val;  
    TreeNode left, right;  

    public TreeNode(int val) {  
        this.val = val;  
        left = right = null;  
    }  
}  

public class BalancedBST {  
    
    // Build a balanced BST from sorted array  
    public static TreeNode buildBalancedBST(int[] arr, int start, int end) {  
        if (start > end) {  
            return null;  
        }  
        
        int mid = (start + end) / 2;  
        TreeNode root = new TreeNode(arr[mid]);  
        
        root.left = buildBalancedBST(arr, start, mid - 1);  
        root.right = buildBalancedBST(arr, mid + 1, end);  
        
        return root;  
    }  
    
    // Pre-order traversal with required output format  
    public static void preOrder(TreeNode node) {  
        if (node == null) {  
            return;  
        }  
        
        System.out.print(node.val + " <- ");  
        
        if (node.right != null) {  
            System.out.print(node.left.val);  
        } else {  
            System.out.print(".");  
        }  
        
        System.out.print(" -> ");  
        
        if (node.left != null) {  
            System.out.print(node.right.val);  
        } else {  
            System.out.print(".");  
        }  
        
        System.out.println();  
        
        preOrder(node.left);  
        preOrder(node.right);  
    }  
    
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        // Input number of nodes  
        int N = scanner.nextInt();  
        
        int[] arr = new int[N];  
        
        // Input unique integers  
        for (int i = 0; i < N; i++) {  
            arr[i] = scanner.nextInt();  
        }  

        // Sort the array to create a balanced BST  
        Arrays.sort(arr);  
        
        // Build the balanced BST  
        TreeNode root = buildBalancedBST(arr, 0, N - 1);  
        
        // Output pre-order traversal in the required format  
        preOrder(root);  
        
        scanner.close();  
    }  
}