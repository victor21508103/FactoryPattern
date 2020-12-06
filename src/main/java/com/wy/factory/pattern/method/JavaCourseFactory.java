package com.wy.factory.pattern.method;

public class JavaCourseFactory implements ICourseFactory{

    public ICourse create() {
        System.out.println("进行创建java课程对象的一系列操作");
        return new JavaCourse();
    }
}
