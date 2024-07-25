public class Floyd_Number_Triangle {
    public static void Floyods_Number_Triangle(int number_range){
        int number = 1;
        for(int i =1;i<=number_range;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+number +" ");
                number++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        System.out.println("Floyods_Number_Triangle");
        Floyods_Number_Triangle(5);
    }
}
