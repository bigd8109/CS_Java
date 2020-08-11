package String;

public class Sam {
    public static void main(String[] args) {
        String s = "samsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsamsam" +
                "" +
                "";
        char ch[] = s.toCharArray();

        System.out.println("Hello Sam!");
        System.out.println(s);
        String tmp = "";
        for (int i = 0; i < ch.length; i++) {
            tmp += ch[i];
            System.out.println(tmp);
        }

        for (int i = tmp.length(); i > 0; i--) {
            tmp = tmp.substring(0, tmp.length() -1);
            System.out.println(tmp);
        }
    }
}
