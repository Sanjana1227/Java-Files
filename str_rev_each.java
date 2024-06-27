public class str_rev_each {
    public static void main(String[] args) {
        String s1="What is your name";
        String[] words= s1.split(" ");
        String rev="";

        for(int i=0;i<words.length;i++){
            String word=words[i];
            String revWord="";

            for(int j=word.length()-1;j>=0;j--){
                revWord=revWord+word.charAt(j);
            }
            rev = rev + revWord + " ";
        }
        System.out.println(rev);
        
    }
}
