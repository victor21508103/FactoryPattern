package com.wy.factory.pattern.method;

public class PythonCourseFactory implements ICourseFactory{
    public ICourse create() {
        System.out.println("进行创建python课程对象的一系列操作");
        return new PythonCourse();
    }
}
