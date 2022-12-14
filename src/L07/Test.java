package L07;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        l1.add("phone");
        l1.add("blue");
        l1.add("pixel");
        List<String> l2 = new ArrayList<>();
        l2.add("computer");
        l2.add("silver");
        l2.add("lenovo");
        List<String> l3 = new ArrayList<>();
        l3.add("phone");
        l3.add("silver");
        l3.add("iphone");
        list.add(l1);
        list.add(l2);
        list.add(l3);
        System.out.println(countMatches(list,"color","silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res;
        switch (ruleKey) {
            case "color":
               return countMatch(items, 1, ruleValue);
            case "type":
                return countMatch(items, 0, ruleValue);
            case "name":
                return countMatch(items, 2, ruleValue);
        }
        return 0;
    }

    private static int countMatch(List<List<String>> items, int i, String ruleValue) {
        int count =0;
        for (List<String> item : items
        ) {
            if(item.get(i).equals(ruleValue))
                count++;
        }
        return count;
    }
}
