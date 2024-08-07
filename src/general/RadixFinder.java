package general;

public class RadixFinder {

    public boolean isBinary(String str){
        String binaryRegex = "[0|1]+";
        return str.matches(binaryRegex);
    }

    public boolean isOctal(String str){
        String decimalRegex = "[0|1|2|3|4|5|6|7]+";
        return str.matches(decimalRegex);
    }
    public boolean isDecimal(String str){
        String decimalRegex = "[0|1|2|3|4|5|6|7|8|9]+";
        return str.matches(decimalRegex);
    }

    public boolean isHexaDecimal(String str){
        String decimalRegex = "[0|1|2|3|4|5|6|7|8|9|A|B|C|D|E|F]+";
        return str.matches(decimalRegex);
    }
}
