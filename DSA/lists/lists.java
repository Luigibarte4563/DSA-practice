import java.util.ArrayList;
import java.util.List;

public class lists{
    public static void main(String[]args){

        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("bird");
        animals.add("frog");

        for(String animal : animals){
            System.out.println(animal);
        }
    }
}