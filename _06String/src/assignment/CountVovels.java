package assignment;

public class CountVovels {
    public static int count(String str){
        int count1 = 0,count=0;
        for(int i= 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }

        }return count;
    }

    public static void main(String[] args) {
       String  str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(count(str));
    }
}
