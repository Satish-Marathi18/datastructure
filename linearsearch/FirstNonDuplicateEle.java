public class FirstNonDuplicateEle {
    public static int getFisrtNonDuplicateElement(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != -1)
            return arr[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {37,28,84,28,20,84,37};
        int firstNonDuplicateElement = getFisrtNonDuplicateElement(arr);
        System.out.println(firstNonDuplicateElement);
    }
}
