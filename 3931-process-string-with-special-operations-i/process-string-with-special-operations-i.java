class Solution {
    public String processStr(String s) {

        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(ch>=97 && ch<=122){
                result.append(ch);
            }
            //remove last char
            if(result.length()!=0){
                if(ch=='*'){
                    result.setLength(result.length() - 1); 
                }
            }
            //duplicate the stringbuilder(result)
            if(ch=='#'){
                for(char ch1 : result.toString().toCharArray()){
                    result.append(ch1);
                }
            }
            //reverse the current result
            if(ch=='%'){
                result.reverse();
            }
        }
        return result.toString();
    }
}