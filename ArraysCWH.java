import java.util.Arrays;;
public class ArraysCWH {
    
    public static void main(String[] args){
        //problem1
        float[] array = {101.2f,102.3f,104,5f};
        float sum = 0.0f;
        for(float element : array){
                sum+=element;
        }
        System.out.println("Sum of the numbers is :"+sum);
        System.out.println("Avg of the marks is :" + sum/array.length);

        //Problem2
        //serach an array present or not 

        int [] array1={1,2,3,4,5};
        int num = 2;
        boolean isPresent= false;
        int b=Arrays.binarySearch(array1, 2);
        System.out.println("The given number present at the index of :"+b);
        for (float a : array1) {
            if(num==a){
                isPresent=true;
                break;
            }
        }
        if(isPresent){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }

        //calculate the sum of an array

        int[][] mat1={{1,2,3},{4,5,6}};
        int[][] mat2={{2,1,4},{1,2,1}};
        int[][] res ={{0,0,0},{0,0,0}};

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                
                res[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }

        //Reverse of an array 
        int[] arr = { 1, 2, 3, 4, 5 };
        int l = arr.length;
        int n = Math.floorDiv(l, 2);

        // Swap elements from start to end
        for (int i = 0; i < n; i++) {
            int t = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = t;
        }

        System.out.println("" + Arrays.toString(arr));

        //Minimum and maximun

        int[] arrayMinMax = { 10, 25, 5, 35, 7, 12, 50, 1 };
        int min = arrayMinMax[0];
        int max = arrayMinMax[0];
        for(int i=0;i<arrayMinMax.length;i++){
            if(arrayMinMax[i]<min){
                min= arrayMinMax[i];
            }
            if (arrayMinMax[i] > max) {
                max = arrayMinMax[i];
            }
        }
        System.out.println("Max "+max);
        System.out.println("Min " + min);

        Arrays.sort(arrayMinMax);
        System.out.println(arrayMinMax[0]);
        System.out.println(arrayMinMax[arrayMinMax.length-1]);

        int[] arraysort = { 1,2,3,4};
        boolean isSorted=false;
        for(int i=0;i<arraysort.length-1;i++){
            if(arraysort[i]>arraysort[i+1]){
                isSorted=true;
                break;
            }
        }
        if(isSorted){
            System.out.println("not sorted");
        }
        else {
            System.out.println("sorted");
        }


    }
}
