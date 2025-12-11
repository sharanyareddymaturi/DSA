class Solution {
    public void reverse(char str[],int i,int j){
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {
        char str[]=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n;i+=2*k){
            if(i+k-1<n){
                reverse(str,i,i+k-1);
            }else{
                reverse(str,i,n-1);
            }
        }
        return new String(str);
    }
}