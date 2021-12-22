package com.hptn.lam.huongdoituong.tichhaidoituongmatran;

import java.util.Scanner;

public class Matrix {
    private int n, m;
    private int[][] a;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        a = new int[n][m];
    }

    public int getM() {
        return m;
    }

    public int getA(int m, int n) {
        return a[m][n];
    }

    public void setA(int m, int n, int i) {
        this.a[m][n] = i;
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b) {
        Matrix c = new Matrix(n, b.getM());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b.getM(); j++) {
                for (int k = 0; k < m; k++) {
                    c.setA(i, j, c.getA(i, j) + a[i][k] * b.getA(k, j));
                }
            }
        }
        return c;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s.append(a[i][j]).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
