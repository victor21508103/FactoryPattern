package com.wy.factory.pattern.method;

//如果工厂里面每个对象的创建逻辑不一样，那么工厂的职责会越来越多，不便于维护。
public interface ICourseFactory {

    ICourse create();

}
