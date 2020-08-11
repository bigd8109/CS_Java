package DynamicProgramming;

/*find the minimum cost to reach cell (m, n) from cell (0, 0)*/

public class MinimumCostMatrix {
    public static void main(String[] args) {
        int[][] matrix =
                {
                    { 4, 7, 8, 6, 4 },
                    { 6, 7, 3, 9, 2 },
                    { 3, 8, 1, 2, 4 },
                    { 7, 1, 7, 3, 7 },
                    { 2, 9, 8, 9, 3 }
                };

        System.out.println("matrix rows = " + matrix.length);
        System.out.println("matrix columns = " + matrix[0].length);
        MinimumCostMatrix mcm = new MinimumCostMatrix();
        int res = mcm.cost(matrix, 0, 0);
        System.out.println("Result = " + res);

        int res2 = mcm.cost2(matrix, matrix.length, matrix[0].length);
        System.out.println("Result2 = " + res2);

    }

    //go from cell 0,0 to m,n
    private int cost(int[][] matrix, int m, int n) {
        if (m == matrix.length || n == matrix[0].length)
            return Integer.MAX_VALUE;

        if (m == matrix.length-1 && n == matrix[0].length-1) {
            return matrix[m][n];
        }
        return matrix[m][n] + Math.min(cost(matrix, m+1, n), cost(matrix, m, n+1));
    }

    //go from cell m,n to 0,0
    private int cost2(int[][] matrix, int m, int n) {
        if (m == 0 || n == 0)
            return Integer.MAX_VALUE;

        if (m == 1 && n == 1) {
            return matrix[m-1][n-1];
        }
        return matrix[m-1][n-1] + Math.min(cost2(matrix, m-1, n), cost2(matrix, m, n-1));
    }
}
