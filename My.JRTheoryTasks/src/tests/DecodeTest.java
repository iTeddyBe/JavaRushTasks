package tests;

import java.nio.charset.Charset;

public class DecodeTest {
    public static void main(String[] args) {
        String code = "SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==";

        for (int i = 0; i < code.length(); i++) {
            String tmpStr;
            char tmpChar = code.charAt(i);
            byte tmpByte = (byte) tmpChar;
            Byte tmpByte2 = tmpByte;
            int tmpInt = (int) tmpByte2;
            tmpInt = tmpInt ^ 1;
            tmpChar = (char) tmpInt;
            //
            //System.out.println(tmpInt);
            System.out.println(tmpChar);
//            tmpStr = Math. code[i]
        }
    }
}
