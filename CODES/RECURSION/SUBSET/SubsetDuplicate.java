package CODES.RECURSION.SUBSET;

import java.util.*;

public class SubsetDuplicate {
    public static void main(String[] args) {
            int[] arr  = {2, 1, 2};
            List<List<Integer>> res = subsetDuplicate(arr);
            for (List<Integer> list : res) {
                    System.out.println(list);
            }
    }

    public static  List<List<Integer>> subsetDuplicate(int[] arr){
            Arrays.sort(arr);
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>());

            int start = 0;
            int end = 0;

            for (int i = 0; i < arr.length; i++) {
                    start = 0;
                    //if current and previous element is same, s = e + 1

                    if (i > 0 && arr[i] == arr[i - 1]){
                            start = end + 1;
                    }

                    end = outer.size() - 1;
                    int n = outer.size();

                    for (int j = start; j < n; j++) {
                            List<Integer> inner = new ArrayList<>(outer.get(j));
                            inner.add(arr[i]);
                            outer.add(inner);
                    }
            }

            return outer;

    }
}
