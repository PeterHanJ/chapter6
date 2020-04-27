package com.smart.editor;

import java.beans.PropertyEditorSupport;

public class CustomCarEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException{
        if(text == null || text.indexOf(",") == -1){
            throw new IllegalArgumentException("Wrong String");
        }
        String[] info = text.split(",");
        Car car = new Car();
        car.setBrand(info[0]);
        car.setColor(info[1]);
        car.setMaxSpeed(Integer.parseInt(info[2]));

        setValue(car);
    }
}
