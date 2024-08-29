import java.util.ArrayList;

public class Reversestringinvovel {
    public static Boolean isvovel(char c){
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||
            c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                return true;
            }
            return false;
    }
    public static void main(String args[]){
        String S = "practice";
        ArrayList<Integer> arr=new ArrayList<>();
        StringBuffer result=new StringBuffer();
        for(int i=0;i<S.length();i++){
            if(isvovel(S.charAt(i))){
                arr.add(i);
            }
        }
        for(int i=0;i<S.length();i++){
            if(!isvovel(S.charAt(i))){
                result.append(S.charAt(i));
            }
            else{
                result.append(S.charAt(arr.get(arr.size()-1)));
                arr.remove(arr.size()-1);
            }
        }
        System.out.print(result);
    }
}
