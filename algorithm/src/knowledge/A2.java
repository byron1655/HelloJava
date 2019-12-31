package knowledge;

import java.util.*;

/**
 * @author byron
 * @date 2020/4/15 15:00
 * @project HelloJava
 */
public class A2 {
    public static int[] frequencySort(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
//        System.out.println(map);

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue() > o2.getValue() ? -1 : 1;
            }
        });

//        System.out.println(list);

        int[] arr1 = new int[arr.length];

        int j = 0;
        for (Map.Entry<Integer, Integer> entry : list) {

            for (int i = 0; i < entry.getValue(); i++) {
                arr1[j] = entry.getKey();
                j++;
            }
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5, 6, 8, 2, 3};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }
}
