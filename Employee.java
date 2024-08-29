public class Employee {
    private int salary;
    private int age;
    private String name;
    public void setname(String name){
        this.name=name;
    }
    public void getname(){
        System.out.println("Name is "+name);
    }
    public void setage(int age){
        if(age<18){
            System.out.println("Age is not valid");
        }
        else{
            this.age=age;
        }
        
    }
    public void getage(){
        System.out.println("age is "+age);
    }
    public void setsalary(int salary){
        this.salary=salary;
    }
    public void getsalary(){
        System.out.println("Salary= "+salary);
    }
    public static void main(String  args[]){
        Employee emp1=new Employee();
        System.out.println();
        emp1.setname("Ganesh");
        emp1.setage(20);
        emp1.setsalary(20000);
        emp1.getname();
        emp1.getage();
        emp1.getsalary();
    }
}
