package com.GWTApp.ui.input;

import com.GWTApp.ui.ThemeManager;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.addins.client.combobox.MaterialComboBox;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.TextAlign;
import gwt.material.design.themes.blue.ThemeBlue;
import gwt.material.design.themes.brown.ThemeBrown;
import gwt.material.design.themes.client.ThemeLoader;
import gwt.material.design.themes.green.ThemeGreen;
import gwt.material.design.themes.grey.ThemeGrey;
import gwt.material.design.themes.orange.ThemeOrange;
import gwt.material.design.themes.pink.ThemePink;
import gwt.material.design.themes.purple.ThemePurple;
import gwt.material.design.themes.red.ThemeRed;
import gwt.material.design.themes.yellow.ThemeYellow;

public class ThemeInput implements IsWidget {
    private MaterialComboBox<ThemeLoader.ThemeBundle> box;

    public ThemeInput (){
        box = new MaterialComboBox<>();
        box.setLabel("Выбор темы");
        box.setHideSearch(true);
        box.setFloat(Style.Float.RIGHT);
        box.setMarginRight(30);
        box.setWidth("130px");
        box.setTextColor(Color.WHITE);
        box.setTextAlign(TextAlign.CENTER);
        setData();
        box.addValueChangeHandler(handler -> ThemeManager.loadTheme(handler.getValue().get(0)));
    }

    private void setData(){
        box.addItem("Синяя", ThemePurple.INSTANCE);
        box.addItem( "Зеленая", ThemeGreen.INSTANCE);
        box.addItem("Синяя", ThemeBlue.INSTANCE);
        box.addItem( "Желтая", ThemeYellow.INSTANCE);
        box.addItem( "Оранжевая", ThemeOrange.INSTANCE);
        box.addItem("Розовая", ThemePink.INSTANCE);
        box.addItem("Красная", ThemeRed.INSTANCE);
        box.addItem( "Серая", ThemeGrey.INSTANCE);
        box.addItem( "Коричневая", ThemeBrown.INSTANCE);
    }

    @Override
    public Widget asWidget() {
        return box;
    }
}
