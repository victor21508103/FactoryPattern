package com.wy.factory.pattern.simple;

//课程不断丰富的过程中，不需要修改CourseFactory02中的代码了，但是方法参数是字符串，并且还要抢之类型转化
public class CourseFactory03 {

    public static ICourse create(Class<? extends ICourse> clazz) {
        try {
           if(null != clazz){
               return clazz.newInstance();
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
