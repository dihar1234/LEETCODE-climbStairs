class Solution {
    public int climbStairs(int n) {
        
        if (n==1){
            return 1;//because there is only one way to climb one step
        }
        else if (n==2){
            return 2;//because there are two ways to climb the when there are two steps 
        }
        else{
            int arr[]= new int[n];
            arr[0]=1;
            arr[1]=2;
            for(int i=2;i<n;i++){
                arr[i]=arr[i-1]+arr[i-2];
                //Example if n=4, then the maximum value of i will be 3
                //arr[2]=arr[1]+arr[0]; 1+2 which gives 3
        //arr[3]=arr[2]+arr[1]; 3+1 which gives 4 and it will be returned by the function
            }
            return arr[n-1];
            
        }
    }
}
