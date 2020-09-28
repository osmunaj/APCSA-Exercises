public class DotSeperation {
    public static void main(String[] args){
        String word1 = "turtle";
        String word2 = "153";
        int dots = 30 - word1.length() - word2.length();
        System.out.print(word1);
        int i = 0;
        while (i < dots){
            System.out.print(".");
            i++;
        }
        System.out.print(word2);
    }

}
