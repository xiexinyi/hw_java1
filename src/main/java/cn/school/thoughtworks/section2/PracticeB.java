package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
  Map<String, Integer> countSameElements(List<String> collection1) {
    //实现练习要求，并改写该行代码。
    Map<String, Integer> result = new HashMap<>();
    for (String element : collection1) {
      if (element.length() > 1){
        String[] parts = element.split("-");
        result.put(parts[0], Integer.parseInt(parts[1]));
      } else {
        if (!result.containsKey(element)) {
          result.put(element, 1);
        } else {
          result.put(element, result.get(element) + 1);
        }
      }
    }
    return result;
  }
}

