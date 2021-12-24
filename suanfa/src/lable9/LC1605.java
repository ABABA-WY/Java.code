package lable9;

public class LC1605 {
    public static void main(String[] args) {
        int []rowSum={3,8};
        int []colSum={4,7};
        int m=rowSum.length;
        int n= colSum.length;
        int [][] ret=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ret[i][j] = Math.min(rowSum[i],colSum[j]);
                rowSum[i]-=ret[i][j];
                colSum[j]-=ret[i][j];
            }
        }
    }
}
