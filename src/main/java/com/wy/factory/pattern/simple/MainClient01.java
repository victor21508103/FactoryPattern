package com.wy.factory.pattern.simple;

/**
 * 如果继续增加课程，客户端依赖会越来越臃肿
 */
public class MainClient01 {
    public static void main(String[] args) {
        ICourse course = new JavaCourse();
        course.goClass();
        ICourse course1 = new PythonCourse();
        course1.goClass();
    }
}
