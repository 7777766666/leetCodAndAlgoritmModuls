package org.example.YYYY;

public class PhotoReserv {



        public static void main(String[] args) {
            int k = 5; // количество выбранных фотографий
            int w = 500; // ширина ленты

            int[] height = new int[k]; // массив для хранения высот фотографий

            for (int i = 0; i < k; i++) {
                int h = 1000; // исходная высота фотографии
                int originalWidth = 1000; // исходная ширина фотографии

                // вычисляем высоту после масштабирования
                int scaledHeight = (h * w) / originalWidth;

                height[i] = scaledHeight; // сохраняем высоту в массив
            }

            // находим наименьшую и наибольшую высоту
            int minHeight = height[0];
            int maxHeight = height[0];

            for (int i = 1; i < k; i++) {
                if (height[i] < minHeight) {
                    minHeight = height[i];
                }

                if (height[i] > maxHeight) {
                    maxHeight = height[i];
                }
            }

            System.out.println("Наименьшая высота ленты: " + minHeight);
            System.out.println("Наибольшая высота ленты: " + maxHeight);
        }



}
