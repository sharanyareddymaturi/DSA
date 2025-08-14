class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int l = 0, r = n - 1;
        int t = 0, b = n - 1;
        int val = 1;

        while (l <= r && t <= b) {
            // top row: left -> right
            for (int i = l; i <= r; i++) {
                matrix[t][i] = val++;
            }
            t++;

            // right column: top -> bottom
            for (int i = t; i <= b; i++) {
                matrix[i][r] = val++;
            }
            r--;

            // bottom row: right -> left (only if there's still a bottom row)
            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    matrix[b][i] = val++;
                }
                b--;
            }

            // left column: bottom -> top (only if there's still a left column)
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    matrix[i][l] = val++;
                }
                l++;
            }
        }

        return matrix;
    }
}
