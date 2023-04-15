package org.example.TinkOff;

//public class Airplane {
//    private volatile boolean propellerState; // true - открыт, false - закрыт
//    private final long propellerDelay; // задержка между изменением состояния винта
//    private final long cameraDelay; // задержка между снимками камеры
//
//    public Airplane(long propellerSpeed, long cameraSpeed) {
//        propellerDelay = 1000 / propellerSpeed;
//        cameraDelay = 1000 / cameraSpeed;
//        propellerState = false; // изначально винт закрыт
//    }
//
//    public void engineWorkProcess() {
//        while (true) {
//            try {
//                Thread.sleep(propellerDelay);
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//                return;
//            }
//            propellerState = !propellerState;
//            if (propellerState) {
//                Application.threadPrintln("Opened");
//            } else {
//                Application.threadPrintln("Closed");
//            }
//        }
//    }
//
//    public void cameraWorkProcess() {
//        boolean cameraReady = false; // изначально камера не настроена
//        while (true) {
//            try {
//                Thread.sleep(cameraDelay);
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//                return;
//            }
//            if (!propellerState || cameraReady) {
//                Application.threadPrintln("Photo");
//                cameraReady = false; // после каждого снимка камера сбрасывается в ненастроенное состояние
//            } else {
//                Application.threadPrintln("Camera is not ready");
//            }
//            cameraReady = true; // камера готова к снимку только если перед ней нет лопасти винта
//        }
//    }
//}


//    Многопоточный самолёт✈️
//        У самолёта есть 1 винт и 1 камера, которую конструкторы установили сразу за винтом. Возникает проблема, камера должна снимать, обстановку перед самолётом так, чтобы на каждом снимке не было лопастей винта самолёта
//
//        Винт и камера работают параллельно, при этом камера должна снимать только в тот момент, когда перед ней нет лопасти винта.
//
//        Требуется описать класс самолёта, конструктор которого принимает на вход числа propellerSpeed - скорость вращения винта(оборотов/сек.) и cameraSpeed - количество снимков в секунду, которое может делать камера(снимков/сек.).
//
//        Ограничения
//        Винт может находится в двух положениях: Closed(Лопасть перекрывает камеру) и Opened(Не перекрывает);
//        Положение винта меняется каждые 1/propellerSpeed секунд;
//        Камере требуется делать преднастройку перед КАЖДЫМ снимком 1/cameraSpeed секунд;
//        Изначально камера находится в НЕнастроенном состоянии;
//        Камера МОЖЕТ проводить настройку, если перед ней находится лопасть винта;
//        Смена положения пропеллера и снимок камеры происходят с помощью вывода на консоль строки с сообщением(Closed/Opened/Photo);
//        Для вывода в консоль, используйте метод Application.threadPrintln.
//        Пример
//        Входные параметры:
//
//        propellerSpeed = 1
//
//        cameraSpeed = 2
//
//        Выходные:
//
//        Раз в секунду меняется положение винта, когда винт в положение Opened, камера начинает делать снимки два раза в секунду.
//        Пример вывода в консоль:
//
//        Closed
//        Opened
//        Photo
//        Photo
//        Closed
//        Opened
//        Photo
//        Photo
//        Closed
//        Примечание
//        Вам требуется описать только два метода: engineWorkProcess и cameraWorkProcess. При проверке эти методы будут обёрнуты в цикл и запущены в разных потоках.