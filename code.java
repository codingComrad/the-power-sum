    public  static int rec(int tar, int k, int idx){
        
        if(tar ==0)return 1; // base case
            
        int count =0;
        for(int i =idx+1; i<=tar;i++){
            int pwr = (int)Math.pow(i,k);  
            if(tar-pwr>=0){ // to restrict the unnecessary calls
                count+=rec(tar-pwr,k , i); // recursive call
                
            }else break;  //if any number leads to -ve target then we will break the loop as the numbers left will also di the same
        }
        return count; 
    }
    
    public static int powerSum(int X, int N) {
    // Write your code here
    return rec(X,N,0);
    }
