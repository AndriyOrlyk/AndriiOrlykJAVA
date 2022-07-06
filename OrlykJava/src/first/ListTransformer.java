package first;

import java.util.List;

class ListTransformer {
  static String TransformToString(List<Long> list) {
    StringBuilder result = new StringBuilder();
    list.forEach(element -> result.append(element).append(", "));
    return result.toString();
  }
}
