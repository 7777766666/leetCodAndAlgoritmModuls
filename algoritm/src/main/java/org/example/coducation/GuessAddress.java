//package org.example.coducation;
//
//
//    import java.util.Random;
//import java.util.Scanner;
//
//    import java.util.Random;
//
//public class GuessAddress {
//    public static void main(String[] args) {
//        // Создание массивов городов, районов, улиц, домов и квартир
//        String[] cities = {"City1", "City2", "City3", "City4", "City5", "City6", "City7", "City8", "City9", "City10"};
//        String[] districts = {"District1", "District2", "District3", "District4", "District5", "District6", "District7", "District8", "District9", "District10"};
//        String[] streets = {"Street1", "Street2", "Street3", "Street4", "Street5", "Street6", "Street7", "Street8", "Street9", "Street10"};
//        String[] houses = {"House1", "House2", "House3", "House4", "House5", "House6", "House7", "House8", "House9", "House10"};
//        String[] flats = {"Flat1", "Flat2", "Flat3", "Flat4", "Flat5", "Flat6", "Flat7", "Flat8", "Flat9", "Flat10"};
//
//        // Генерация случайного адреса
//        Random rand = new Random();
//        String city = cities[rand.nextInt(cities.length)];
//        String district = districts[rand.nextInt(districts.length)];
//        String street = streets[rand.nextInt(streets.length)];
//        String house = houses[rand.nextInt(houses.length)];
//        String flat = flats[rand.nextInt(flats.length)];
//        String answer = city + district + street + house + flat;
//
//        // Перебор всех возможных комбинаций адресов
//        int numAttempts = 10;
//        String guess = "";
//        for (int i = 0; i < numAttempts; i++) {
//            // Генерация нового адреса на основе предыдущего
//            if (i == 0) {
//                guess = cities[rand.nextInt(cities.length)] + districts[rand.nextInt(districts.length)] + streets[rand.nextInt(streets.length)] + houses[rand.nextInt(houses.length)] + flats[rand.nextInt(flats.length)];
//            } else {
//                guess = generateNextAddress(guess, answer);
//            }
//
//            // Проверка количества совпадений и вывод результата
//            int numMatches = countMatches(guess, answer);
//            System.out.println("Attempt " + (i+1) + ": " + guess + " (" + numMatches + " matches)");
//            if (numMatches == 5) {
//                System.out.println("Congratulations, you guessed the address!");
//                return;
//            }
//        }
//        System.out.println("Sorry, you didn't guess the address in " + numAttempts + " attempts.");
//    }
//
//    // Метод для генерации следующего адреса на основе предыдущего
//    private static String generateNextAddress(String guess, String answer) {
//        String nextGuess = guess;
//        Random rand = new Random();
//
//        // Поиск первого несовпадающего элемента в адресе
//        int index = 0;
//        while (guess.charAt(index) == answer.charAt(index)) {
//            index++;
//        }
//

        // Генерация нового элемент






                                //            Random random = new Random();
//            Scanner scanner = new Scanner(System.in);
//
//            // создаем массивы для городов, районов, улиц, домов и квартир
//            String[] cities = {"Москва", "Санкт-Петербург", "Казань", "Нижний Новгород", "Екатеринбург", "Самара", "Омск", "Красноярск", "Владивосток", "Ростов-на-Дону"};
//            String[] districts = {"Центральный", "Первомайский", "Ленинский", "Приволжский", "Заречный", "Советский", "Кировский", "Красноармейский", "Фрунзенский", "Октябрьский"};
//            String[] streets = {"Ленина", "Кирова", "Гагарина", "Мира", "Советская", "Красная", "Пушкина", "Комсомольская", "Свердлова", "Горького"};
//            String[] houses = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
//            String[] apartments = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
//
//            // выбираем случайный адрес
//            String city = cities[random.nextInt(cities.length)];
//            String district = districts[random.nextInt(districts.length)];
//            String street = streets[random.nextInt(streets.length)];
//            String house = houses[random.nextInt(houses.length)];
//            String apartment = apartments[random.nextInt(apartments.length)];
//            String address = city + ", " + district + " район, ул. " + street + ", д. " + house + ", кв. " + apartment;
//
//            // устанавливаем максимальное количество попыток
//            int maxAttempts = 10;
//            int attempts = 0;
//
//            // игровой цикл
//            while (attempts < max
//
//        }
