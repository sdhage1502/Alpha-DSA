

public class isomorphicString {

    public static  boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int sMap [] = new int[256];
        int tMap[]= new int[256];

         for(int  i=0;i<s.length()-1;i++){
             char sChar= s.charAt(i);
             char tChar =t.charAt(i);

            if(sMap[sChar]!=tMap[tChar])
                 return false;

             sMap[sChar] = i + 1;
             tMap[tChar] = i + 1;

         }
return true;
    }

    public static void main(String[] args) {
        String s ="paper";
        String t= "tiole";
        System.out.println(isIsomorphic(s,t));
    }
}

