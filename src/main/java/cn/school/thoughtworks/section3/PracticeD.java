package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> collectionC = cn.school.thoughtworks.section2.PracticeB.countSameElements(collectionA);
        return PracticeB.createUpdatedCollection(collectionC, object);
    }
}
