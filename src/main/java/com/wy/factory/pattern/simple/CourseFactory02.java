package com.wy.factory.pattern.simple;

//客户端变简单了，但是每增加一种课程，工厂的create方法就得作相应的逻辑修改，不符合开放封闭原则
public class CourseFactory02 {

    public static ICourse create(String className) {
        try {
            if (!(null == className || "".equals(className))) {
                Class clazz = Class.forName(className);
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
