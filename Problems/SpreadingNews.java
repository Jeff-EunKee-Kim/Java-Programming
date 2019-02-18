package apt;
import java.util.*;
import java.util.stream.Collectors;

public class SpreadingNews {
   public int minTime(int[] supervisors) {
      int d[] = new int[supervisors.length];
      Map<Integer, List<Integer>> tree = new HashMap<>();
      for(int i = 0 ; i < supervisors.length ; i ++)
         tree.put(i, new ArrayList());

      for(int i = 0 ; i < supervisors.length ; i ++) {
         List<Integer> lst = tree.get(supervisors[i]);
         lst.add(i);
         tree.put(supervisors[i], lst);
      }

      for(int i = supervisors.length-1 ; i >= 0 ; i --) {
         List<Integer> childrenTime = tree.get(i).stream().map(k -> d[k]).sorted().collect(Collectors.toList());

         d[i] = -1;
         for(int j = 0 ; j < childrenTime.size() ; j ++) {
            d[i] = Math.max(d[i], childrenTime.size() + i-j + 1);
         }
      }

      return d[0];
   }
}
