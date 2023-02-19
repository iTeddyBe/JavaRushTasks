package regExp01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest03 {
    private static final String enterString1 = "<span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela</span></b></span><span>Any text<span>test fexperex<b>text and some<div>text div</div>end Any</b><span>Turanga</span>Leela extra Name</span>and Surname.</span><span>Super</span><span>girl</span>";
    private static final String enterString2 = "<b>test</b><span>giving backroll<b><span xml=\"color\">Turanga Leela</span>previous token</b></span><span color=\"red\" meta=\"fiels\">Viven</span><span>Super<b>Copy root</b>Any text</span><span>girl</span>";
    private static final String enterString3 = "<span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela </span></b></span><span>Super</span><span>girl</span>";

    private static String checkString;

    private static int indexTag = 0;

    private static final HashMap<String, String> hashmapArraySave = new HashMap<>();

    private static final ArrayList<String> resultArrayList = new ArrayList<>();

    // https://regex101.com/r/l2oarZ/1
    private static final String regExp = "<(\\w+)(?:[^>]*)>[^<>]*?<\\/\\1>";

    private static final String myTagName = "#";

    /////////////////////////////////////////////// main() ///////////////////////////////////////////////////

    public static void main(String[] args) {
        checkString = enterString1;

        System.out.println("===========================================\nRegExp using HashMap\n===========================================");
        System.out.println(checkString.replace("<", "\u001B[94m<").replace(">", ">\u001B[00m") + "\n");

        unDress();
        unDress();
        unDress();
        unDress();

        hashmapArraySave.forEach(RegExpTest03::printResultHash);

        assemblyResultArrayList();

        resultArrayList.replaceAll(s -> s.replace("<", "\u001B[92m<").replace(">", ">\u001B[00m"));
        resultArrayList.forEach(System.out::println);
    }

    public static void printResultHash(String index, String stringTag) {
        System.out.println(index + " : " + stringTag);
    }

    public static void unDress() {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(checkString);

        String checkStringTmp = checkString;

        while (matcher.find()) {
            String indexTagStr = myTagName + String.format("%02d", indexTag);
            String stringTag = checkString.substring(matcher.start(), matcher.end());
            hashmapArraySave.put(indexTagStr, stringTag);
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

            //System.out.println("before : " + resultArrayList);
            for (int i = 0; i < resultArrayList.size(); i++) {
                String itemArrayList = resultArrayList.get(i);

                if (itemArrayList.contains(myTagName)) {
                    int indexMyTag = itemArrayList.indexOf(myTagName);
                    String strIndex = itemArrayList.substring(indexMyTag, indexMyTag + 3);
                    itemArrayList = itemArrayList.replace(strIndex, hashmapArraySave.get(strIndex));
                    resultArrayList.set(i, itemArrayList);
                }
            }
            //System.out.println("after  : " + resultArrayList + "\n");
        }

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

