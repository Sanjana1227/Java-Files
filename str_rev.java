public class str_rev {
    public static void main(String[] args) {
        String name = "Sanjana";
        int leng = name.length();
        String str = "";
        for(int i= leng -1; i >= 0; i--) {
            str = str + name.charAt(i);
        }
        System.out.println(str);
    }
}
