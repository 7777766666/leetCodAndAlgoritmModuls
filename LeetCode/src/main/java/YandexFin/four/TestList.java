package YandexFin.four;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void main(String[] args) {

        List <Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(4);
        integerList.add(59);
        integerList.add(60);

        System.out.println(integerList);
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i) - 1);
            System.out.println(integerList.get(i));


            if ( i == 0 ||  integerList.get(i) - integerList.get(i - 1) != 1){
                System.out.println(" предыдущего нет");
            }

        }



    }
}
