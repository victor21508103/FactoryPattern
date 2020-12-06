package com.wy.factory.pattern.simple;

public class CourseFactory01 {

    public static ICourse create(String name) {
        if (name.equals("java")) {
            return new JavaCourse();
        } else if (name.equals("python")) {
            return new PythonCourse();
        } else {
            return null;
        }
    }

}
