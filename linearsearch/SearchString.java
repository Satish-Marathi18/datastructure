public class SearchString {
    public static int getIndex(String[] fruits, String key){
        for(int i=0; i<fruits.length; i++){
            if(fruits[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        String key = "Mango";
        int idx = getIndex(fruits, key);
        System.out.println(idx);
    }
}
