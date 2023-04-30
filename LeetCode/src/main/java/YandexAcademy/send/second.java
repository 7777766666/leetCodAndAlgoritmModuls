package YandexAcademy.send;

public class second {


    public static void main(String[] args) {


//        SELECT AVG (network_time_ms) AS avg_network_time_ms
//        FROM(
//                SELECT(response_received_time - request_sent_time)AS network_time_ms
//                FROM(
//                        SELECT
//                        datetime AS response_received_time,
//                        LAG(datetime)OVER(PARTITION BY request_id ORDER BY datetime)AS response_sent_time,
//                        LAG(datetime, 2)OVER(PARTITION BY request_id ORDER BY datetime)AS request_sent_time
//                        FROM requests
//                        WHERE type IN('RequestReceived', 'ResponseSent')
//                )t
//                WHERE response_sent_time IS NOT NULL
//        ) t;

    }

}
