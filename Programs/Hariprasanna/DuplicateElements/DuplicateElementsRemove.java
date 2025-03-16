import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsRemove {

    public static void main(String[] args) {
        int[] originalArr = { 10, 9, 6, 2, 8, 3, 7, 5, 5, 6, 6, 7, 7, 7, 8, 8, 9, 9, 10, 10 };
        List<Integer> duplicateRemoved = new ArrayList<>();
        for (int i : originalArr) {
            if (!duplicateRemoved.contains(i)) {
                duplicateRemoved.add(i);
            }
        }
        System.out.print("Duplicate elements removed: " + duplicateRemoved);
    }
}
