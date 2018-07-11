package com.GWTApp.ui.utilities;

import com.google.gwt.user.client.ui.IsWidget;
import gwt.material.design.client.ui.MaterialButton;

import java.util.HashMap;
import java.util.Map;

public class DataHelper {

    public static Map<String, IsWidget> getArrayValueMap(){
        Map<String, IsWidget> map = new HashMap<>();
        map.put("Обычный массив", new MaterialButton("Обычный массив"));
        map.put("Сортированный массив", new MaterialButton("Сортированный массив"));
        return map;
    }

    public static Map<String, IsWidget> getListValueMap(){
        Map<String, IsWidget> map = new HashMap<>();
        map.put("Связанный список", new MaterialButton("Связанный список"));
        map.put("Двусторонний список", new MaterialButton("Двусторонний список"));
        map.put("Двусвязный список", new MaterialButton("Двусвязный список"));
        map.put("Итераторы", new MaterialButton("Итераторы"));
        return map;
    }

    public static Map<String, IsWidget> getStackValueMap(){
        Map<String, IsWidget> map = new HashMap<>();
        map.put("Стэк на базе массива", new MaterialButton("Стэк на базе массива"));
        map.put("Стэк на базе списка", new MaterialButton("Стэк на базе списка"));
        map.put("Примеры на интересных задачах", new MaterialButton("Примеры на интересных задачах"));
        return map;
    }

    public static Map<String, IsWidget> getQueueValueMap(){
        Map<String, IsWidget> map = new HashMap<>();
        map.put("Очереди на базе массива", new MaterialButton("Очереди на базе массива"));
        map.put("Очереди на базе списка", new MaterialButton("Очереди на базе списка"));
        map.put("Приоритетные очереди", new MaterialButton("Приоритетные очереди"));
        map.put("Примеры на интересных задачах", new MaterialButton("Примеры на интересных задачах"));
        return map;
    }

    public static Map<String, IsWidget> getGpaphValueMap() {
        Map<String, IsWidget> map = new HashMap<>();
        map.put("Общие сведения", new MaterialButton("Общие сведения"));
        map.put("Возвышенные граффы", new MaterialButton("Возвышенные граффы"));
        map.put("Сортировки графа", new MaterialButton("Сортировки графа"));
        map.put("Примеры на интересных задачах", new MaterialButton("Примеры на интересных задачах"));
        return map;
    }

    public static Map<String, IsWidget> getTreeValueMap(){
        Map<String, IsWidget> map = new HashMap<>();
        map.put("Двоичные деревья", new MaterialButton("Двоичные деревья"));
        map.put("Красно-черные деревья", new MaterialButton("Красно-черные деревья"));
        map.put("2-3-4 деревья, 2-3 деревья и В-деревья", new MaterialButton("2-3-4 деревья, 2-3 деревья и В-деревья"));
        map.put("Примеры на интересных задачах", new MaterialButton("Примеры на интересных задачах"));
        return map;
    }

    public static Map<String, IsWidget> getHashTableValueMap() {
        Map<String, IsWidget> map = new HashMap<>();
        map.put("Общие сведения", new MaterialButton("Общие сведения"));
        map.put("Примеры на интересных задачах", new MaterialButton("Примеры на интересных задачах"));
        return map;
    }

    public static Map<String, IsWidget> getSortValueMap() {
        Map<String, IsWidget> map = new HashMap<>();
        map.put("Пузырьковая сортировка", new MaterialButton("Пузырьковая сортировка"));
        map.put("Сортировка методом выбора", new MaterialButton("Сортировка методом выбора"));
        map.put("Сортировка методом вставки", new MaterialButton("Сортировка методом вставки"));
        map.put("Сортировка слиянием", new MaterialButton("Сортировка слиянием"));
        map.put("Сортировка методом Шелла", new MaterialButton("Сортировка методом Шелла"));
        map.put("Быстрая сортирвка", new MaterialButton("Быстрая сортирвка"));
        return map;
    }
    public static Map<String, IsWidget> getRecursValueMap() {
        Map<String, IsWidget> map = new HashMap<>();
        map.put("Общие сведения", new MaterialButton("Общие сведения"));
        map.put("Примеры на интересных задачах", new MaterialButton("Примеры на интересных задачах"));
        return map;
    }

}
