public class workingWithArrays {
    public static void main(String[] args){
        // print biggest number in array
        int[] arr = {44,  22, 12, 7, 86, 11, 56, 99, 21, 76};
        int biggest = arr[0];
        for(int x = 0; x < arr.length - 1; x++){
            if (arr[x] > biggest) {
                biggest  = arr[x];
            }
        }
        for (int x = arr.length - 1; x >= 0; x--){
            System.out.println(arr[x]);
        }
    }
}
