package Sett;

import java.util.*;

public class SetRunner {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        //unique - Set
        //Tree
        //Hash
        //LinkedHash

        //알파벳 순서대로 요소를 저장하기
        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("treeSet" + treeSet);

        //정렬하기, 삽입 순서를 제공
        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("linkedHashSet" + linkedHashSet);

        //알파벳 순서나 삽입 순서에 상관없이 입력하기
        Set<Character> hashSet = new HashSet<>(characters);
        System.out.println("hashSet" + hashSet);


    }
}
