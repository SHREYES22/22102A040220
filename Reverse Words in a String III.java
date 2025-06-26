class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String ss:str){
            StringBuilder rev=new StringBuilder(ss).reverse();
            sb.append(rev+" ");
        }
        return sb.toString().trim();
    }
}
