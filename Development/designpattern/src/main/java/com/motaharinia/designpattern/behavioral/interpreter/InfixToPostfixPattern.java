package com.motaharinia.designpattern.behavioral.interpreter;

import java.util.Stack;

public class InfixToPostfixPattern implements Pattern {
    /**
     * متد تبدیل
     *
     * @param exp عبارت
     * @return خروجی: عبارت تبدیل شده
     */
    @Override
    public String conversion(String exp) {
        //اولویت عملگرها
        int priority = 0;
        //خروجی
        String postfix = "";
        //پشته حروف
        Stack<Character> s1 = new Stack<Character>();
        //حلقه روی حروف عبارت ورودی
        for (int i = 0; i < exp.length(); i++) {
            Character ch = exp.charAt(i);
            //اگر حرف یکی از عملگرهای زیر بود
            if (ch.equals('+') || ch.equals('-') || ch.equals('*') || ch.equals('/') || ch.equals('%')) {
                // تقدم را بررسی میکنیم
                if (s1.size() <= 0) {
                    s1.push(ch);
                } else {
                    //بالاترین آیتم استک را میخوانیم ولی حذف نمیکنیم
                    Character chTop = (Character) s1.peek();
                    if (chTop == '*' || chTop == '/')
                        priority = 1;
                    else
                        priority = 0;
                    if (priority == 1) {
                        if (ch == '*' || ch == '/' || ch == '%') {
                            postfix += s1.pop();
                            i--;
                        } else { // Same
                            postfix += s1.pop();
                            i--;
                        }
                    } else {
                        if (ch == '+' || ch == '-') {
                            postfix += s1.pop();
                            s1.push(ch);
                        } else
                            s1.push(ch);
                    }
                }
            } else {
                postfix += ch;
            }

        }

        Integer len = s1.size();
        for (Integer j = 0; j < len; j++) {
            postfix += s1.pop();
        }
        return postfix;

    }
}
