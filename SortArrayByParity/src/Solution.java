class Solution {
    public int[] sortArrayByParityII(int[] num) {
        int size = num.length;
        for(int i=0;i<size;i++){
            if(i%2==0 || i==0){
                if(num[i]%2!=0){
                    for(int j=i+1;j<size;j++){
                        if(num[j]%2==0){
                            int temp = num[i];
                            num[i]=num[j];
                            num[j]=temp;
                            break;
                        }
                    }
                }
            }
            else{
                if(num[i]%2==0){
                    for(int j=i+1;j<size;j++){
                        if(num[j]%2==0){
                            int temp = num[i];
                            num[i]=num[j];
                            num[j]=temp;
                        }
                    }
                }
            }
            }
        return num;
            }
         
        }
   
    
    
