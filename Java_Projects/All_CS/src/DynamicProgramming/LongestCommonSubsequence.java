package DynamicProgramming;

public class LongestCommonSubsequence {

    public static void main (String[] args) {
        String s1 = "AGGTABDCAC";
        String s2 = "GXTXAYBKCC";

        char[] ar1=s1.toCharArray();
        char[] ar2=s2.toCharArray();
        int m = ar1.length;
        int n = ar2.length;

        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        System.out.println("LCS = " + lcs.findLCS(ar1, ar2, m, n));
        System.out.println("LCS 2 = " + lcs.findLCS2(ar1, ar2, m, n));
        System.out.println("LCS 3 = " + lcs.findLCS3(ar1, ar2, m, n));
    }

    private int max(int a, int b) {
        return (a > b ) ? a : b;
    }

    //find LCS of 2 arrays having size m and n
    private int findLCS(char[] ar1, char[] ar2, int m, int n) {
//        System.out.println("Compare: " + ar1[m] + " - " + ar2[n]);
        if (m == 0 || n == 0) {
            return 0;
        }
        if (ar1[m - 1] == ar2[n - 1]) {
//            System.out.println("Compare: " + ar1[m-1] + " - " + ar2[n-1]);
            return 1 + findLCS(ar1, ar2, m - 1, n - 1);
        } else {
            return max(findLCS(ar1, ar2, m, n - 1), findLCS(ar1, ar2, m - 1, n));
        }
    }


    //find LCS of 2 arrays having size m and n - Bottom up
    private int findLCS2(char[] ar1, char[] ar2, int m, int n) {
        int[][] L = new int[m+1][n+1];
        for (int i = 0; i <=m; i++) {
            for (int j = 0; j <=n; j++) {
                if (i ==0 || j == 0) {
                    L[i][j] = 0;
                }
                else if (ar1[i - 1] == ar2[j - 1]) {
                    L[i][j] = L[i-1][j-1] + 1;
                } else {
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
                }
            }
        }
        return L[m][n];
    }

    //find LCS of 2 arrays having size m and n - Bottom up
    private int findLCS3(char[] ar1, char[] ar2, int m, int n) {
        int[][] L = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (ar1[i] == ar2[j]) {
                    L[i+1][j+1] = L[i][j] + 1;
                } else {
                    L[i+1][j+1] = max(L[i][j+1], L[i+1][j]);
                }
            }
        }
        return L[m][n];
    }
}
