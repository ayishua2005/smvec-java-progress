/
public class Prblm10{
    public static void main(String[] args) {
        String str = "Java123";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i))) {
                count++;
            }
        }

        System.out.println("Alphabets: " + count);
    }
}