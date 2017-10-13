package com.fgm.exercise;

import java.util.List;

public class AmazonCodeTest {

    public static class OOP {

        public interface Shape {

            void resize(Point a, Point b);

            int getArea();

            int getPerimeter();
        }

        public class Point {
            public int x;
            public int y;
        }


        public class Line implements Shape {
            public Point begin;
            public Point end;


            public void resize(Point newBegin, Point newEnd) {
                begin = newBegin;
                end = newEnd;
            }

            public int getPerimeter() {
                return 0;
            }

            public int getArea() {
                return 0;
            }
            //The other methods to overwrite of the interface

        }

        public class Circle implements Shape {
            Point center;
            Integer radius;

            public void resize(Point newCenter, Point pointRadius) {
                center = newCenter;
                radius = (pointRadius.x - pointRadius.x);
            }

            public int getPerimeter() {
                return 0;
            }

            public int getArea() {
                return 0;
            }
        }

        public class Rectangle implements Shape {
            Point vertexA;
            Point vertxB;

            public void resize(Point newBegin, Point newEnd) {
                vertexA = newBegin;
                vertxB = newEnd;
            }

            public int getPerimeter() {
                return 0;
            }

            public int getArea() {
                return 0;
            }
        }

    }


//    Setup:
//    Assume primitive Facebook. FB has Members.
//    class Member {
//        String name;
//        String email;
//        List<Member> friends;
//    }
//
//    Question:
//    Code printSocialGraph(Member m). Direct friends of m are Level 1 friends. Friends of friends are level 2 friends.....and so on
//    Print level 1 friends first. Then print level 2 friends....and so on
//
//    void printSocialGraph (Member m){
//
//        //Your code here
//
//    }

    public class Member {
        String name;
        String email;
        List<Member> friends;
    }

    public void printSocialGraph(Member m) {

    }

//    Write an efficient function that returns the n’th Fibonacci number (There are many ways to solve this problem. Please write the most efficient method possible).
//    Each Fibonacci number is the sum of the last two.  The first 10 are: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
//    long getNthFibonacci(long i) { ... }

    public static long getNthFibonacci(long i){
        long seq[] = new long[(int)i];

        seq[0] = seq[1] = 1;

        for(int n=2; n<i; n++){
            seq[n] = seq[n-1] + seq[n-2];
        }
        return seq[(int)i-1];
    }

    public static long getNthFibonacci2(long i){

        if(i==1 || i==2) return 1;
        long aux1 = 1;
        long aux2 = 1;

        long sum = 0;
        for(int n=2; n<i; n++){
            sum = aux1 + aux2;
            aux1 = aux2;
            aux2 = sum;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getNthFibonacci2(9));
    }

}
