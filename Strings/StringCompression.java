package Strings;

public class StringCompression {
    public static void main(String[] args) {
        String str = "abbbbdddaaddd";
        StringBuilder sb = new StringBuilder(str);

        StringBuilder ans = new StringBuilder();

        char[] chArr = str.toCharArray();

        for (char ch : chArr) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for (int i = 0; i < chArr.length - 1 ; i++) {
            for (int j = i+1; j < chArr.length ; j++) {

                if(chArr[j] != chArr[i]) {
                    int count = j - i;

                    if(count == 1) {
                        ans.append(str.charAt(i));
                    }
                    else {
                        ans.append(str.charAt(i));
                        ans.append(count);
                    }
                    count = 0;
                    i = j;
                }

            }
        }
        System.out.println(ans);
    }
}
