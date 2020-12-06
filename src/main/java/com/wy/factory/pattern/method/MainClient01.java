package com.wy.factory.pattern.method;

public class MainClient01 {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        ICourse iCourse = factory.create();
        iCourse.goClass();
    }

}
