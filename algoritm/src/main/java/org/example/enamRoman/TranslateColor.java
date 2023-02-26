package org.example.enamRoman;

public enum TranslateColor {

    RED("красный"),
    GREEN("зеленый"),
    BLACK("черный");

    TranslateColor(String color) {
        this.color = color;
    }

    private final String color;

    public String getColorToRussian(){
        return color;
    }



}
