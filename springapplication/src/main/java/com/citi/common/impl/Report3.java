package com.citi.common.impl;

import com.citi.common.Report;
import org.springframework.stereotype.Component;

@Component
public class Report3 implements Report {

    @Override
    public void generate() {
        System.out.println("report3");
    }
}
