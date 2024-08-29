class Computer{
    int cno;
    String company;
    Computer(int no,String com){
        this.cno=no;
        this.company=com;
    }
}

public class ParameticConstructor {
    public static void main(String args[]){
        System.out.println();
        Computer comp1=new Computer(2,"HP");
        System.out.println(comp1.cno);
        System.out.println(comp1.company);
    }
}

