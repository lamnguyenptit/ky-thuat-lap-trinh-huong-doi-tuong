package com.hptn.lam.huongdoituong.loptriangle2;

import java.util.Scanner;

public class Triangle {
    private Point a, b, c;

    public Triangle(String nextLine) {
        Scanner sc = new Scanner(nextLine);
        a = new Point(sc.nextDouble(), sc.nextDouble());
        b = new Point(sc.nextDouble(), sc.nextDouble());
        c = new Point(sc.nextDouble(), sc.nextDouble());
    }

    public boolean valid() {
        return tinhKhoangCach(a, b) + tinhKhoangCach(b, c) > tinhKhoangCach(a, c) &&
                tinhKhoangCach(b, c) + tinhKhoangCach(c, a) > tinhKhoangCach(a, b) &&
                tinhKhoangCach(c, a) + tinhKhoangCach(a, b) > tinhKhoangCach(b, c);
    }

    public String getPerimeter() {
        return String.format("%.3f", tinhKhoangCach(a, b) + tinhKhoangCach(b, c) + tinhKhoangCach(a, c));
    }

    private double tinhKhoangCach(Point a, Point b){
        return Math.sqrt(((a.getX()-b.getX()) * (a.getX()-b.getX())) + ((a.getY() - b.getY()) * (a.getY() - b.getY())));
    }
}
