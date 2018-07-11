package com.GWTApp.ui;

import com.GWTApp.ui.utilities.DataHelper;
import com.GWTApp.ui.utilities.Utilites;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.*;

import java.util.Map;

public class AlgorithmsNavPushMenu implements IsWidget {

    private MaterialSideNavPush pushMenu;
    private AlgorithmsContent mainPanel;

    /**
     * Конструктор
     */
    public AlgorithmsNavPushMenu(AlgorithmsContent panel) {
        pushMenu = new MaterialSideNavPush();
        mainPanel = panel;
        pushMenu.setId("menuOpen");
        pushMenu.setWidth("300");
        pushMenu.setMargin(0);
        MaterialNavBrand brand = new MaterialNavBrand("Menu");
        ThemeManager.register(brand, ThemeManager.LIGHTER_SHADE);
        brand.setTextColor(Color.WHITE);
        brand.setPadding(15);
        brand.setPaddingLeft(25);
        brand.setFloat(Style.Float.LEFT);
        pushMenu.add(brand);
        pushMenu.add(this::createMainCollapsibleMenu);
    }

    private MaterialCollapsible createMainCollapsibleMenu(){
        MaterialCollapsible collapsible = new MaterialCollapsible();
        collapsible.add(createMainMenuItem("Массивы", IconType.VIEW_ARRAY, DataHelper.getArrayValueMap()));
        collapsible.add(createMainMenuItem("Списки", IconType.VIEW_ARRAY, DataHelper.getListValueMap()));

        collapsible.add(createMainMenuItem("Стэки", IconType.VIEW_ARRAY, DataHelper.getStackValueMap()));
        collapsible.add(createMainMenuItem("Очереди", IconType.VIEW_ARRAY, DataHelper.getQueueValueMap()));
        collapsible.add(createMainMenuItem("Графы", IconType.VIEW_ARRAY, DataHelper.getGpaphValueMap()));
        collapsible.add(createMainMenuItem("Деревья", IconType.VIEW_ARRAY, DataHelper.getTreeValueMap()));
        collapsible.add(createMainMenuItem("Hash-таблицы", IconType.VIEW_ARRAY, DataHelper.getHashTableValueMap()));
        collapsible.add(createMainMenuItem("Сортировки", IconType.VIEW_ARRAY, DataHelper.getSortValueMap()));
        collapsible.add(createMainMenuItem("Рекирсия", IconType.VIEW_ARRAY, DataHelper.getRecursValueMap()));
        return collapsible;
    }

    private MaterialCollapsibleItem createMainMenuItem(String headerText, IconType headerIcon, Map<String, IsWidget> children){
        MaterialCollapsibleBody body = new MaterialCollapsibleBody();
        body.add(createCollapsible(children));

        MaterialCollapsibleHeader header = new MaterialCollapsibleHeader();
        header.add(Utilites.createLink(headerText, headerIcon));
        ThemeManager.register(header, ThemeManager.SO_LIGHTER_SHADE);

        MaterialCollapsibleItem item = new MaterialCollapsibleItem();
        item.setMarginTop(1);
        item.add(header);
        item.add(body);
        return item;
    }

    private MaterialCollapsible createCollapsible(Map<String, IsWidget> children){
        MaterialCollapsible collapsible = new MaterialCollapsible();

        for(String textKey : children.keySet()){
            MaterialCollapsibleItem childItem = new MaterialCollapsibleItem();

            childItem.addClickHandler(handler -> mainPanel.showWidget(children.get(textKey)));

            MaterialCollapsibleHeader childHeader = new MaterialCollapsibleHeader();
            childHeader.add(Utilites.createLink(textKey, IconType.POLYMER));
            childItem.add(childHeader);
            collapsible.add(childItem);

        }

        return collapsible;
    }

    @Override
    public Widget asWidget() {
        return pushMenu;
    }
}