import java.util.Arrays;
public class JavaArrays {

    public static void main(String[] args){
        int[] array = new int[6];//declaration and memory Allocation
        array[0]= 23;
        System.out.println(array[0]);
        int[] array1={2,3,4,5,6,7};//Initialization
        System.out.println(array1[3]);
        int[] marks; //Declaration
        marks=new int[5];//Memory Allocation
        //Traverse through an array
        for(int a :array1){
            System.out.println(a);
        }
        //Access through an array through index
        System.out.println(array1[2]); 

        //Array methods in java  - length
        int[] array2 = {10,45,90,25,18,78};
        int a= array2.length;
        System.out.println(a);
        //sort
        Arrays.sort(array2);
        for(int i:array2){
            System.out.println(i);
        }
        //fill
        Arrays.fill(array2,1);
        for(int j:array2){
            System.out.println(j);
        }
        //toString
        System.out.println(Arrays.toString(array2));
        //copyOf
        int[] original = {1,2,3,4};
        int[] b = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(b));
        //equals()
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        boolean equal=Arrays.equals(arr1 ,arr2);
        System.out.println(equal);
        //binarySearch
        int index = Arrays.binarySearch(original, 3);
        System.out.println(index);


        //Multidimentional Arrays 
        int[][] flats ;
        flats =new int[2][3];
        flats[0][0]=101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 104;
        flats[1][1] = 105;
        flats[1][2] = 106;

        for(int i = 0 ; i <flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(" "+flats[i][j]);
            }
            System.out.println(" ");
        }


    }
}
