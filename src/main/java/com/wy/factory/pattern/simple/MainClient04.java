package com.wy.factory.pattern.simple;

/**
 * 增加一个课程的工厂，专门生产对应课程的对象
 */
public class MainClient04 {
    public static void main(String[] args) {
        ICourse course = CourseFactory02.create("com.wy.factory.pattern.simple.JavaCourse");
        course.goClass();
    }
}
