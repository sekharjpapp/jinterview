package com.pixel.designpatterns.empfactory;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class EmployeefactoryClient {
    public static void main(String[] args) {

        // Creating a list of EmpFactoryComm objects using Arrays.asList
        List<EmpFactoryComm> employees = Arrays.asList(
                new EmpFactoryComm("1", "Alice", "New York", 30, "email", "alice@example.com", "123-456-7890"),
                new EmpFactoryComm("2", "Bob", "Chicago", 28, "mobile", "bob@example.com", "234-567-8901"),
                new EmpFactoryComm("3", "Charlie", "San Francisco", 35, "email", "charlie@example.com", "345-678-9012"),
                new EmpFactoryComm("4", "Diana", "Los Angeles", 40, "mobile", "diana@example.com", "456-789-0123"),
                new EmpFactoryComm("5", "Eve", "Boston", 25, "email", "eve@example.com", "567-890-1234")
        );
        CommunicationFactory factory = new CommunicationFactory();
        for (EmpFactoryComm emp : employees) {
            Optional<Communication> processorOpt = factory.getProcessedBy(emp.getModeOfContact());
            processorOpt.ifPresentOrElse(
                    processor -> processor.process(emp),
                    () -> System.out.println("No processor found for mode of contact: " + emp.getModeOfContact())
            );
        }
    }
}
