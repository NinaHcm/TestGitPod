package com.GWTApp.ui;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialNavBrand;
import gwt.material.design.client.ui.MaterialSideNavPush;

public class AlgorithmsNavPushMenu implements IsWidget {

    private MaterialSideNavPush pushMenu;

    /**
     * Конструктор
     */
    public AlgorithmsNavPushMenu() {
        pushMenu = new MaterialSideNavPush();
        pushMenu.setId("menuOpen");
        pushMenu.setWidth("300");
        pushMenu.setMargin(0);
        MaterialNavBrand brand = new MaterialNavBrand("Menu");
        brand.setFloat(Style.Float.LEFT);
        pushMenu.add(brand);
        MaterialLink button = new MaterialLink("1");
        button.setIconType(IconType.MERGE_TYPE);
        pushMenu.add(button);
        button = new MaterialLink("4");
        button.setIconType(IconType.FACE);
        pushMenu.add(button);
        button = new MaterialLink("2");
        button.setIconType(IconType.HD);
        pushMenu.add(button);
        button = new MaterialLink("3");
        button.setIconType(IconType.DELETE);
        pushMenu.add(button);

    }

    @Override
    public Widget asWidget() {
        return pushMenu;
    }
}