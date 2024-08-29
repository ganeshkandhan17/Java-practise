import java.util.*;
public class CollectionsScenarioLibrary {
    public static void main(String[] args) {
        Set <String> l=new TreeSet<String>();
        l.add("Book1");
        l.add("Book2");
        l.add("Book3");
        System.out.println();
        Iterator <String> itr=l.iterator();
        System.out.println("Book List");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        if(l.contains("Book2")){
            System.out.println("Book2 Available in the Library");
        }

        l.remove("Book2");
        System.out.println("Book List After Book2 is removed");
        for(String str : l){
            System.out.println(str);
        }
        
    }
}
