package lesson3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Box <T extends Fruit> {
    public List<T> getList(){
        return list;
    }
    private List<T> list;

    public  Box(T... obj){
        list = Arrays.asList(obj);
    }
    public Box(){
        list = new ArrayList<T>();
    }

    void add(T obj){
        list.add(obj);
    }
    void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке находится "  + list.get(0).toString() + ": " + list.size() + " шт.");
        }
    }

    float getWeight(){
        if (list.isEmpty()){
            return 0;
        } else{
               return list.size()*list.get(0).getWeight();
            }
    }
    void moveFruit(Box<T> box) {
        for (T obj : list) {
            box.add(obj);
        }
       list.clear();
    }

      boolean compare(Box<? extends Fruit> box) {
      return this.getWeight() == box.getWeight();
    }
}
