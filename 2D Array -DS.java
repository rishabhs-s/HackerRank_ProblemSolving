//just iterate throug the given shape using for loops and sum the elements and print the max elements


static int hourglassSum(int[][] arr) {
       int  max_sum=Integer.MIN_VALUE;
        int rows=arr.length;
        int coloums=arr[0].length;
        for (int i=0;i<rows-2;i++){
            for(int j=0;j<coloums-2;j++){
                int current_sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];//the hourglass made and sum through this statement
               max_sum=Math.max(current_sum,max_sum);
            }
        }
    return max_sum;

    }
