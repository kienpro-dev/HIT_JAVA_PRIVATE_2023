import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        String regexPhoneNumber = "^0\\d{9}$";
        String regexMail = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Z|a-z]{2,}$";
        String regexPassword = "^[a-z\\s]{8,}$";
        String regexUsername = "^[a-z]{4,}$";

        String string = "    kien    pro      ";
        String res = string.replaceAll("\\s+", " ");
        System.out.println(res);
        Pattern pattern = Pattern.compile(regexPassword);
        Matcher matcher = pattern.matcher(string);
        if(matcher.find()) {
            System.out.println(" hop le");
        } else {
            System.out.println(" k hop le");
        }
    }
}
