package com.wy.factory.pattern.simple;

/**
 * 增加一个课程的工厂，专门生产对应课程的对象
 */
public class MainClient05 {
    public static void main(String[] args) {
        ICourse course = CourseFactory03.create(JavaCourse.class);
        course.goClass();
    }
}
