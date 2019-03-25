package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();
        for (String element : collection1) {
            String key = Character.toString(element.charAt(0));
            Integer num;
            Integer length = element.length();
            if (length > 1) {
                if (element.charAt(1) == '[') {
                    num = Integer.parseInt(element.substring(2,length - 1));
                } else {
                    num = Character.getNumericValue(element.charAt(2));
                }
            } else {
                num = 1;
            }
            if (!result.containsKey(key)) {
                result.put(key, num);
            } else {
                result.put(key, result.get(key) + num);
            }

        }
        return result;
    }
}
