import java.util.*;
public class CollectionsScenarioEmployee {
    public static void main(String args[]){
        List<String> l=new ArrayList<String>();
        l.add("Ganesh");
        l.add("Dinesh");
        l.add("Saran");
        System.out.println();
        for(String str:l){
            System.out.println(str);
        }
        l.remove("Ganesh");
        System.out.println("Employee List after Removal Of one Employee");
        for(String str:l){
            System.out.println(str);
        }

        if(l.contains("Dinesh")){
            System.out.println("Dinesh is Available");
        }
    }
}
