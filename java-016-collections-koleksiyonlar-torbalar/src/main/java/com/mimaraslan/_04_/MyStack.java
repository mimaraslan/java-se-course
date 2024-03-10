package com.mimaraslan._04_;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {


        Stack <String> stackList = new Stack<>();

        stackList.push("Fevzi");
        stackList.push("Furkan");
        stackList.push("Gözde");
        stackList.push("Barış");
        stackList.add("Eyüp");
        stackList.add(2, "Abdullah");

        System.out.println(stackList);

        stackList.pop();

        System.out.println(stackList);

        System.out.println(stackList.peek());
        System.out.println(stackList.search("Fevzi"));
        System.out.println(stackList.empty());
        System.out.println(stackList.isEmpty());


    }
}
