
class claculator{
    int a;
    public int add(int n1,int n2){
        System.out.println("Hey.......!");
        return n1+n2;
    }
}

public class demo {

    public static void main(String args[]){

        int num1=4;
        int num2=5;
        
        claculator cal= new claculator();
        int res = cal.add(num1,num2);
        System.out.println(res);



    }
    
}
