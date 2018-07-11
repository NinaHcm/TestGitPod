package com.GWTApp.ui.input;

import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.ui.MaterialListValueBox;

import java.util.List;

public class Inputs {

    /**
     * Создать поле с выпадающим списком
     *
     * @param holder label для поля
     * @param data   список значений
     * @return поле
     */
    public static MaterialListValueBox<String> createInputSelect(String holder, List<String> data) {
        MaterialListValueBox<String> box = new MaterialListValueBox<>();
        box.setPlaceholder(holder);
        data.forEach(box::addItem);
        return box;
    }

    /**
     * Создать поле с выпадающим списком
     * @return поле
     */
    public static MaterialComboBox<String> createCityRoleSelect() {
        MaterialComboBox<String> box = new MaterialComboBox<>();
        box.setLabel("Роль города");
        box.setHideSearch(true);
        box.addItem("Погрузка");
        box.addItem("Выгрузка");
        box.addItem( "Транзит");
        return box;
    }
    /**
     * Создать поле с выпадающим списком
     * @return поле
     */
    public static MaterialComboBox<String> createLoadTypeSelect() {
        MaterialComboBox<String> box = new MaterialComboBox<>();
        //box.setPlaceholder(holder);
        box.setLabel("Тип загрузки");
        box.setHideSearch(true);
        box.addItem("Задняя");
        box.addItem("Передняя");
        box.addItem("Смешанная");
        return box;
    }

    public static MaterialComboBox<String> createInputSelect2(String holder, List<String> data) {
        MaterialComboBox<String> box = new MaterialComboBox<>();
        //box.setPlaceholder(holder);
        box.setLabel(holder);
        box.setHideSearch(true);
        data.forEach(box::addItem);
        return box;
    }
}
