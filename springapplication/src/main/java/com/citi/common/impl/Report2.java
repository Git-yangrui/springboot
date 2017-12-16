package com.citi.common.impl;

import com.citi.common.Report;
import org.springframework.stereotype.Component;

@Component
public class Report2 implements Report {

    @Override
    public void generate() {
        System.out.println("report2");
    }
}
