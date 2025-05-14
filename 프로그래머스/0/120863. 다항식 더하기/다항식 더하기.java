class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        
        int xNum = 0;
        int num = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x") && arr[i].length()==1){
                xNum += 1;
            }
            else if(arr[i].contains("x")&&arr[i].length()!=1){
                xNum += Integer.parseInt(String.valueOf(arr[i].replace("x","")));
            }
            else if(arr[i].equals("+")){
                continue;
            }
            else {
                num += Integer.parseInt(String.valueOf(arr[i]));
            }
        }
        
        if(num==0 && xNum > 0){
            if(xNum==1){
                answer = "x";
            }
            else{
                answer = xNum+"x";
            }
        }
        else if(num!=0 && xNum > 0){
            if(xNum==1){
                answer = "x + "+num;
            }
            else{
                answer = xNum + "x + "+num;
            }
        }
        else if(xNum == 0) {
            answer = String.valueOf(num);
        }
    
        
        return answer;
    }
}