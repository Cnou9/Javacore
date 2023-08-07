package LessonArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<String> strings=new ArrayList<>();
        List<Integer> integers=new ArrayList<>(Arrays.asList(1,4,10,5,8));
        List<Integer> integerChild=new ArrayList<>(Arrays.asList(48,30));
        strings.add("Cuong");
        /*strings.get(0);
        System.out.println(strings.get(0));
        System.out.println(integers.get(2));*/

//        xoa object hoac index
//        System.out.println(integers.remove(4));

        /*integers.add(2,11);
        System.out.println(integers);*/
        integers.addAll(integerChild);
        System.out.println(integers);
        Collections.sort(integers);
        System.out.println(integers);
    }
}
