public class CountAllOccurance {
public static int[] getOccurances(int[] arr, int key){
    int[] occurance = new int[arr.length];
    int j=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i] == key){
            occurance[j++] = i;
        }
    }
    int[] res = new int[j];
    for(int i=0; i<res.length; i++){
        res[i] = occurance[i];
    }
    return res;
}

    public static void main(String[] args) {
        int[] arr = {37,28,84,37,20,95,37};
        int key = 37;
        int[] res = getOccurances(arr, key);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]+" ");
        }
    }
}
