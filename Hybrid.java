class Stage1{
    int a=10;
}
class Stage2 extends Stage1{

}

class Stage3 extends Stage2{

}

class Stage4 extends Stage3{

}

class Stage5 extends Stage3{

}

class Hybrid{
    public static void main(String args[]){
        System.out.println();
        Stage3 st=new Stage3();
        System.out.println(st.a);
        Stage4 st1=new Stage4();
        System.out.println(st1.a);
        Stage5 st2=new Stage5();
        System.out.println(st2.a);
    }
}