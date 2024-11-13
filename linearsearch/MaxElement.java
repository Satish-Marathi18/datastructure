public class MaxElement {
    public static int getMaxEle(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max)
            max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {37,28,84,27,20,95,37};
        System.out.println(getMaxEle(arr));
    }
}
