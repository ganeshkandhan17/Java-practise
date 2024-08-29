public class FirstLetterCaps {
    public static void main(String args[]){
        String name="ganesh: kandhan v m";
        String[] name1=name.split(" ");
        StringBuffer result = new StringBuffer();
        for(String data : name1){
            result.append(data.substring(0,1).toUpperCase()+data.substring(1)+" ");
        }
        System.out.print(result.toString());
    }
    
}
