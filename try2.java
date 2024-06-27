public class try2 {
    public static void main(String[] args) {
        String s1="I Love My 67 India";
        String str="";
        
        for(int i=0; i<s1.length();i++){

            char c= s1.charAt(i);

            if(Character.isUpperCase(c)){
                str += Character.toLowerCase(c);
            }
            else if( Character.isLowerCase(c)){
                str += Character.toUpperCase(c);
            }
            else{
                str += c;
            }
        }
        System.out.println(str);
    }
}
