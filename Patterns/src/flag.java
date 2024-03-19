public class flag {
    public static void flagPattern (int row){
    for(int i=1;i<=row;i++){
        for(int j=row;j>=i;j--){
            System.out.print("*");
        }
        System.out.println();
    }
        for(int i=2;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        flagPattern(7);
    }
}
