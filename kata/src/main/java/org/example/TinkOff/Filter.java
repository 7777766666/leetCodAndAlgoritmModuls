package org.example.TinkOff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Filter {

    public static void main(String[] args) {

        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        one.add(0);
//        one.add(5);
//        one.add(4);
//        one.add(5);
//        one.add(44);
        one.add(null);
        one.add(null);
        one.add(77777777);
//        two.add(5);
//        two.add(4);
        two.add(0);
        two.add(null);
        two.add(777777777);

        Filter filter = new Filter();
        System.out.println(filter.filterOneCollectionByAnother(one, two));
    }



    public List<Integer> filterOneCollectionByAnother(List<Integer> firstCollection, List<Integer> secondCollection) {
        if (firstCollection == null || secondCollection == null) {
            return Collections.emptyList();
        }

        Set<Integer> set = new HashSet<>(secondCollection);
        List<Integer> result = new ArrayList<>();
        for (Integer value : firstCollection) {
            if (set.contains(value)) {
                result.add(value);
            }
        }
        return result;
    }
        }


//    public List<Integer> filterOneCollectionByAnother(List<Integer> firstCollection, List<Integer> secondCollection) {
//
//        Set<Integer> set = new HashSet<>(secondCollection);
//        List<Integer> filteredCollection = new ArrayList<>();
//
//        for (Integer element : firstCollection) {
//            if (set.contains(element)) {
//                filteredCollection.add(element);
//            }
//        }
//
//        return filteredCollection;
//    }
//
//}


//    Фильтр коллекции
//    Необходимо отфильтровать одну числовую коллекцию по другой.
//        Требуется реализовать метод получающий на вход две коллекции. Первая коллекция которую фильтруем, вторая по которой фильтруем. В итоге необходимо вернуть результат содержащий только те элементы из первой коллекции, которые есть во второй.
//
//        Ограничения
//        Любая из коллекций может быть пустой.
//
//        Пример
//        Входные данные:
//
//        1. [3,5,4,5,4]
//        2. [5,4]
//
//        Выходные:
//        [5,4,5,4] Порядок не важен.

//public class Filter {
//    public List<Integer> filterOneCollectionByAnother(List<Integer> firstCollection, List<Integer> secondCollection) {
//        // пожалуйста добавьте свой код здесь
//    }
//}



//Тест 2 не прошел проверку
//        Error
//        Exception in thread "main" java.lang.UnsupportedOperationException
//        at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
//        at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.removeIf(ImmutableCollections.java:152)
//        at Filter.filterOneCollectionByAnother(Filter.java:13)
//        at Application.main(Application.java:17)