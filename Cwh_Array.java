                        // INFORMATION ON ARRAY
                        //  WHAT IS AN ARRAY?
/*
---> 1) AN ARRAY IS AN COLLECTION OF DATA WITH SIMILAR DATA TYPES.
     2) ARRAY HAS TWO TYPES:- a)  ONE DIMENSIONAL ARRAY
                              b)  MULTI DIMENSIONAL ARRAY
 */
                       // TYPES OF ARRAY DECLARATION
  /*     int[]abc= new int[5];  //DECLARATION TYPE 1// ----> DECLARATION + MEMORY ALLOCATION
        int[] abc;  ---> DECLARATION
            abc = new int[100]; // DECLARATION TYPE 2  ------> MEMORY ALLOCATION

 int[] pqr={10,20,30,40,50}; // DECLARATION TYPE 3  ----> DECLARE + INITIALIZE
   */


                        // ARRAY OF STRING
        /*
       String [] students = {"ATHARVA","DEEPAK","MANJREKAR"};
        System.out.println(students[1]);

 */
                        // LENGTH OF AN ARRAY
/*
class Cwh_Array
   {
  public static void main(String[] args)
  {
      int [] marks = {10,20,30,40,50,60,70,80,90,100};
      System.out.println("The length of an array named marks is : " +marks.length);
                                }
            }
            SYNTAX :- array_name.length;
   */
                        // DISPLAYING ARRAY
                        // METHOD :- 01
 /*
     class Cwh_Array {
     public static void main(String[] args) {
         int[] marks = {10, 20, 60, 70, 80};
         System.out.println("The length of an array is : " +marks.length);
         System.out.println(marks[0]);
         System.out.println(marks[1]);
         System.out.println(marks[2]);
         System.out.println(marks[3]);
         System.out.println(marks[4]);
     }
 }
 */
                        // METHOD :- 02
/*
 class Cwh_Array{
   public static void main(String[] args) {
       int[]marks = {10,20,60,70,80};
       System.out.println("The length of an array is : "+marks.length);
       for (int i = 0; i<marks.length; i++){
           System.out.println(marks[i]);
       }
      }
   }
 */
                        // QUICK QUIZ
/*
class Cwh_Array{
  public static void main(String[] args) {
      int [] arr={10,20,30,40,50,60,70,80,90,100};
      System.out.println("The length of an array is :"+arr.length);
      for (int i= arr.length-1;i>=0;i--){
          System.out.println(arr[i]);
      }
    }
 }
*/
                        // FOR EACH LOOP  SYNTAX
   /*
     for(int element: marks){
     System.out.println(element);
      }
*/
                        // 2-D ARRAY
 /*
  class Cwh_Array{
     public static void main(String[] args)
     {
         int[][] flat = new int[2][3];
         flat[0][0]=101;
         flat[0][1]=102;
         flat[0][2]=103;
         flat[1][0]=201;
         flat[1][1]=202;
         flat[1][2]=203;
         System.out.println("Displaying 2-D array.");
         for (int i=0;i< flat.length;i++){
             for (int j=0;j<flat[i].length;j++){
                 System.out.print(flat[i][j]);
                 System.out.print(" ");
             }
             System.out.println(" ");
         }

         }
  }

  */
                        // PRACTICE PROBLEMS........................................................................

 // QS:- 1) CREATE AN ARRAY OF 5 FLOATS AND CALCULATE THEIR SUM
/*
 class Cwh_Array{
   public static void main(String[] args)
   {
      float sum=0;
       float[] marks = new float[5];
       marks[0]=10.9f;
       marks[1]=20.25f;
       marks[2]=30.5f;
       marks[3]=40.20f;
       marks[4]=50.30f;
     sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4];
       System.out.println("The sum of all elements in an array is :"+sum);
   }
       }
 */
 // QS:- 2) WRITE A PROGRAM TO FIND WHETER THE NUMBER IS PRESENT IN AN ARRAY OR NOT?
/*
import java.util.Scanner;
   class Cwh_Array{
     public static void main(String[] args) {
         int []arr=new int[5];
         arr[0]=50;
         arr[1]=40;
         arr[2]=30;
         arr[3]=20;
         arr[4]=10;
         int no;
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the number:-");
         no=sc.nextInt();
         if (no==arr[0]){
             System.out.println("Number 50 is present in an array");
         } else if (no==arr[1]) {
             System.out.println("Number 40 is present in an array");
         } else if (no==arr[2]) {
             System.out.println("Number 30 is present in an array");
         } else if (no==arr[3]) {
             System.out.println("Number 20 is present in an array");
         }
         else if (no==arr[4]){
             System.out.println("Number 10 is present in an array");
         }
         else {
             System.out.println("Number entered is not present in the array.");
         }
     }
 }
 */
 // QS:- 3) WRITE A PROGRAM TO REVERSE AN ARRAY
/*
 class Cwh_Array{
     public static void main(String[] args) {
         int []arr = new int [5];
         arr[0]= 10;
         arr[1]= 20;
         arr[2]= 30;
         arr[3]= 40;
         arr[4]= 50;
         System.out.println("The length of an array is :- "+arr.length);
         for(int i = arr.length-1;i>=0;i--){
             System.out.println(arr[i]);
         }
     }
 }
*/
 // QS:- 4) WRITE A PROGRAM TO FIND MAXIMUM ELEMENT IN AN ARRAY (NOT DONE)
/*
class Cwh_Array{
     public static void main(String[] args) {
         int []arr = new int [5];
         arr[0]=10;
         arr[1]=20;
         arr[2]=30;
         arr[3]=40;
         arr[4]=50;
         if(arr[0]<arr[1]){
             System.out.println("The value at index 0 is greatest.");
         }
     }
 }
*/








