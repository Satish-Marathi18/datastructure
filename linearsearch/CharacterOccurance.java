public class CharacterOccurance {
    public static int countOfChar(String str, char key){
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == key)
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        String str = "satish";
        char key = 's';
        int count = countOfChar(str, key);
        System.out.println(count);
    }
}
