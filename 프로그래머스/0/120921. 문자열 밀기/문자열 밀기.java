class Solution {
    public int solution(String A, String B) {
        
        String[] alphabet = A.split("");
        
        System.out.println(A);
        System.out.println(B);
        
        if(A.equals(B)){
            return 0;
        }
        else{
            
            for(int j=0; j<A.length(); j++){
                String temp = alphabet[A.length()-1];
                for(int i=alphabet.length-1; i>0; i--){
                    alphabet[i] = alphabet[i-1];
                }   
                
                alphabet[0] = temp;
            
                String str = String.join("", alphabet); // 구분자 없이 연결
                
                if(str.equals(B)){
                    return j+1;
                }
            }
        }
        
        return -1;

    }
}

