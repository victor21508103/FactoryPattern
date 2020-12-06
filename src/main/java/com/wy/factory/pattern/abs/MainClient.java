package com.wy.factory.pattern.abs;

public class MainClient {

    public static void main(String[] args) {
        IElectricalEquipmentFactory haierFactory = new HaierElectricalEquipmentFactory();
        haierFactory.createAirCondition().cooling();
        haierFactory.createFridge().storage();
    }

}
