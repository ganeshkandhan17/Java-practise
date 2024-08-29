public class MethodOverLoading {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(double c, double d){
        System.out.println(c+d);
    }
    public static void main(String args[]){
        System.out.println();
        new MethodOverLoading().sum(1,2);
        new MethodOverLoading().sum(1.1,2.3);
    }
    
}
