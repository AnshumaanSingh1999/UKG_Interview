public class second_highest_element {
    static void scnh(int a[]){
        int m=Integer.MIN_VALUE;
        int n=Integer.MIN_VALUE;
        for(int i:a){
            if(i>m){
                n=m;
                m=i;
            }
            else if(i>n && i!=m){
                n=i;
            }
        }
        System.out.println(m);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int a[]={1,3,4,2};
        scnh(a);
    }
}