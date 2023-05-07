package com.belajar.design.pattern.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = PrototypeApplication.class)
public class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype() {
        Employee willi = applicationContext.getBean("employeeManager", Employee.class);
        willi.setName("willi");

        Employee buli = applicationContext.getBean("employeeVicePresident", Employee.class);
        buli.setName("buli");

        Employee ama = applicationContext.getBean("employeeStaff", Employee.class);
        ama.setName("ama");

        Employee william = applicationContext.getBean("employeeCLevel", Employee.class);
        william.setName("william");

        System.out.println(willi);
        System.out.println(buli);
        System.out.println(ama);
        System.out.println(william);
    }
}
