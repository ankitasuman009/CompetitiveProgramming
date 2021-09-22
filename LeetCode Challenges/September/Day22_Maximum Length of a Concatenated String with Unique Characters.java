class Solution {
    public int maxLength(List<String> arr) {
        if(arr.size()==1) return arr.get(0).length();
        int max = 0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(i!=j){
                    int f = 0;
                    char[] charArr = arr.get(j).toCharArray();
                    for(int k=0;k<charArr.length;k++){
                        if(arr.get(i).contains(Character.toString(charArr[k]))){
                            f = 1; break;
                        }
                    }
                    if(f==0) max = Math.max(max, arr.get(i).length()+arr.get(j).length());
                }
            }
        }
        return max;
    }
}
