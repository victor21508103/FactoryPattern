package com.wy.factory.pattern.abs;

public interface IElectricalEquipmentFactory {

    IAirConditioner createAirCondition();

    IFridge createFridge();

}

