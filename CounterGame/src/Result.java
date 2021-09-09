
class Result {

    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */
     
    public static String counterGame(long n) {
     int counter=0;
     while(n!=1){
         long r= checkIfPowerOfTwo(n);
         if(r!=0){
             counter++;
             n=n-r;
         }
         else{
             counter++;
             n=n/2;
         }
     }
     if(counter%2!=0) {
    	 return "Lousie";
     }
     else {
    	 return "Richard";
     }
    }
    public static long checkIfPowerOfTwo(long n){
        long i;   
        long res=2;
    	for( i=2;i<n;i=i*2) {
        	   res=i;
           }
           if(i==n) {
        	   return 0;
           }
           else {
        	   return res;
           }
    }

}
