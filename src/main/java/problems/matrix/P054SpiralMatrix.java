package problems.matrix;

import java.util.ArrayList;
import java.util.List;

public class P054SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int x=0, y=0;
        while(rows>0 && cols>0) {
            if(rows==1) {
                for(int i=0; i<cols; i++) {
                    ans.add(matrix[x][y++]);
                }
                break;
            } else if(cols==1) {
                for(int i=0; i<rows; i++) {
                    ans.add(matrix[x++][y]);
                }
                break;
            }
            for(int i=0; i<cols-1; i++) {
                ans.add(matrix[x][y++]);
            }
            for(int i=0; i<rows-1; i++) {
                ans.add(matrix[x++][y]);
            }
            for(int i=0; i<cols-1; i++) {
                ans.add(matrix[x][y--]);
            }
            for(int i=0; i<rows-1; i++) {
                ans.add(matrix[x--][y]);
            }
            rows -= 2;
            cols -= 2;
            x++;
            y++;
        }
        return ans;
    }
}
