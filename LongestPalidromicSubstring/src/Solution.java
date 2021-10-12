class Solution {
    
    public String longestPalindrome(String s) {
        boolean[][] check = new boolean[s.length()][s.length()];
        int max=0;
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int k=0,j=i;j<s.length();j++,k++){
                if(i==0){
                    check[k][j]=true;
                }
                else if(i==1){
                    if(s.charAt(k)==s.charAt(j)){
                        check[k][j]=true;
                    }
                    else{
                        check[k][j]=false;
                    }
                }
                else{
                    if(s.charAt(k)==s.charAt(j) && check[k+1][j-1]==true){
                        check[k][j]=true;
                    }
                    else{
                        check[k][j]=false;
                    }
                }
                if(check[k][j]){
                    if(max<i+1){
                        max=i;
                        longest=s.substring(k,j+1);
                    }
                }
            }
        }
        return longest;
    }
    public int countSubstrings(String s) {
        int count=0;
        boolean[][] check = new boolean[s.length()][s.length()];
        for(int g=0;g<s.length();g++){
            for(int i=0,j=g;j<s.length();j++,i++){
                if(g==0){
                    check[i][j]=true;
                }
                else if(i==1){
                    if(s.charAt(i)==s.charAt(j)){
                        check[i][j]=true;
                    }
                    else{
                        check[i][j]=false;
                    }
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && check[i+1][j-1]==true){
                        check[i][j]=true;
                    }
                    else{
                        check[i][j]=false;
                    }
                }
                if(check[i][j]){
                    System.out.println(s.substring(i,j+1));
                    count++;
                }
                    
                }
            }
        return count;
        }   
    
   
}