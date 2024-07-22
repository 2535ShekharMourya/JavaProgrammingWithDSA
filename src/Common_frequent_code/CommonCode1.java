package Common_frequent_code;

import java.util.HashMap;
import java.util.Map;

public class CommonCode1 {
    public static void main(String[] args) {
        String num="1234";
        int addLastTwo=num.charAt(3)-'0' + num.charAt(2)-'0';
        System.out.println(addLastTwo);
    }

    // set Frequency of character occurrence in HashMap
    public void frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
    }

    // find maximum value in hashmap its corresponding key
    public void findMaxInHashmap(String s){
        Map<Character, Integer> map = new HashMap();
        char[] charArray = s.toCharArray();
        int max = 0;
        for (Character c : charArray) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
            max = Math.max(max, map.get(c));
        }
    }

    // how to convert "1234" into number like 1, 2,3,4 without String to integer conversion
    public void numStringToIntegerNum(){
        String num="1234";
        int addLastTwo=num.charAt(3)-'0' + num.charAt(2)-'0';
        System.out.println(addLastTwo);
    }
}
