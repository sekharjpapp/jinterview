package com.pixel.general;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalary {
    public static void main(String[] args) {
        Map<String, Integer> empSalaryMap = new HashMap<>();
        empSalaryMap.put("anil", 1000);
        empSalaryMap.put("ankit", 1200);
        empSalaryMap.put("bhavna", 1200);
        empSalaryMap.put("james", 1200);
        empSalaryMap.put("micael", 1000);
        empSalaryMap.put("tom", 1300);
        empSalaryMap.put("daniel", 1300);
        System.out.println(getNthHighestSalary(empSalaryMap));
    }
    public static Map.Entry<Integer, List<String>> getNthHighestSalary(Map<String,Integer> empSalaryMap) {
        return empSalaryMap.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList()
                .get(1);
    }


}
