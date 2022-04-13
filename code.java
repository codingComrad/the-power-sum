    public  static int rec(int tar, int k, int idx){
        
        if(tar ==0)return 1;
            
        int count =0;
        for(int i =idx+1; i<=tar;i++){
            int pwr = (int)Math.pow(i,k);
            if(tar-pwr>=0){
                count+=rec(tar-pwr,k , i);
                
            }else break;
        }
        return count;
    }
    
    public static int powerSum(int X, int N) {
    // Write your code here
    return rec(X,N,0);
    }
