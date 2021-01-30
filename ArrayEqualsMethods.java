public class ArrayEqualsMethods {
    public static void main(String[] args){
        int arr1[];
        int arr2[];
        arr1 = new int[5];
        arr2 = new int[5];
        
        for(int i=0; i<5; i++){
            arr1[i] = 0;
            arr2[i] = 0;        
        }
        
        System.out.println(arr1.equals(arr2)); //prints false
        System.out.println(Arrays.equals(arr1, arr2)); //prints true
        
        Integer[] arr3 = new Integer[] { 1, 123 };
        Integer[] arr4 = new Integer[] { 1, 123 };
        
        System.out.println(arr3.equals(arr4)); //prints false
        System.out.println(Arrays.equals(arr3, arr4)); //prints true
        
        /* Note:
         * The equals() method when applied to Arrays will check for object equivalency (compare reference variables).
         * Meanwhile, the deepEquals or Arrays.equals() method will check for value equivalency.
        */
    }
}
