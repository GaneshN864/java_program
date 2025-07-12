public class a3b2_aaabb {
    public static void main(String[] args) {
        String a = "a3b5c2";
        char[] c = a.toCharArray();
        int count = 0;
        char let = c[0];

        for (int i = 1; i < c.length; i++) {
            if (Character.isLetter(c[i])) {
                // print previous letter with count times
                for (int j = 0; j < count; j++) {
                    System.out.print(let);
                }
                count = 0;
                let = c[i];
            } else if (Character.isDigit(c[i])) {
                count = count * 10 + (c[i] - '0');
            }
        }

        // print last letter
        for (int j = 0; j < count; j++) {
            System.out.print(let);
        }
    }
}
