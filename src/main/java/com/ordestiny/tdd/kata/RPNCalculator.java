package com.ordestiny.tdd.kata;

import java.util.ArrayList;
import java.util.List;


public class RPNCalculator {

    protected int calculate(String postfix) {
        if (!isValid(postfix)) {
            return 0;
        }

        String[] chars = postfix.split(" ");

        Stack<Integer> stack = new Stack<>();

        for (String s : chars) {
            if (isNumber(s)) {
                stack.push(Integer.parseInt(s));
            } else {
                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("The postfix expression cannot start with arithmetic op");
                }
                int op1 = stack.pop();
                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("The postfix expression is malformed. Please see some cases");
                }
                int op2 = stack.pop();
                int result = calculate(op1, op2, s);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private int calculate(int op1, int op2, String op) {
        switch (op) {
            case "*":
                return op2 * op1;
            case "/":
                return op2/op1;
            case "+":
                return op2 + op1;
            case "-":
                return op2 - op1;
            default:
                throw new IllegalArgumentException(op + " is not yet supported. Valid operations are [+, -, *, /]");
        }
    }

    private boolean isValid(String postfix) {
        return postfix != null && !postfix.isEmpty();
    }

    private boolean isNumber(String s) {
        for (char c : s.toCharArray()){
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}

class Stack<T> {
    private List<T> list = new ArrayList<>();
    private int size;

    public void push(T item) {
        list.add(item);
        size++;
    }

    public T pop() {
        T popped = list.get(size-1);
        list.remove(size-1);
        size--;
        return popped;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
