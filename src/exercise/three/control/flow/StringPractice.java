package exercise.three.control.flow;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args){
        String sues="I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
//        splits string at space
        String[] strArr=sues.split(" ");
        String[] strSentence=sues.split("(?<=[a-z])\\\\.\\\\s+");

        System.out.println(Arrays.toString(strSentence));
    }
}
