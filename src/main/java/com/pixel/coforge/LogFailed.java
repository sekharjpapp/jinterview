package com.pixel.coforge;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*
Each Log contains the following fields: requestId, statusCode, timestamp
	Requirement:
	A request is considered failed if statusCode >= 400
	Find the most recent failed request
	Print its requestId
	Use Java 8 Stream API
* */
public class LogFailed {
    static void main() {
        List<Log> logs = List.of(
                new Log("r1", 200, LocalDateTime.of(2024, 1, 1, 10, 0)),
                new Log("r2", 500, LocalDateTime.of(2024, 1, 1, 10, 5)),
                new Log("r3", 404, LocalDateTime.of(2024, 1, 1, 11, 0)),
                new Log("r4", 200, LocalDateTime.of(2024, 1, 1, 12, 0))
        );

        Optional<String> failedReq = logs.stream()
                .filter(log -> log.statusCode() != null && log.statusCode() >= 400)
                .max(Comparator.comparing(Log::timestamp))
                .map(Log::requestId);

        failedReq.ifPresentOrElse(
                id -> System.out.println("Most recent failed request: " + id),
                () -> System.out.println("No failed request found")
        );
    }
}
record Log(String requestId, Integer statusCode, LocalDateTime timestamp) {}
