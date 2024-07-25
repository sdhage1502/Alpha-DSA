import java.util.HashMap;
import java.util.Map;

public class RomantoIntegers {
    public static void main(String[] args) {
String S="MMM";
        System.out.println(Romantoint(S));
    }
    public static int Romantoint(String s){
        Map<Character,Integer>map = new HashMap<>();
        map.put('M',1000);
        map.put('D',500);
        map.put('C',100);
        map.put('L',50);
        map.put('X',10);
        map.put('V',5);
        map.put('I',1);
int result =0;
for(int i=0;i<s.length();i++){
    int currentvalue = map.get(s.charAt(i));
    if(i+1<s.length()&&currentvalue<map.get(s.charAt(i+1))){
      result-=currentvalue;
    }else {
        result+=currentvalue;
    }


}
return result;
    }
}
