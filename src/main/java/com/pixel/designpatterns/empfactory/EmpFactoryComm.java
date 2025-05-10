package com.pixel.designpatterns.empfactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpFactoryComm {

    private String id;
    private String name;
    private String city;
    private int age;
    private String modeOfContact;
    private String email;
    private String phoneNumber;
}
