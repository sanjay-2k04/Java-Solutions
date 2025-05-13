class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int ac=0;
        int Ac=0;
        int dc=0;
        int sc=0;
        if(password.length()<7){
            return false;
        }
        for(int i=0;i<password.length()-1;i++){
            char s=password.charAt(i);
            if(s==password.charAt(i+1)){
                return false;
            }
           if(s>='a' && s<='z'){
              ac++;
           } 
           else if(s>='A' && s<='Z'){
             Ac++;
           }
           else if(s>='0' && s<='9'){
             dc++;
           }
           else{
             sc++;
           }
        }
        int y=password.charAt(password.length()-1);
        if(y>='a' && y<='z'){
              ac++;
           } 
           else if(y>='A' && y<='Z'){
             Ac++;
           }
           else if(y>='0' && y<='9'){
             dc++;
           }
           else{
             sc++;
           }
        if(ac>=1 && Ac>=1 && dc>=1 && sc>=1){
            return true;
        }
        return false;
    }
}