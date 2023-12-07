package week_14.assigment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Question_14_16{
    public static void main(String[] args) throws FileNotFoundException{

        File file = new File("C:\\Users\\Dell\\IdeaProjects\\inar-github\\src\\week_14\\assigment\\Question_14_16.java");
        if (!file.exists()){
            System.out.println("GO HOME");
            System.exit(1);
        }
        Map<String, Integer> map = new TreeMap<>();


        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                String word = input.next();
                String[] array = word.split("[\\s*\\d_;'}\n\t/:,!{().\\[\\]\\\\<>+=\"\\-]+");
                
                for (int i = 0; i < array.length; i++){
                    if (!map.containsKey(array[i])){
                        map.put(array[i], 1);
                    } else{
                        map.put(array[i], map.get(array[i]) + 1);
                    }
                }

            }


        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }


    }

}




