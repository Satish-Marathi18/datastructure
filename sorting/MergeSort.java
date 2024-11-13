class MergeSort {
    public static void divide(int[] arr, int startingIndex, int endIndex){
        if(startingIndex >= endIndex){
            return;
        }
        int mid = startingIndex+(endIndex-startingIndex)/2;
        divide(arr, startingIndex, mid);
        divide(arr, mid+1, endIndex);
        conquer(arr,startingIndex,mid,endIndex);
    }

    public static void conquer(int[] arr, int startingIndex, int mid, int endIndex){
        int merged[] = new int[endIndex-startingIndex+1];
        int idx1 = startingIndex;
        int idx2 = mid+1;
        int x =0;
        while(idx1 <= mid && idx2<=endIndex){
            if(arr[idx1] <= arr[idx2] ){
                merged[x++] = arr[idx1++];
            }
            else{
                merged[x++] = arr[idx2++];
            }
        }

        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= endIndex){
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=startingIndex; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {32,48,82,21,28,94};
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}