package com.ironhack.main;

import com.ironhack.classes.Task;
import com.ironhack.classes.TaskList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /** Example for exercise 1 */
        oddIntegerList(11);

        /** Example for exercise 2 */
        String phrase = "you have to break you";
        System.out.println(checkKeyWordsInString(phrase));

        /** Example for exercise 5 */
        ArrayList<Task> taskList1 = new ArrayList<>();
        taskList1.add(new Task("Hacer la compra"));
        TaskList taskList = new TaskList(taskList1);
        System.out.println(taskList.getTaskList().get(0).getTask());
    }

    /** Exercise 1: Employing TDD, create a method that takes in an integer n and
     * returns an array of all odd integers from 1 to n. Write your tests first!*/
    public static List[] oddIntegerList(int num) {
        List[] oddIntList;
        int initNumber=1;
        if (num > initNumber && (num % 2) !=0) {
            oddIntList = new List[(num/2)+1];
            for (int i=0; i<oddIntList.length; i++) {
                oddIntList[i] = Collections.singletonList((2 * i) + initNumber);
                System.out.println(oddIntList[i]);
            }
        } else if (num > initNumber && (num % 2) ==0) {
            oddIntList = new List[num/2];
            for (int i = 0; i < oddIntList.length; i++) {
                oddIntList[i] = Collections.singletonList((2 * i) + initNumber);
                System.out.println(oddIntList[i]);
            }
        } else if (num==initNumber){
            oddIntList = new List[1];
            oddIntList[0]= Collections.singletonList(1);
            System.out.println(oddIntList[0]);
        } else {
            System.out.println("No puede haber una lista de tamaño negativo");
            return null;
        }
        return oddIntList;
    }

    /** Exercise 2: Java has certain words that are considered "Java Keywords". Keywords are reserved
     * and cannot be used as variable names. Employing TDD, create a method that takes in a String and
     * returns true if the String contains any Java Keywords. For example, break is a Java keyword. The
     * String "Don't break my heart" should return true. The String "I love to breakdance" should return
     * false. You will need to use Google to find a list of all Java Keywords. */
    public static Boolean checkKeyWordsInString (String string) {
        Boolean haveKeywords=false;
        String[] keyWordList = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
                "class", "continue", "const", "default", "do", "double", "else", "enum", "exports", "extends",
                "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int",
                "interface", "long", "module", "native", "new", "package", "private", "protected", "public",
                "requires", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "var", "void", "volatile", "while"};
        String[] stringSplitted = string.split(" ");
        for (int i=0; i<stringSplitted.length; i++) {
            for (int j=0; j<keyWordList.length; j++) {
                if (stringSplitted[i].equals(keyWordList[j])) {
                    haveKeywords=true;
                }
            }
        }
        return haveKeywords;
    }
}
