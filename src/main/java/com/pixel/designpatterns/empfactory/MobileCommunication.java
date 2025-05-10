package com.pixel.designpatterns.empfactory;

public class MobileCommunication implements Communication{
    @Override
    public void process(EmpFactoryComm emp) {
        System.out.println(emp.getName()+
                " communicated via Mobile  : " + emp.getPhoneNumber());

    }
}
