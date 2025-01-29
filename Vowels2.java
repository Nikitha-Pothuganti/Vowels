import java.util.*;
public class Vowels2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);{
            System.out.println("Enter a String: ");
            String string=scanner.nextLine();
            int vowelcount=0;
            for (char n : string.toCharArray()){
                if("aieou".indexOf(n) != -1){
                    vowelcount++;
                }
            }
            System.out.println("Number of vowels in the given string: "+vowelcount);
            scanner.close();
        }
    }
}

