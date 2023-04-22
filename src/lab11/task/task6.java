package lab11.task;

import java.util.HashMap;
import java.util.Map;

public class task6 {
    public static void findOverFive(HashMap<Integer, String> hm){
        for (int i = 0, j = 5; i <= hm.size(); i++,j++) {
            if(hm.get(j)!=null){
                System.out.println("Значение: " + hm.get(j));
            }
        }
    }

    public static void findKeyZero(HashMap<Integer, String> hm, int key){
        int count = 0;
        for(Map.Entry<Integer, String> item : hm.entrySet()){
            if(item.getKey() == key) {
                if (count != 0) System.out.println(", ");
                System.out.printf("Значение: %s", item.getValue());
                count++;
            }

        }
    }

    public static void multiplyOverFive(HashMap<Integer, String> hm){
        int result = 0;
        for(Map.Entry<Integer, String> item : hm.entrySet()) {
            if(item.getValue().length() > 5){
                if(result == 0) result = item.getKey();
                else result*= item.getKey();
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(0, "Null");
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "FourFour");
        hm.put(5, "Five");
        hm.put(6, "Six");
        hm.put(7, "Seven");
        hm.put(8, "Eight");
        hm.put(9, "NineNine");

        System.out.println("HashMap: " + hm + "\n");

        System.out.println("HashMap, где ключ > 5: ");
        findOverFive(hm);

        System.out.println("\n\nHashMap, где ключ = 0: ");
        findKeyZero(hm, 0);

        System.out.println("\n\nHashMap, перемножение ключей, где длина строки > 5: ");
        multiplyOverFive(hm);
    }
}
