package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> collectionC = PracticeA.countSameElements(collectionA);
        return PracticeB.createUpdatedCollection(collectionC, object);
    }
}
