package com.company;

import java.io.*;
import java.util.Scanner;

public class MyArray {
    private int[] a;
    private int n;

    MyArray() {
        a = new int[5];
        n = 0;
    }

    public void toFile(String filepath) throws IOException {
        File f = new File(filepath);
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f, true)), true);
        pw.print(toMyString());
    }

    public void fromFile(String filepath) {
        try {
            Scanner sc = new Scanner(new File(filepath));
            while (sc.hasNextInt()) {
                add(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("no file, deal with it");
        }
    }

    public void add(int x) {
        if (n == a.length) {
            int[] b = new int[a.length * 2];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        a[n] = x;
        n++;
    }

    public String toMyString() {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += a[i] + " ";
        }
        return s;
    }

    public int size() {
        return n;
    }

    public int get(int y) {
        if (y < 0 || y > size()) {
            return -1;
        }
        return a[y];
    }

    public void delete(int y) {
        if (y < 0 || y > size()) {
            return;
        }
        for (int i = y; i < size() - 1; i++) {
            a[i] = a[i + 1];
            n--;
        }
    }
}