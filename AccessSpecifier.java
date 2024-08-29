public class AccessSpecifier {
    private String pvt="its Private variable";
    String def="its Default variable";
    protected String prt="its Protected variable";
    public String pb="Its an public variable";
    private void privatemethod(){
        System.out.println(pvt);
    }
    void defaultmehtod(){
        System.out.println(def);
    }
    protected void protectedmethod(){
        System.out.println(prt);
    }
    public void publicmethod(){
        System.out.println(pb);
    }
    void allmethod(){
        privatemethod();
        defaultmehtod();
        protectedmethod();
        publicmethod();
    }

    public static void main(String args[]){
        AccessSpecifier obj=new AccessSpecifier();
        System.out.println();
        System.out.println(obj.pb+" In main method");
        System.out.println(obj.def+" In main method");
        System.out.println(obj.prt+" In main method");
        System.out.println(obj.pvt+" In main method");
        obj.allmethod();
    }
}
