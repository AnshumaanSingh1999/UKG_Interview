public class palindrome {
    static boolean pc(String s){
        boolean flag=false;
        StringBuilder sr=new StringBuilder(s);
        sr.reverse();
        String r=sr.toString();
        if(r.equals(s)){
            flag=true;
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