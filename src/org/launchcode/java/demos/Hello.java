package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */
public class Hello {
    public static void main(String[] args) {
        String greeting="Hello, World";
        String var=" Launch Code";

        System.out.println(greeting);

        System.out.println("should print var w/o white space in front "+ var.trim());
//    Experimenting with stacking
        var=var.substring(var.indexOf('L'),var.indexOf('h')+1) +var.substring(var.indexOf('C'),var.indexOf('e')+1);

        System.out.println("Should print var with no white space "+var);

        var=var.toUpperCase();

        System.out.println("should print all caps"+ var);

        System.out.println(var.charAt(5));



    }
}


