package org.example.enumMy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Start {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        Rofl rofl = new Rofl();
        System.out.println(rofl.getRofl());

        Field[] declaredFields = rofl.getClass().getDeclaredFields();

        for (Field xxx: declaredFields){
            System.out.println(xxx.getName());
            if (xxx.getName().equals("z")){
                xxx.setAccessible(true);
                xxx.set(rofl, 666);
            }
        }
        System.out.println(rofl.getRofl());

        Rofl y = new Rofl();
        System.out.println(y.getRofl());

        Class<Rofl> roflClass = Rofl.class;
        Field[] roflClassDeclaredFields = roflClass.getDeclaredFields();
        for (Field xxx : roflClassDeclaredFields){
            System.out.println(xxx.getName());
            if (xxx.getName().equals("z")){
                xxx.setAccessible(true);
//                xxx.set(roflClass, 333333);
            }
        }
        System.out.println(y.getRofl());
int sumReflect = -99999999;
        Rofl w = new Rofl();
        int[] lol = { 2, 100, 1000, 7};
        Sum7 sum75 = new Sum7();
        Method[] sumMethods5 = sum75.getClass().getDeclaredMethods();
        for (Method xxx : sumMethods5){
            if (xxx.getName().equals("sum")){
                xxx.setAccessible(true);
                sumReflect = (int) xxx.invoke(sum75, lol);
            }
        }

//        System.out.println(Sum.sum(lol));
        System.out.println(sumReflect);

        Sum7 sum7 = new Sum7();
        Method[] sumMethods = sum7.getClass().getDeclaredMethods();
        for (Method xxx : sumMethods){
            if (xxx.getName().equals("sum")){
                xxx.setAccessible(true);
                // создаем новый объект InvocationHandler
                InvocationHandler handler = new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        int[] arr = (int[]) args[0];
                        int result = arr[0];
                        for (int i = 1; i < arr.length; i++) {
                            result -= arr[i];
                        }
                        return result;
                    }
                };
                // создаем прокси-объект для класса Sum с новым методом sum()
                Object proxy = Proxy.newProxyInstance(
                        Sum7.class.getClassLoader(),
                        new Class<?>[] { Sum7.class },
                        handler
                );
                // вызываем новый метод sum() через прокси-объект
                int result = (int) xxx.invoke(proxy, (Object) new int[] {2, 100, 1000, 7});
                System.out.println(result); // печатаем результат (-1109)
            }
        }


    }

}
