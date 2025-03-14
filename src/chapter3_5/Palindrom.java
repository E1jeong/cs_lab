package chapter3_5;

import chapter3_4.MyArrayStack;

public class Palindrom {
    private static boolean isPalindrom(String str) {
        MyArrayStack<Character> stack = new MyArrayStack();
        MyLinkedQueue<Character> queue = new MyLinkedQueue();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            queue.enQueue(str.charAt(i));
        }

        while (!stack.isEmptyStack() && stack.pop() == queue.deQueue()) {

        }

        if (stack.isEmptyStack()) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println("palindrom check");
        String str = "lioninoil";
        boolean t = isPalindrom(str);
        System.out.println(str + " is Palindrom?: " + t);
    }
}
