import java.util.TreeMap;

public class LeafTrails {
    public String[] trails(TreeNode tree) {
        // replace with working code
        TreeMap<Integer, String> map = new TreeMap<>();

        recurse(tree, map, "");

        String[] ans = new String[map.size()];
        int index = 0; 
        for(int i :map.keySet()){
            ans[index] = map.get(i);
            index++;
        }
        return ans;
    }
    public void recurse(TreeNode tree, TreeMap<Integer, String> map, String current){
        
        if(tree == null){
            return;
        }
        if(tree.left == null && tree.right == null){
            map.put(tree.info, current);
            return; 
        }
        recurse(tree.left, map, current + "0");
        recurse(tree.right, map, current + "1");
    }
}