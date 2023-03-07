package org.example.charExpression;


/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\"
 * (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
public class CharExpression {

    public static void main(String[] args) {

//        char y = /;
        int x = (int) '/'; // сделать из чара инт сначала
        System.out.println((charExpression(15)) + "  этот символ юникод вернули");


    }


    public static char charExpression(int a) {
//        int x = ;

//        System.out.println(x + "   !!!!!");
        return (char) ('\\' + 1 + a);
//        char c = (char) x;

//        return v;

    }

}
