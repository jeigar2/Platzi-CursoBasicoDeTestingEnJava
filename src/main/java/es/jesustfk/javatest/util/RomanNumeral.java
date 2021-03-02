package es.jesustfk.javatest.util;

public class RomanNumeral {

    public static String arabicToRoman(int n) {
        InfoNumeral infoNumeral = new InfoNumeral(n,"");

        infoNumeral = multiple10(infoNumeral, 1000, "M");
        infoNumeral = replaceValue(infoNumeral, 900, "CM");
        infoNumeral = replaceValue(infoNumeral, 500, "D");
        infoNumeral = replaceValue(infoNumeral, 400, "CD");
        infoNumeral = multiple10(infoNumeral, 100, "C");
        infoNumeral = replaceValue(infoNumeral, 90, "XC");
        infoNumeral = replaceValue(infoNumeral, 50, "L");
        infoNumeral = replaceValue(infoNumeral, 40, "XL");
        infoNumeral = multiple10(infoNumeral, 10, "X");
        infoNumeral = replaceValue(infoNumeral, 9, "IX");
        infoNumeral = replaceValue(infoNumeral, 5, "V");
        infoNumeral = replaceValue(infoNumeral, 4, "IV");
        infoNumeral = multiple10(infoNumeral, 1, "I");

        return infoNumeral.getInfo();
//        return result;
    }

    private static InfoNumeral replaceValue(InfoNumeral infoNumeral, int number, String value){
        if(infoNumeral.getNumber() >= number)
            return new InfoNumeral(infoNumeral.getNumber() - number, infoNumeral.getInfo() + value);
        else
            return infoNumeral;
    }

    private static InfoNumeral multiple10(InfoNumeral infoNumeral, int multiple, String value) {
        StringBuilder result = new StringBuilder(infoNumeral.getInfo());
        int aux = infoNumeral.getNumber();
        if (aux < multiple)
            return infoNumeral;

        while( aux >= multiple) {
            result.append(value);
            aux -= multiple;
        }
        return new InfoNumeral(aux, result.toString());
    }

    private static class InfoNumeral {
        private int number;
        private String info;

        public InfoNumeral(int number, String info) {
            this.number = number;
            this.info = info;
        }

        public int getNumber() {
            return number;
        }

        public String getInfo() {
            return info;
        }
    }
}
