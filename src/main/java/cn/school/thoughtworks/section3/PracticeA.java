package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> list = object.get("value");
        for (String element : list) {
            collectionA.put(element, collectionA.get(element) - 1);
        }
        return collectionA;
    }
}
