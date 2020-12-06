package com.wy.factory.pattern.simple;

/**
 * 增加一个课程的工厂，专门生产对应课程的对象
 */
public class MainClient03 {
    public static void main(String[] args) {
        ICourse course = CourseFactory01.create("java");
        course.goClass();
    }
}
