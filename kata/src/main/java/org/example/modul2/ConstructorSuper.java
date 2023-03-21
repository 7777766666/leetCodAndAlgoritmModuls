package org.example.modul2;

public class ConstructorSuper {


    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class JavaStudent extends Student {
//        static String xxx = "Прохожу курс по Java.";

        public JavaStudent() {
            super(new String("Jva"));





        }


    }

    public static void main(String[] args) {
        Student student = new Student();
        JavaStudent javaStudent = new JavaStudent();
        javaStudent.study();
    }

}


