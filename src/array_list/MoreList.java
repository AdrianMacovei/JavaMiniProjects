package array_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoreList {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
//        list.add("kiwi");  error immutable collection
        ArrayList<String> groceries = new ArrayList<> (list);
        groceries.add("yogurt");

        ArrayList<Integer> numbers = new ArrayList<> (List.of(1, 2, 3, 4, 5, 6));
        numbers.add(1);
        System.out.println(numbers);


        System.out.println(list);
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<> (
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll((nextList));
        System.out.println(groceries);

        System.out.println(groceries.indexOf("milk"));
        System.out.println(groceries.lastIndexOf("bananas"));

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

    }
}
