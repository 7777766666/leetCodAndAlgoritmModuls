//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//
//48 баллов
//
//public class Main {
//
//    /*
//	Для чтения входных данных необходимо получить их
//	из стандартного потока ввода (System.in).
//	Данные во входном потоке соответствуют описанному
//	в условии формату. Обычно входные данные состоят
//	из нескольких строк. Можно использовать более производительные
//	и удобные классы BufferedReader, BufferedWriter, Scanner, PrintWriter.
//
//	С помощью BufferedReader можно прочитать из стандартного потока:
//	* строку -- reader.readLine()
//	* число -- int n = Integer.parseInt(reader.readLine());
//	* массив чисел известной длины (во входном потоке каждое число на новой строке) --
//	int[] nums = new int[len];
//    for (int i = 0; i < len; i++) {
//        nums[i] = Integer.parseInt(reader.readLine());
//    }
//	* последовательность слов в строке --
//	String[] parts = reader.readLine().split(" ");
//
//	Чтобы вывести результат в стандартный поток вывода (System.out),
//	Через BufferedWriter можно использовать методы
//	writer.write("Строка"), writer.write('A') и writer.newLine().
//
//	Возможное решение задачи "Вычислите сумму чисел в строке":
//	int sum = 0;
//    String[] parts = reader.readLine().split(" ");
//    for (int i = 0; i < parts.length; i++) {
//        int num = Integer.parseInt(parts[i]);
//        sum += num;
//    }
//    writer.write(String.valueOf(sum));
//	*/
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String www = reader.readLine();
//        double newWeight = (double) Integer.valueOf(www);
//        String nk = reader.readLine();
//        String[] split = nk.split(" ");
//        Integer n = Integer.valueOf(split[0]);
//        Integer k = Integer.valueOf(split[1]);
//
//
//        String[] photos = new String[n];
//        double[] wSizeStart = new double[n];
//        double[] hSizeStart = new double[n];
//        for (int i = 0; i < n; i++) {
//            photos[i] = reader.readLine();
//            String[] photoSize = photos[i].split("x");
//            wSizeStart[i] = Integer.valueOf(photoSize[0]);
//            hSizeStart[i] = Integer.valueOf(photoSize[1]);
//        }
//
//        int[] newH = new int[hSizeStart.length];
//        for (int i = 0; i < newH.length; i++) {
//            newH[i] = (int) Math.ceil (hSizeStart[i] * newWeight / wSizeStart[i]);
//        }
//
//
//        Arrays.sort(newH);
//
//        int min = 0;
//        for (int i = 0; i < k; i++) {
//            min += newH[i];
//        }
//
//        int max = 0;
//        for (int i = newH.length - k; i < newH.length; i++) {
//            max += newH[i];
//        }
//
//
//
//        writer.write(String.valueOf(min));
//        writer.newLine();
//        writer.write(String.valueOf(max));
//        writer.close();
//        reader.close();
//
//    }
//}
