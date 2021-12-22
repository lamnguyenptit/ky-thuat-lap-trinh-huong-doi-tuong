package com.hptn.lam.huongdoituong.tichmatranvachuyenvicuano;

import java.util.Scanner;

public class Matrix {
    private int n, m;
    private int[][] a;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }

    public int getM() {
        return m;
    }

    public int getA(int n, int m) {
        return a[n][m];
    }

    public void setA(int n, int m, int i) {
        this.a[n][m] = i;
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix trans() {
        Matrix c = new Matrix(m, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c.setA(j, i, a[i][j]);
            }
        }
        return c;
    }

    public Matrix mul(Matrix b) {
        Matrix c = new Matrix(n, b.getM());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b.getM(); j++) {
                for (int k = 0; k < m; k++) {
                    c.setA(i, j, c.getA(i, j) + a[i][k]*b.getA(k, j));
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
