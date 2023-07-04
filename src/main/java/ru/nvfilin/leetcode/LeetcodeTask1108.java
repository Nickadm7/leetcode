package ru.nvfilin.leetcode;

public class LeetcodeTask1108 {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char[] buffer = address.toCharArray();
        for (char c : buffer) {
            if (c != '.') {
                sb.append(c);
            } else {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }
}

/*
1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
*/
