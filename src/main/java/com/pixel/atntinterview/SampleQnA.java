package com.pixel.atntinterview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SampleQnA {
    public static void main(String[] args) {

        String str = """
            [
                {
                    "name": "Alice",
                    "class": 2,
                    "marks": 90
                },
                {
                    "name": "Bob",
                    "class": 2,
                    "marks": 80
                },
                {
                    "name": "David",
                    "class": 3,
                    "marks": 95
                },
                {
                    "name": "John",
                    "class": 4,
                    "marks": 100
                }
            ]
            """;

        List<Student> students = Arrays.asList(
                new Student("Alice", 2, 90),
                new Student("Bob", 2, 80),
                new Student("David", 3, 95),
                new Student("John", 4, 100)
        );

        Map<Integer, List<String>> result = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getStudentClass,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ));
        // REST api security
        // what is @ControlleAdvice
        result.forEach((k, v) -> System.out.println(k + " : " + v));
        /*// name : class
        Arrays.stream(str);
        .collect(Collectors.groupingBy(Student::getClassName(),Student::getStudentClass()));

        forEach(()-> System.out.println(k + " " +v));*/

        // select name, class  from student where = (select MAX(marks) from student;
        //   name
    }
    /*sealed interface Account extends NoticeAccount,InstantAccont {

    }
    public final class NoticeAccount{

    }*/
    //  spring-kafka dependency
    // configuration in application.yml  : brokers - host names, topic name, Serilizers
    // @Service Java class - KafkaProducer {   KafkaTemplate<String,JavaCustomClass>  ;
    //  a java method to send Kafka messages } avro
    //

}
