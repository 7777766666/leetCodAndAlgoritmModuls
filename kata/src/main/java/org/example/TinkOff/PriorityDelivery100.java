//package org.example.TinkOff;
//
////import java.util.*;
////import java.lang.*;
////import org.json.JSONObject;
////import org.json.JSONArray;
////import java.time.ZonedDateTime;
////import java.time.format.DateTimeFormatter;
////
////class PriorityDelivery100
////{
////    public static void main(String args[])
////    {
////        Scanner scanner = new Scanner(System.in);
////        String json = scanner.nextLine(); // {"products": [...]}
////
////        // Parse input JSON
////        JSONObject input = new JSONObject(json);
////        JSONArray products = input.getJSONArray("products");
////
////        // Sort products by meetingTime in ascending order
////        List<JSONObject> sortedProducts = new ArrayList<>();
////        for (int i = 0; i < products.length(); i++) {
////            sortedProducts.add(products.getJSONObject(i));
////        }
////        Collections.sort(sortedProducts, new Comparator<JSONObject>() {
////            @Override
////            public int compare(JSONObject p1, JSONObject p2) {
////                ZonedDateTime t1 = ZonedDateTime.parse(p1.getString("meetingTime"));
////                ZonedDateTime t2 = ZonedDateTime.parse(p2.getString("meetingTime"));
////                return t1.compareTo(t2);
////            }
////        });
////
////        // Aggregate products into meetings
////        List<JSONObject> meetings = new ArrayList<>();
////        for (JSONObject product : sortedProducts) {
////            String clientId = product.getString("clientId");
////            String addressId = product.getString("addressId");
////            ZonedDateTime meetingTime = ZonedDateTime.parse(product.getString("meetingTime"));
////            JSONObject meeting = null;
////            for (JSONObject m : meetings) {
////                if (m.getString("clientId").equals(clientId) && m.getString("addressId").equals(addressId)) {
////                    meeting = m;
////                    break;
////                }
////            }
////            if (meeting == null) {
////                meeting = new JSONObject();
////                meeting.put("clientId", clientId);
////                meeting.put("addressId", addressId);
////                meeting.put("meetingTime", meetingTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
////                meeting.put("products", new JSONArray());
////                meetings.add(meeting);
////            }
////            JSONArray meetingProducts = meeting.getJSONArray("products");
////            JSONObject productCopy = new JSONObject();
////            productCopy.put("id", product.getString("id"));
////            productCopy.put("type", product.getString("type"));
////            productCopy.put("creationTime", product.getString("creationTime"));
////            meetingProducts.put(productCopy);
////        }
////
////        // Format and print output JSON
////        JSONObject output = new JSONObject();
////        output.put("meetings", new JSONArray(meetings));
////        System.out.println(output.toString(2));
////    }
////}
//
//
//
////class PriorityDelivery
////{
////    public static void main(String args[])
////    {
////        Scanner scanner = new Scanner(System.in);
////        String json = scanner.nextLine(); // {"products": [...]}
////        //
////        // products -> meetings processing
////        //
////        System.out.println("result here"); // {"meetings": [...]}
////    }
////}
//
//
//    Приоритетная доставка 💳
//        С доставки банковских продуктов начинается сотрудничество между банком и клиентом. Важным этапом при этом является приоритезация и планирование доставок.
//
//        Ограничения
//
//        Метод принимает на вход (System.in) строку - JSON массив со списком продуктов;
//        Метод возвращает (System.out) агрегированный список встреч - JSON массив;
//        В качестве JSON-парсера используется библиотека (уже есть в classpath).
//        Текст задачи
//
//        Необходимо из входного стрима продуктов, готовых к выдаче, составить список встреч с клиентами.
//
//        Формат входного стрима продуктов (System.in):
//
//        {
//        "products": [
//        {
//        "id": "68fe1976-473f-4e8a-b162-851d1c8b2e27",
//        "clientId": "401559ed-b24f-4847-aeb1-d49e6f00db9d",
//        "addressId": "da0abd02-a0ae-4620-bcd4-84344aa59d5d",
//        "type": "Junior Debit",
//        "creationTime": "2023-04-06T05:26:43.968+03:00",
//        "meetingTime": "2023-04-05T13:55:24.968+03:00"
//        }
//        ]
//        }
//        в примере строка входного стрима отформатирована для наглядности. В тестовых данных символов перевода каретки не будет, json целиком будет в одной строке:
//
//        {"products": [{"id": "68fe1976-473f-4e8a-b162-851d1c8b2e27","clientId": "401559ed-b24f-4847-aeb1-d49e6f00db9d","addressId": "da0abd02-a0ae-4620-bcd4-84344aa59d5d","type": "Junior Debit","creationTime": "2023-04-06T05:26:43.968+03:00","meetingTime": "2023-04-05T13:55:24.968+03:00" }]}
//        Продукт: привезут от дебетовой карты до ипотеки.
//
//        Свойства продукта:
//
//        Название поля в JSON
//
//        Расшифровка
//
//        Тип данных
//
//        id
//
//        идентификатор продукта
//
//        UUID, NOT NULL
//
//        type
//
//        тип продукта
//
//        string, NOT NULL
//
//        meetingTime
//
//        запланированное время доставки продукта. Основной параметр для сортировки встреч
//
//        ISO, со смещением (см. пример),
//        NOT NULL
//
//        clientId
//
//        уникальный идентификатор пользователя
//
//        UUID, NOT NULL
//
//        addressId
//
//        уникальный идентификатор адреса пользователя
//
//        UUID, NOT NULL
//
//        creationTime
//
//        время создания продукта
//
//        ISO, со смещением (см. пример),
//        NOT NULL
//
//        Формат выходного стрима встреч (System.out):
//
//        {
//        "meetings": [
//        {
//        "meetingTime": "2023-04-05T09:54:01.968+03:00",
//        "clientId": "401559ed-b24f-4847-aeb1-d49e6f00db9d",
//        "addressId": "e41362a9-eabd-4875-af71-71c3e43c5cd6",
//        "products": [
//        {
//        "creationTime": "2023-04-06T05:14:19.968+03:00",
//        "id": "a78159d1-bfbc-4f76-946b-c216d903508e",
//        "type": "Black Debit"
//        }
//        ]
//        }
//        ]
//        }
//        Порядок полей в рамках одного объекта JSON выходного стрима не важен;
//        В выходной строке можно использовать форматированный JSON (с символом перевода каретки).
//        Встреча - подписание документов для получения продукта (-ов). Можно получить несколько продуктов за одну встречу.
//
//        Свойства встречи:
//
//        Название поля в JSON
//
//        Расшифровка
//
//        Тип данных
//
//        meetingTime
//
//        время встречи. Ближайшее из meetingTime готовых к выдаче продуктов клиента
//
//        ISO, со смещением (см. пример),
//        NOT NULL
//
//        clientId
//
//        уникальный идентификатор пользователя
//
//        UUID, NOT NULL
//
//        addressId
//
//        уникальный идентификатор адреса пользователя
//
//        UUID, NOT NULL
//
//        products
//
//        список продуктов. Формат продукта:
//        { "id": "...", "type": "...", "creationTime": "..." }
//
//        со значением полей из входного стрима продуктов
//
//        массив объектов, NOT NULL
//
//        Правила агрегации списка продуктов в список встреч:
//
//        Встречи отсортированы по дате meetingTime (ASC). Встречи с одинаковым meetingTime дополнительно сортируются между собой по clientId (лексикографический порядок без учета регистра (ASC)). Встречи с одинаковыми meetingTime и clientId дополнительно сортируются между собой по addressId (лексикографический порядок без учета регистра (ASC)).
//        При наличии у одного клиента (под определенным clientId) нескольких запланированных получений продуктов на один адрес (addressId), необходимо данные продукты добавить в созданную встречу с ближайшим запланированным временем (см. meetingTime) и общими clientId и addressId.
//        Продукты во встрече отсортированы по дате их создания creationTime (ASC). Продукты с одинаковым creationTime дополнительно сортируются между собой по id (лексикографический порядок без учета регистра (ASC)).
//        Все временные поля должны быть в следующем формате ISO: "2023-04-06T05:26:43.968+03:00".
//        Пример
//
//        Входные параметры:
//
//        {
//        "products": [
//        {
//        "id": "5d538f86-c70a-11ed-afa1-0242ac120002",
//        "type": "Black Debit",
//        "meetingTime": "2023-03-15T18:00:00+03:00",
//        "addressId": "e41362a9-eabd-4875-af71-71c3e43c5cd6",
//        "clientId": "dc86186e-c6e7-11ed-afa1-0242ac120002",
//        "creationTime": "2023-03-14T10:00:00.145+03:00"
//        },
//        {
//        "id": "6511875a-c70a-11ed-afa1-0242ac120002",
//        "type": "All Airlines Debit",
//        "meetingTime": "2023-03-15T18:45:00+03:00",
//        "addressId": "f2941ac0-d510-11ed-afa1-0242ac120002",
//        "clientId": "a0af1e4c-c6f8-11ed-afa1-0242ac120002",
//        "creationTime": "2023-03-14T09:00:00.812+03:00"
//        },
//        {
//        "id": "6e313fe2-c70a-11ed-afa1-0242ac120002",
//        "type": "Drive Credit",
//        "meetingTime": "2023-03-14T11:00:00+03:00",
//        "addressId": "e41362a9-eabd-4875-af71-71c3e43c5cd6",
//        "clientId": "dc86186e-c6e7-11ed-afa1-0242ac120002",
//        "creationTime": "2023-03-14T05:00:00.555+03:00"
//        },
//        {
//        "id": "75e12be5-9fcd-4853-a0dc-4e32f8cb2eac",
//        "type": "Junior Debit",
//        "meetingTime": "2023-03-15T18:45:00+03:00",
//        "addressId": "eb612fb8-d510-11ed-afa1-0242ac120002",
//        "clientId": "a0af1e4c-c6f8-11ed-afa1-0242ac120002",
//        "creationTime": "2023-03-14T09:00:00.654+03:00"
//        }
//        ]
//        }
//        Выходные параметры:
//
//        {
//        "meetings": [
//        {
//        "meetingTime": "2023-03-14T11:00:00+03:00",
//        "clientId": "dc86186e-c6e7-11ed-afa1-0242ac120002",
//        "addressId": "e41362a9-eabd-4875-af71-71c3e43c5cd6",
//        "products": [
//        {
//        "creationTime": "2023-03-14T05:00:00.555+03:00",
//        "id": "6e313fe2-c70a-11ed-afa1-0242ac120002",
//        "type": "Drive Credit"
//        },
//        {
//        "creationTime": "2023-03-14T10:00:00.145+03:00",
//        "id": "5d538f86-c70a-11ed-afa1-0242ac120002",
//        "type": "Black Debit"
//        }
//        ]
//        },
//        {
//        "meetingTime": "2023-03-15T18:45:00+03:00",
//        "clientId": "a0af1e4c-c6f8-11ed-afa1-0242ac120002",
//        "addressId": "eb612fb8-d510-11ed-afa1-0242ac120002",
//        "products": [
//        {
//        "creationTime": "2023-03-14T09:00:00.654+03:00",
//        "id": "75e12be5-9fcd-4853-a0dc-4e32f8cb2eac",
//        "type": "Junior Debit"
//        }
//        ]
//        },
//        {
//        "meetingTime": "2023-03-15T18:45:00+03:00",
//        "clientId": "a0af1e4c-c6f8-11ed-afa1-0242ac120002",
//        "addressId": "f2941ac0-d510-11ed-afa1-0242ac120002",
//        "products": [
//        {
//        "creationTime": "2023-03-14T09:00:00.812+03:00",
//        "id": "6511875a-c70a-11ed-afa1-0242ac120002",
//        "type": "All Airlines Debit"
//        }
//        ]
//        }
//        ]
//        }
//        Клиент с clientId dc86186e-c6e7-11ed-afa1-0242ac120002 заказал карту Drive Credit для себя, а потом еще и карту Black Debit для жены. Обе карты готовы к выдаче. Оба продукта попадают в одну встречу, т. к. едут к одному клиенту на один адрес. Продукты отсортированы по времени в данной встрече. Время встречи выбрано ближайшее среди meetingTime двух продуктов;
//        Клиент с clientId a0af1e4c-c6f8-11ed-afa1-0242ac120002 заказал карту Junior Debit себе по адресу 6511875a-c70a-11ed-afa1-0242ac120002, а потом еще и карту Junior Debit для сына по адресу eb612fb8-d510-11ed-afa1-0242ac120002. Обе карты готовы к выдаче. Продукты попадают в разные встречи, т.к. едут по разным адресам. Так как время встречи и clientId у данных двух встреч одинаковые, то решающим в сортировке является поле addressId - встреча с адресом eb612fb8-d510-11ed-afa1-0242ac120002 приоритетнее встречи с адресом f2941ac0-d510-11ed-afa1-0242ac120002.ф
//
//
//class PriorityDelivery
//{
//    public static void main(String args[])
//    {
//        Scanner scanner = new Scanner(System.in);
//        String json = scanner.nextLine(); // {"products": [...]}
//        //
//        // products -> meetings processing
//        //
//        System.out.println("result here"); // {"meetings": [...]}
//    }
//}
