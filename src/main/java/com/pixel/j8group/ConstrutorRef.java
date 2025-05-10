package com.pixel.j8group;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConstrutorRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        List<Student> studentList = names.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(studentList);

        ExecutorService service = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            service.submit(new Task(i));
        }
        service.shutdown();

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        Stream<Integer> stream = list.stream();

        stream.forEach(System.out::println);
    }

    static class Task implements Runnable {
        private int taskId;

        public Task(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Running task " + taskId);
        }
    }
}
