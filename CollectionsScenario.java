import java.util.*;
public class CollectionsScenario {
    public static void main(String[] args) {
        Map <String,String> data=new HashMap<String,String>();
        Map <String,Integer> GradeMarks=new HashMap<String,Integer>();
        GradeMarks.put("O", 100);
        GradeMarks.put("A+", 90);
        GradeMarks.put("A", 80);
        GradeMarks.put("B+", 70);
        GradeMarks.put("B", 60);
        GradeMarks.put("RA", 40);
        System.out.println();
        data.putIfAbsent("Ganesh", "B");
        data.putIfAbsent("Dinesh", "O");
        data.putIfAbsent("Saran", "O");
        data.putIfAbsent("temp", "temp");
        data.remove("temp","temp");
        int sum=0; 
        
        for(String chunk: data.values()){
            sum=sum+GradeMarks.get(chunk);
        }
        int Average=sum/data.size();
        System.out.println("Average marks= "+Average);

        

    }
    
}
