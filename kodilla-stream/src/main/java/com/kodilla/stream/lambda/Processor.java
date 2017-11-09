package com.kodilla.stream.lambda;

public class Processor {


    public void execute(String a, String b, Executor executor) {
        executor.process(a,b);
    }
}