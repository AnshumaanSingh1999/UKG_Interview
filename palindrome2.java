public class palindrome2 {
    static boolean pc(String s){
        boolean flag=false;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=false;
                break;
            }
            else{
                flag=true;
            }
            i++;
            j--;
        }
        return flag;
    }
    public static void main(String[] args) {
        String s="madam";
        boolean resp=pc(s);
        String result=resp?"Palindrome":"Not Palindrome";
        System.out.println(result);
    }
}