package hackerrank.problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWords {
    public static void main(String[] args) {
        String str= "hello world hello java world";
        String[] dev=str.split(" ");
        Set<String> uni= new LinkedHashSet<String>();
        for(String i:dev){
            uni.add(i);
        }
        for(String i:uni){
            System.out.print(i+" ");
        }



        //System.out.println(Arrays.toString(dev));
        
    }
}
