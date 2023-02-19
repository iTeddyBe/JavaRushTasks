package regExp01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest01 {
    private static final String enterString1 = "<span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela</span></b></span><span>Any text<span>test fexperex<b>text and some<div>text div</div>end Any</b><span>Turanga</span>Leela extra Name</span>and Surname.</span><span>Super</span><span>girl</span>";
    private static final String enterString2 = "<b>test</b><span>giving backroll<b><span xml=\"color\">Turanga Leela</span>previous token</b></span><span color=\"red\" meta=\"fiels\">Viven</span><span>Super<b>Copy root</b>Any text</span><span>girl</span>";
    private static final String enterString3 = "<span xml:lang=\"en\" lang=\"en\"><b><span>Turanga Leela </span></b></span><span>Super</span><span>girl</span>";

    private static String checkString;

    private static final ArrayList<String>[] levelArrayList = new ArrayList[4];
    private static final ArrayList<String> saveTag = new ArrayList();
    private static int indexTag = 0;

    private static final HashMap<Integer, String> hashmapArraySave = new HashMap<>();

    private static final ArrayList<String> resultArrayList = new ArrayList<>();

    // https://regex101.com/r/l2oarZ/1
    private static final String regExp = "<(\\w+)(?:[^>]*)>[^<>]*?<\\/\\1>";

    private static final String myTagName = "#";

    public static void main(String[] args) {

        System.out.println("===============================\nRegExp using Array of ArrayList\n===============================");

        for (int i = 0; i < levelArrayList.length; i++) {
            levelArrayList[i] = new ArrayList<>();
        }

        checkString = enterString1;

        System.out.println(checkString.replace("<", "\u001B[94m<").replace(">", ">\u001B[00m") + "\n");

        unDress(0);
        unDress(1);
        unDress(2);
        unDress(3);

        assemblyResultArrayList();

        //resultArrayList.forEach(System.out::println);
        resultArrayList.forEach(RegExpTest01::printMy);
    }

    public static void printMy(String str) {
        System.out.println(str);
    }

    public static void unDress(int levelTag) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(checkString);

        String checkStringTmp = checkString;
        while (matcher.find()) {
            levelArrayList[levelTag].add(checkString.substring(matcher.start(), matcher.end()));
            String indexTagStr = myTagName + String.format("%02d", indexTag) + ":";
            String stringTag = checkString.substring(matcher.start(), matcher.end());
            saveTag.add(indexTagStr + stringTag);
            checkStringTmp = checkStringTmp.replace(stringTag, indexTagStr);
        }

        int index = 0;
        for (String str : levelArrayList[levelTag]) {
            checkString = checkString.replace(str, myTagName + levelTag + index);
            index++;
        }

        //arrayList.forEach(System.out::println);
        //System.out.println("\n" + checkString + "\n");
    }

    public static void assemblyResultArrayList() {

        for (int i = 0; i < checkString.length(); i = i + 3) {
            resultArrayList.add(checkString.substring(i, i + 3));
        }


        for (int j = 0; j < 10; j++) {

            //System.out.println("before : " + resultArrayList);
            for (int i = 0; i < resultArrayList.size(); i++) {
                String itemArrayList = resultArrayList.get(i);

                if (itemArrayList.contains(myTagName)) {
                    int indexMyTag = itemArrayList.indexOf(myTagName);
                    int levelAL = Character.getNumericValue(itemArrayList.charAt(indexMyTag + 1));
                    int indexAL = Character.getNumericValue(itemArrayList.charAt(indexMyTag + 2));
                    String strHTML = levelArrayList[levelAL].get(indexAL);

                    itemArrayList = itemArrayList.replace(myTagName + levelAL + indexAL, strHTML);
                    resultArrayList.set(i, itemArrayList);
                }
            }
            //System.out.println("after  : " + resultArrayList + "\n");
        }

        resultArrayList.replaceAll(s -> s.replace("<", "\u001B[92m<").replace(">", ">\u001B[00m"));
    }

    //private static String format

}
