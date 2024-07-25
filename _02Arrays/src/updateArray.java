import javax.management.MBeanAttributeInfo;
import java.util.*;
public class updateArray {

 // FUNCTION TO UPDATE THE MARKS
  static void updateMarks(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        System.out.println();
    }

    //MAIN METHOD
    public static void main(String[] args) {
int marks[]={97,89,67};

  /// to print he original marks
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        //call the function to update the marks
        updateMarks(marks);
        //for loop for the print the updated marks
        for(int i =0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }

    }

}
