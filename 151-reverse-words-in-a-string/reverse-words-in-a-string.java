class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        String[] arr = s.split(" ");
        int l = arr.length;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<l; i++){
            if(arr[i].length()>0){
                sb.append(arr[i]);
                if(i!=l-1) sb.append(" ");
            } 
        }
        
        String[] arrans = sb.toString().split(" ");
        sb.setLength(0);
        for(int j = arrans.length-1; j>=0; j--){
            sb.append(arrans[j]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}