package com.wy.factory.pattern.abs;

public class GreeElectricalEquipmentFactory implements IElectricalEquipmentFactory{

    public IAirConditioner createAirCondition() {
        return new GreeAirConditioner();
    }

    public IFridge createFridge() {
        return new GreeFridge();
    }

}
