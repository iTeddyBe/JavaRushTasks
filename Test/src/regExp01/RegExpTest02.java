package regExp01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest02 {
    private static final String enterString1 = "<span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela</span></b></span><span>Any text<span>test fexperex<b>text and some<div>text div</div>end Any</b><span>Turanga</span>Leela extra Name</span>and Surname.</span><span>Super</span><span>girl</span>";
    private static final String enterString2 = "<b>test</b><span>giving backroll<b><span xml=\"color\">Turanga Leela</span>previous token</b></span><span color=\"red\" meta=\"fiels\">Viven</span><span>Super<b>Copy root</b>Any text</span><span>girl</span>";
    private static final String enterString3 = "<span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela </span></b></span><span>Super</span><span>girl</span>";

    private static String checkString;

    private static int indexTag = 0;

    private static ArrayList<ArrayItem> saveTags2 = new ArrayList<>();

    private static final HashMap<String, String> hashmapArraySave = new HashMap<>();

    private static final ArrayList<String> resultArrayList = new ArrayList<>();

    // https://regex101.com/r/l2oarZ/1
    private static final String regExp = "<(\\w+)(?:[^>]*)>[^<>]*?<\\/\\1>";

    private static final String myTagName = "#";

    /////////////////////////////////////////////// main() ///////////////////////////////////////////////////

    public static void main(String[] args) {
        checkString = enterString1;

        System.out.println("===========================================\nRegExp using my Class ArrayList <ArrayItem>\n===========================================");
        System.out.println(checkString.replace("<", "\u001B[94m<").replace(">", ">\u001B[00m") + "\n");

        unDress();
        unDress();
        unDress();
        unDress();

        saveTags2.forEach(RegExpTest02::printResult);

        assemblyResultArrayList();

        resultArrayList.forEach(System.out::println);
    }

    public static void printResult(ArrayItem arrayItem) {
        System.out.println(arrayItem.index + " : " + arrayItem.stringTag);
    }

    public static void unDress() {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(checkString);

        String checkStringTmp = checkString;

        while (matcher.find()) {
            String indexTagStr = myTagName + String.format("%02d", indexTag);
            String stringTag = checkString.substring(matcher.start(), matcher.end());
            saveTags2.add(new ArrayItem(indexTagStr, stringTag));
            checkStringTmp = checkStringTmp.replace(stringTag, indexTagStr);
            indexTag++;
        }

        checkString = checkStringTmp;

        //System.out.println("\n" + checkString + "\n");
    }

    public static void assemblyResultArrayList() {

        // === Разбираю строку #01#02#03#04 на #01 #02 #03 #04 через RegExp #\d{2} или #.. // == https://regex101.com/r/IVOhS8/1
        Pattern pattern = Pattern.compile("#..");
        Matcher matcher = pattern.matcher(checkString);

        while (matcher.find()) {
            resultArrayList.add(checkString.substring(matcher.start(), matcher.end()));
        }

        while (haveArrayMyTag()) {

            System.out.println("before : " + resultArrayList);
            for (int i = 0; i < resultArrayList.size(); i++) {
                String itemArrayList = resultArrayList.get(i);

                if (itemArrayList.contains(myTagName)) {
                    int indexMyTag = itemArrayList.indexOf(myTagName);
                    String strIndex = itemArrayList.substring(indexMyTag, indexMyTag + 3);
                    itemArrayList = itemArrayList.replace(strIndex, getHTMLString(strIndex));
                    resultArrayList.set(i, itemArrayList);
                }
            }
            System.out.println("after  : " + resultArrayList + "\n");
        }

        resultArrayList.replaceAll(s -> s.replace("<", "\u001B[92m<").replace(">", ">\u001B[00m"));
    }

    private static String getHTMLString(String index) {
        for (ArrayItem item : saveTags2) {
            if (item.index.equals(index)) {
                return item.stringTag;
            }
        }

        return "";
    }

    private static boolean haveArrayMyTag() {
        for (String s : resultArrayList) {
            if (s.contains(myTagName)) {
                return true;
            }
        }
        return false;
    }

}

class ArrayItem {
    public String index;
    public String stringTag;

    public ArrayItem(String index, String stringTag) {
        this.index = index;
        this.stringTag = stringTag;
    }
}
