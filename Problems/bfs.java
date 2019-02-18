import javafx.util.Pair;

import java.util.*;

public class bfs {
   public int bfs(int layout[][]){
      Queue<Pair<Integer, Integer>> q = new LinkedList<>();
      int dir[][] = {{0,1}, {0,-1}, {1,0}, {-1,0}};
      q.add(new Pair(0,0));
      boolean visited[][] = new boolean [layout.length][layout[0].length];

      while(!q.isEmpty()){
         Pair<Integer, Integer> temp = q.remove();
         visited[temp.getKey()][temp.getValue()] = true;

         for (int i = 0; i< 4; i ++){
            int nr = temp.getKey() + dir[i][0];
            int nc = temp.getValue() + dir[i][1];
            if(nr < 0 || nc < 0 || nr >= layout.length || nc >= layout[0].length) continue;

            if(visited[nr][nc] == true || layout[nr][nc] == 0) continue;

            if (layout[nr][nc] == 9) return 1;
            q.add(new Pair(nr, nc));
         }
      }
      return 0;
   }


}

