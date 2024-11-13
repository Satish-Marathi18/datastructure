public class FirstOccurance {
    public static int SearchKey(int[] arr, int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {37,28,84,27,20,95,37};
        int key = 96;
        int idx = SearchKey(arr, key);
        System.out.println(idx);
    }
}
