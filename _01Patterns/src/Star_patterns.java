

public class Star_patterns {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("1----------------------------------------");
        int ch = 1;
        for ( int line = 1 ; line <= 5 ; line++ ) {
            for ( int j = 1 ; j <= line ; j++ ) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }


        System.out.println();
        //Inverted star Pattern
        System.out.println("Inverted Star Pattern");

        System.out.println("2----------------------------------------");
        for ( int line1 = 5 ; line1 >= 1 ; line1-- ) {
            for ( int star = 1 ; star <= line1 ; star++ ) {
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println("3----------------------------------------");
        for ( int i = 1 ; i <= 5 ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("*  ");
            }
            System.out.println();
        }


        System.out.println("4----------------------------------------");

        for ( int i = 1 ; i <= n ; i++ ) {
            //spaces
            for ( int j = n ; j >= i ; j-- ) {
                System.out.print("   ");
            }
            //star
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println("5----------------------------------------");
        //     int number=1;
        for ( int i = 1 ; i <= 5 ; i++ ) {

            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print(i);

            }
            //  number++;
            System.out.println();
        }
        System.out.println("6----------------------------------------");

        for ( int i = n ; i >= 1 ; i-- ) {

            for ( int j = 1 ; j <= n - i ; j++ ) {
                System.out.print("  ");

            }
            for ( int j = 1 ; j <= (2 * i) - 1 ; j++ ) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("7----------------------------------------");

        System.out.println("8----------------------------------------");

        for ( int i = 1 ; i <= n ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for ( int i = n - 1 ; i >= 1 ; i-- ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("8----------------------------------------");

        for ( int i = n ; i >= 1 ; i-- ) {
            //for spaces
            for ( int j = 1 ; j <= n - i ; j++ ) {
                System.out.print(" ");
            }
            //for STAR
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("------------ Pattern – 9: Diamond Star Pattern------------");
        n = 5; //rows
        //first half of the pyramid
        for ( int i = 1 ; i <= n ; i++ ) {
            //for Spaces
            for ( int j = 1 ; j <= n - i ; j++ ) {
                System.out.print(" ");
            }
            //for stars
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
//second half of the pyramid
        for ( int i = n ; i >= 1 ; i-- ) {
            //for spaces
            for ( int j = 1 ; j <= n - i ; j++ ) {
                System.out.print(" ");
            }
            //for star
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("------------ Pattern – 10 : Half Diamond Star Pattern------------");
//1st half
        for ( int i = 1 ; i <= n ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for ( int i = n ; i >= 1 ; i-- ) {
            for ( int j = 2 ; j <= i ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("___________________________________________________________________________");

        System.out.println("------------  Pattern – 11: Binary Number Triangle Pattern------------");

        for ( int i = 1 ; i <= n ; i++ ) {
            for ( int j = 1 ; j <= i ; j++ ) {
                if ((j + i) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }


        System.out.println("___________________________________________________________________________");
        System.out.println("------------ Pattern – 12: Number Crown Pattern------------");
int space=2*(n-1);
       for(int i=1;i<=n;i++){
           //for the number of 1st part
           for(int j=1;j<=i;j++){
               System.out.print(j);
           }
           //for spaces between two part of numbers pyramid
         for(int j=1;j<=space;j++){
             System.out.print(" ");
         }
         space-=2;

//for the numbers of 2nd part

           for(int j=i;j>=1;j--){
               System.out.print(j);
           }

           System.out.println();
       }




        System.out.println("___________________________________________________________________________");
        System.out.println("------------Pattern – 13: Increasing Number Triangle Pattern------------");
        int number =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number + " " );
                number++;
            }
            System.out.println();
        }
        System.out.println("___________________________________________________________________________");

        System.out.println("------------Pattern-14: Increasing Letter Triangle Pattern------------");

        n=5;//rows number

for(int i=1;i<n;i++){
    char letter ='A';
    for (int j=1;j<=i;j++){
        System.out.print(letter + " ");
        letter++;
    }
    System.out.println();
}

        System.out.println("------------Pattern-15: Reverse Letter Triangle Pattern------------");
        for(int i=n;i>=1;i--){
            char letter ='A';
            for (int j=1;j<=i;j++){
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
        System.out.println("___________________________________________________________________________");


        System.out.println("------------ Pattern – 16: Alpha-Ramp Pattern-----------");
        char alphabet  ='A';
        for(int i=1;i<= n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(alphabet);

            }alphabet++;
            System.out.println();
        }
        System.out.println("___________________________________________________________________________");

        System.out.println("------------Pattern – 17: Alpha-Hill Pattern-----------");
        for(int i =1;i<=n;i++){
            for(int j=1;j<= n-i;j++){
                System.out.print("_");
            }
        }

        System.out.println("___________________________________________________________________________");
        System.out.println("------------Pattern – 18-alpha-triangle-pattern-----------");

        for(int i=0;i<n;i++){
            for( char alpha = (char) (('A'+n-1)-i) ; alpha<=('A'+n-1); alpha++){
                System.out.print(alpha+" ");

            }
            System.out.println();
        }












        System.out.println("___________________________________________________________________________");


        System.out.println("------------Pattern-19: Symmetric-Void Pattern-----------");
        System.out.println("___________________________________________________________________________");

        System.out.println("------------ Pattern – 20: Symmetric-Butterfly Pattern-----------");
        System.out.println("___________________________________________________________________________");

        System.out.println("------------Pattern – 21: Hollow Rectangle Pattern-----------");

        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==1|| i==n) ||(j==1||j==n)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("___________________________________________________________________________");

        System.out.println("------------Pattern – 22: The Number Pattern-----------");
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==1|| i==n) ||(j==1||j==n)){
                    System.out.print("4 ");
                }else{

                    System.out.print("3 ");
                }

            }
            System.out.println();
        }



        System.out.println("___________________________________________________________________________");
for(int i=1;i<=n;i++){

    for(int j=1;j<=i;j++){
        if((i+j)%2==0){
            System.out.print("1 ");

        }else {System.out.print("0 ");}

    }
    System.out.println();
}
        System.out.println("___________________________________________________________________________");



                for(int i =0;i<=n;i++){
                    for(int j = i;j<=n-1;j++){
                        if(i%2!=0){
                            System.out.print("0");

                        } else 	System.out.print("1");
                    }	System.out.println("");
                }



        System.out.println("main end----------------------------------------");


    }}


