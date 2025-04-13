package array;
class betting_game
{
    static int betBalance(String result)
    {
        // code here
        int initialSum =4;
        int currentsum = initialSum;
        int betamount=1;
        for (int i = 0;i<result.length();i++){
            if (currentsum<betamount){
                return -1;
            }
            if(result.charAt(i)=='W'){
                currentsum += betamount;
                betamount=1;
            }
            else if (result.charAt(i)=='L'){
                currentsum -= betamount;
                betamount *=2;;
            }
        }
        return currentsum;
    }
}