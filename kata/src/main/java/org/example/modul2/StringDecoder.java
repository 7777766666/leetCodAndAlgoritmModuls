package org.example.modul2;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDecoder {

    public static void main(String[] args) {
        String str = "РҐРѕС‰СѓСЏ СЋСЉРЅР¶СѓР±, Рѕ С‘РѕС€СЊС‡С‰ СЋСЉРѕС‘СѓР±";
        byte[] bytes = str.getBytes(Charset.forName("windows-1251")); // передаем нужную кодировку
        String ttt = "Хакер пляшет, а чайник плачет.";
        System.out.println(Arrays.toString(ttt.getBytes()));
        System.out.println(Arrays.toString(bytes)); // выводим массив байт в консоль

        Charset utf8Charset = StandardCharsets.UTF_8; // объект Charset для кодировки UTF-8
        String str8 = new String(bytes, utf8Charset); // преобразование в строку с указанием кодировки
        System.out.println(str8); // вывод: hello привет
        System.out.println(ttt);

      String ddd = new String(Arrays.toString(ttt.getBytes()));
        System.out.println(ddd);


    }

    public static void write(String str) {

        for (int i = 0; i < str.length(); i++) { // проходим по всем символам в строке
            char c = str.charAt(i); // получаем символ по индексу
            int code = (int) c; // приводим символ к числовому значению типа int
            System.out.println(c + ": " + code); // выводим символ и его код
        }
    }
}


//
//        private static byte[] readBytesFromFile(String filePath) throws IOException {
//            File file = new File(filePath);
//            InputStream is = new FileInputStream(file);
//            long fileSize = file.length();
//            byte[] bytes = new byte[(int) fileSize];
//            int offset = 0;
//            int numRead = 0;
//            while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
//                offset += numRead;
//            }
//            if (offset < bytes.length) {
//                throw new IOException("Could not completely read file " + file.getName());
//            }
//            is.close();
//            return bytes;
//        }
//    }

//
//    В данной строке был использован шифр Цезаря с ключом 7 для кодировки символов в кодировке Windows-1251.
//
//        Шифр Цезаря - это простой метод шифрования, который основан на замене каждой буквы в сообщении на букву, которая находится на несколько позиций вперед или назад в алфавите. В данном случае, каждый символ был заменен на символ, который находится на 7 позиций вперед в алфавите.
//
//        Кодировка Windows-1251 используется для представления символов на русском языке в компьютерных системах. В данной кодировке каждый символ представлен одним байтом. Например, символ "Х" представлен байтом 0x98, а символ "а" представлен байтом 0xE0.