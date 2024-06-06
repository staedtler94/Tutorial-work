import Services.BinaryChecker;
import Services.EmailChecker;
import models.EmailCheckerModel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Java Samples and Tutorials");

        // RegEx Samples
        // Email Checker
        String str1 = "example@example.com"; // false not gmail
        String str2 = "example@gmail.com"; // true

        String str3 = "example134@gmail.com"; // true
        String str4 = "example_134@gmail.com"; // false there is _S

        String regEx = "[a-zA-Z0-9]*@gmail.com";

        System.out.println(str1.matches(regEx));
        System.out.println(str2.matches(regEx));

        System.out.println(str3.matches(regEx));
        System.out.println(str4.matches(regEx));

        EmailChecker emailChecker = new EmailChecker();
        EmailCheckerModel model = emailChecker.getEmailAttributes(str1);

        System.out.println(model.getUserName());
        System.out.println(model.getDomain());

        // Binary Checker

        int b = 11101101;
        String binaryStringify = b + "";
        BinaryChecker bChecker = new BinaryChecker();
        System.out.println(bChecker.isBinary(binaryStringify));

        int notBin = 21093;
        String notBinString = notBin + "";
        System.out.println(bChecker.isBinary(notBinString));

        // Hexadecimal Checker
        int hex = 0xA12;
        String hexStringify = hex + "";

    }
}