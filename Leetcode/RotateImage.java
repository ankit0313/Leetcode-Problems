class Solution {
    public void rotate(int[][] m) {
        int row=m.length;
        int col=m[0].length;
        int[][] arr=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[j][i]=m[i][j];
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length/2; j++){
                int temp =0;
                 temp = arr[i][j];
                arr[i][j] = arr[i][arr.length-1-j];
                arr[i][arr.length-1-j] = temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                m[i][j]=arr[i][j];
            }
        }
    }
}

// This code was contributed by @f-mohamed-abdullah
