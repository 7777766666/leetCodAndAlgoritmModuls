package org.example.algday1;

import java.util.*;

public class ComboGenerator {

    public static void main(String[] args) {
        List<Integer[]> combinations = new ArrayList<>();

        Random rand = new Random();
        while (combinations.size() < 100) {
            Integer[] combo = new Integer[5];
            rand = new Random();
            combo[0] = rand.nextInt(10) + 10;
            combo[1] = rand.nextInt(10) + 20;
            combo[2] = rand.nextInt(10) + 30;
            combo[3] = rand.nextInt(10) + 40;
            combo[4] = rand.nextInt(10) + 50;
            if (!combinations.contains(combo)) {
                combinations.add(combo);
            }
        }

        int[] counts = new int[60]; // массив счетчиков для каждой цифры
        for (Integer[] combo : combinations) {
            for (int num : combo) {
                counts[num - 10]++; // инкрементируем соответствующий счетчик для каждой цифры
            }
        }


        List<Count> listChisel = new ArrayList<Count>();

        for (int i = 0; i < 50; i++) {
            listChisel.add(new Count(i + 10, counts[i]));
        }


        Collections.sort(listChisel, new Comparator<Count>() {
            public int compare(Count c1, Count c2) {
                return c2.getCount() - c1.getCount();
            }
        });

        for (Count count : listChisel) {
            System.out.println("Цифра " + count.getNum() + " встретилась " + count.getCount() + " раз");
        }

        Collections.sort(combinations, new Comparator<Integer[]>() {
            public int compare(Integer[] combo1, Integer[] combo2) {
                int count1 = 0, count2 = 0;
                for (int i = 0; i < 5; i++) {
                    count1 += counts[combo1[i] - 10];
                    count2 += counts[combo2[i] - 10];
                }
                return count2 - count1;
            }
        });

        for (Integer[] combo : combinations) {
            for (int num : combo) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("А вот и загаданное число программой");

        Integer[] zagadanayaCombinaciya = combinations.get(rand.nextInt(combinations.size()));

        for (int num : zagadanayaCombinaciya) {
            System.out.print(num + " ");
        }
        System.out.println();



        System.out.println("-------------------------------------------------------------------------");
        Integer[] vishuiPredentent = combinations.get(0);
        System.out.println("Высший прединтент"+Arrays.toString(vishuiPredentent));
        int poputka = 0;
        int count = 0;
        while (count<5) {

            count = 0;
            for (int i = 0; i < 5; i++) {
                if (Arrays.asList(zagadanayaCombinaciya).contains(vishuiPredentent[i])) {
                    count++;
                }
            }
            System.out.println("Количество совпадений: " + count);
            poputka++;
            System.out.println("попытока--------------------------------------------------------- " + poputka);
            if (count == 5) {
                System.out.println("Вы выиграли! Количество попыток: " + poputka);
                System.out.println(Arrays.toString(zagadanayaCombinaciya));
                break; // выйти из цикла while
            }

            else if (count > 0 && count < 5) {
                combinations.remove(0);
                vishuiPredentent = combinations.get(0);
                System.out.println("On bil udalen");
                System.out.println("Высший прединтент"+Arrays.toString(vishuiPredentent));
            }
            else if (count == 0) {
                for (int i = 0; i < 5; i++) {
                    int num = vishuiPredentent[i];
                    Iterator<Integer[]> iterator = combinations.iterator();
                    while (iterator.hasNext()) {
                        Integer[] combo = iterator.next();
                        if (combo != vishuiPredentent && Arrays.asList(combo).contains(num)) {
                            iterator.remove();
                        }
                    }
                    System.out.println("Byli udaleny vse combinacii soferghsie ego - a tak ge on sam");
                    combinations.remove(vishuiPredentent);



                    System.out.println("Novaya sortirovka");
                    Collections.sort(combinations, new Comparator<Integer[]>() {
                        public int compare(Integer[] combo1, Integer[] combo2) {
                            int count1 = 0, count2 = 0;
                            for (int i = 0; i < 5; i++) {
                                count1 += counts[combo1[i] - 10];
                                count2 += counts[combo2[i] - 10];
                            }
                            return count2 - count1;
                        }
                    });


                }

                vishuiPredentent = combinations.get(0);
                System.out.println("Высший прединтент"+Arrays.toString(vishuiPredentent));

            }

        }



    }
}




class Count {
    private int num;
    private int count;

    public Count(int num, int count) {
        this.num = num;
        this.count = count;
    }

    public int getNum() {
        return num;
    }

    public int getCount() {
        return count;
    }
}