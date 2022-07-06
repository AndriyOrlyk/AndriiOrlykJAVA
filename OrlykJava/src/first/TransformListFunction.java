package first;

import java.util.ArrayList;
import java.util.List;

class TransformListFunction {
  static List<Long> findElementsMultiplesOfThree(List<Long> inputList) {
    List<Long> resultList = new ArrayList<>();
    for (Long element : inputList) {
      if (element % 3 == 0) {
        resultList.add(element);
      }
    }
    return resultList;
  }
}
