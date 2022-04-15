package com.bernic.patterns.creational.builder.fluent;

public class FluentBuilderRecursiveGenericsDemo {
    public static void main(String[] args) {
        EmployeeBuilder eb = new EmployeeBuilder()
                .withName("Dmitri")
                .worksAs("Quantitative Analyst");
        System.out.println(eb.build());
    }
}
