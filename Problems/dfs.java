public class dfs {
   public int dfs1(int layout[][], int x, int y) {
      if (x < 0 || y < 0 || x >= layout.length || y >= layout[0].length) return 0;
      else if (layout[y][x] == 0) return 0;
      else if (layout[y][x] == 9) return 1;
      else {
         layout[y][x] = 0;
         int res = dfs1(layout, x, y + 1) + dfs1(layout, x, y - 1) + dfs1(layout, x - 1, y) + dfs1(layout, x + 1, y);
         return res > 0 ? 1 : 0;
      }
   }

   public int dfs2(int layout[][], int visited[][], int x, int y){
      if (x < 0 || x >= layout.length || y < 0 || y >= layout.length) return 0;
      else if (layout[y][x] == 9) {
         return 1;
      }else if(layout[y][x] == 0){
         return 0;
      }else if(visited[y][x] == 1) {
         return 0;
      }else {
         visited[y][x] = 1;
         int res = dfs2(layout, visited, x,y+1) +
               dfs2(layout, visited, x, y-1) +
               dfs2(layout, visited, x+1, y) +
               dfs2(layout, visited, x-1, y);
         return res >0 ? 1: 0;

      }
   }
   public boolean dfs3(int[][] layout, int visited [][], int row, int col){
      if(row < 0 || col < 0 || row >= layout.length || col >= layout[0].length) return false;
      else if (layout[row][col] == 0) return false;
      else if (layout[row][col] == 9) return true;
      else if (visited[row][col] == 1) return false;
      else{
         visited[row][col] =1;
         boolean res = dfs3(layout, visited, row+1, col) ||
                        dfs3(layout, visited, row-1, col) ||
                        dfs3(layout, visited, row, col+1) ||
                        dfs3(layout, visited, row, col-1);
         return false;
      }
   }
}