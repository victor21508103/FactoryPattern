package com.wy.factory.pattern.abs;

public class HaierElectricalEquipmentFactory implements IElectricalEquipmentFactory{

    public IAirConditioner createAirCondition() {
        return new HaierAirConditioner();
    }

    public IFridge createFridge() {
        return new HaierFridge();
    }

}
