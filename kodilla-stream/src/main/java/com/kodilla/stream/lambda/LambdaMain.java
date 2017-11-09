package com.kodilla.stream.lambda;

public class LambdaMain {

    public static void main(String[] args) {

        Processor processor = new Processor();
        processor.execute("pppp", "aaaa", (x,  y) -> System.out.println("bla bla bla " + x + " " + y));
    }
}










//// korzysta z interfejsu Executor
//
//        Processor processor = new Processor();
//
//// korzysta z implementacji interfejsu executor
//
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//
//// implementacja wlozona w interfejs
//
//        processor.execute(executeSaySomething);
//    }
//}
//
