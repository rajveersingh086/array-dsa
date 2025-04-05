package array;

class sliding_window_technique{
    static int sliding(int arr[], int k ,int n){
        int max_sum = Integer.MIN_VALUE;
        for (int i =0;n>i+k-1;i++){
            int sum = 0;
            for(int j=0;j<k;j++){
                sum += arr[i+j];
            }
            max_sum = Math.max(max_sum,sum);
        }
            return max_sum;
        }
        public static void main (String args []){
       
        }
    }
