public class facorial {
    static int factrecurrsion(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factrecurrsion(n-1);
        }
    }  
    
    static int factIttrative(int n){
        int res=1;
        for(int i=2;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String[] args) {

        System.out.println(factrecurrsion(9));
        System.out.println(factIttrative(9));

    }
}
