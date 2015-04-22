package com.tw;

public class Main {

    public static void main(String[] args) {
        System.out.println("Line (horizontal) : \n"+getLine(5,false,'*' ));
        System.out.println("\nLine (vertical) : \n"+getLine(5,true,'*' ));
        System.out.println("\nRight Angled Triangle : \n"+getRightAngledTriangle(5, false, '*'));
        System.out.println("\nIsosceles Triangle : \n"+getIsoscelesTriangle(5, false, '*', 0));
        System.out.println("\nDiamond : \n"+getDiamond(5, '*'));
        System.out.println("\nDiamond with Msg : \n"+getDiamondWithMsg("Bill", 5, '*'));
    }

    public static String getLine(int numberOfCharInLine,
                                 boolean isVerticalLine, char charToPrint) {

        String lineString = "";
        for (int i = 0; i < numberOfCharInLine; i++) {

            lineString += String.valueOf(charToPrint);
            lineString += isVerticalLine? "\n": "";
        }
        return lineString;
    }

    public static String getRightAngledTriangle(int height,
                                                boolean isInverted, char charToPrint) {
        String triangleString = "";
        for (int i = 0; i < height; i++) {

            final int numberOfChar = isInverted ? height - i : i + 1;

            triangleString += getLine(numberOfChar, false, charToPrint);
            triangleString += "\n";
        }
        return triangleString;
    }

    public static String getIsoscelesTriangle(int height, boolean isInverted,
                                              char charToPrint, int indentation) {
        String triangleString = "";
        for(int i = 0; i < height; i++) {

            final int numberOfSpace = (isInverted ? i : height-1-i) + indentation;
            final int numberOfChar = isInverted ? (height - i)*2 - 1 : i*2+1;

            triangleString += getLine(numberOfSpace,false,' ');
            triangleString += getLine(numberOfChar, false, charToPrint);
            triangleString += "\n";
        }
        return triangleString;
    }

    public static String getDiamond(int height, char charToPrint) {
        String diamondString = "";

        diamondString += getIsoscelesTriangle(height, false, charToPrint,0);
        diamondString += getIsoscelesTriangle(height -1 , true, charToPrint,1);

        return diamondString;
    }

    public static String getDiamondWithMsg(String msg, int height, char charToPrint) {
        String diamondString = "";

        diamondString += getIsoscelesTriangle(height-1, false, charToPrint,1);
        diamondString += msg + "\n";
        diamondString += getIsoscelesTriangle(height-1,true, charToPrint, 1);

        return diamondString;
    }

}
