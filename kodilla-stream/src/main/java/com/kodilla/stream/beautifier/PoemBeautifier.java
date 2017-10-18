package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    private String txt;

    public PoemBeautifier(String txt) {
        this.txt = txt;
    }

    public void beautify(PoemDecorator poemDecorator){

        String newTxt = poemDecorator.decorate(txt);

        System.out.println(newTxt);

    }

}
