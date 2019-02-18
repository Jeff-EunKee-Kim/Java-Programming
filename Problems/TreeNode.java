package Tree;

import listnode.ListNode;

public class TreeNode {
   TreeNode left, right;
   int data;
   TreeNode(int data){
      this.data = data;
   }

   public void insert(int value){
      if (value <= data) {
         if (left == null) {
            left = new TreeNode(value);
         } else {
            left.insert(value);
         }
      }
      if(value>data){
         if(right == null){
            right = new TreeNode(value);
         }else{
            right.insert(value);
         }
      }
   }

   public boolean contains(int value) {
      if (value == data) {
         return true;
      }else if(value < data){
         if(left == null){
            return false;
         }else{
            return left.contains(value);
         }
      }else{
         if (right == null){
            return false;
         }else{
            return right.contains(value);
         }
      }
   }
   public void printInOrder(TreeNode root){
      if (left != null){
         left.printInOrder(root);
      }
      System.out.println(data);
      if (right != null){
         right.printInOrder(root);
      }
   }

   public static void main(String[] args) {
      TreeNode root = new TreeNode(20);
      root.insert(11);
      root.insert(35);
      root.insert(1);
      root.insert(4);
//      printInOrder(root);
      System.out.println("hi");
   }
}
