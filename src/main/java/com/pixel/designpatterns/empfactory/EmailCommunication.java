package com.pixel.designpatterns.empfactory;

public class EmailCommunication implements Communication{
    @Override
    public void process(EmpFactoryComm emp) {
        System.out.println(emp.getName()+
                " communicated via Email : " + emp.getEmail());
    }
}
