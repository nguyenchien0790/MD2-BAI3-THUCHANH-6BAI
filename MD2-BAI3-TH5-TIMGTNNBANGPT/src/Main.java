public class Main {
    public static void main(String[] args) {
        int arr[] = {7,4,6,8,3,5,9,1,2,3};
        int index = minValue(arr);
        System.out.println("The smallest element in the array : " + arr[index]);
    }
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }

        }
        return index;
    }


}