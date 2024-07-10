package Strings;

public class StringCompression2 {
    public static void main(String[] args) {

        String str = "aabb";
        StringBuilder sb = new StringBuilder(str);

        StringBuilder ans = new StringBuilder();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            int count = 1;
            //System.out.print(charArray[i]);
            for (int j = i+1; j < charArray.length ; j++) {
                if(charArray[j] == charArray[i]) {
                    count+=1;
                }
                else {
                    ans.append(charArray[i]);
                    ans.append(count);
                    i = j;
                    break;
                }
            }
            ans.append(charArray[i]);
            ans.append(count);
        }
        System.out.print(ans);
    }
}
