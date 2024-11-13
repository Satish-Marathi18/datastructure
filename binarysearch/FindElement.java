package binarysearch;

public class FindElement {
public static int getIndexOf(int[] arr, int key){
    int left = 0;
    int right = arr.length-1;

    while(left <= right){
        int mid = left+(right-left)/2;
        if(arr[mid] == key) {
            return mid;
        }
        if(arr[mid] > key){
            right = mid-1;
        }
        else
        left = mid+1;
    }
    return -1;
}

    public static void main(String[] args) {
        int[] arr = {37,28,87,23,20,54,67};
        int key = 20;
        int idx = getIndexOf(arr, key);
    }
}
