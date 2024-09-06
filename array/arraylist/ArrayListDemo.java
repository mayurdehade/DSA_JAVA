package array.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        //declaring ArrayList
//        List<Type> list = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C++");
        languages.add("Go");

        //printing ArrayList
        System.out.println(languages);

        //access
        String s = languages.get(1); //retrieve the element at index 1
        System.out.println(s);

        //change
        languages.set(1, "Python");
        System.out.println(languages);

        //length (no of element present)
        System.out.println(languages.size());

        //remove
        languages.remove(2); //remove 2nd index element
        System.out.println(languages);

        //iteration
        for(String language: languages) {
            System.out.println(language);
        }
    }
}
