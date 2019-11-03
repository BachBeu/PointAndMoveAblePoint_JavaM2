package com.Bach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point point = new Point(2,3);
        System.out.println(point.toString());
        MoveAblePoint movablePoint = new MoveAblePoint(2,3,4,5);
        System.out.println(movablePoint.toString());
    }
}
