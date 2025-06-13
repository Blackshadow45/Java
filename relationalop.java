public class relationalop {
    public static void main(String args[]){
        int x=5;
        int y=4;
        boolean res=x>y;
        System.out.println(res);

        int a=6;
        int b=6;
        boolean res1=a>=b;
        System.out.println(res1);

                boolean res2=a<=b;
        System.out.println(res2);

        boolean res3= x!=y;
        System.out.println(res3);

        int c=5;
        int d=5;
        boolean res4 = c==d;
        System.out.println(res4);

        int z=5;
        int h=4;
        if(z>h && a<b){
            System.out.println("Condtion is satisfied");
        }
        else{
            System.out.println("Condtion is not satisfied");
        }
        if(z>h && a==b){
            System.out.println("satisfied only one condition");
        } else{
            System.out.println("Not an single condition satisfied");
        }
        int k=9;
         boolean res5 = a>k;
    System.out.println(!res5);    /// reverse the Result
    }

         
    
}
