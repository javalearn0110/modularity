package ru.sibintek.mainmodule;

import ru.sibintek.factorial.Factorial;

import javax.swing.*;

public class MainModule {
    public static void main(String[] args) {
        int a = 5;
        int b = Factorial.calculate(a);
        JOptionPane.showMessageDialog(null,
          "Hello from Main class of " +
          "modularity module! Factorial of " + a +
          " is equal to " + b);
    }
}