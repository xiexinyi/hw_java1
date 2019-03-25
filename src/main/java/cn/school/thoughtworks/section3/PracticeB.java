package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    static Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> list = object.get("value");
        for (String element : list) {
            int num = collectionA.get(element);
            int multiple = num / 3;
            collectionA.put(element, collectionA.get(element) - multiple);
        }
        return collectionA;
    }
}
