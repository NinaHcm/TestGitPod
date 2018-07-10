package com.GWTApp.ui;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialNavBar;
import gwt.material.design.client.ui.MaterialNavBrand;

/**
 * <br/><i>N.Nikitina on 22.06.2018.</i>
 */
public class AlgorithmsToolBar implements IsWidget {

    private MaterialNavBar navBar;

    /**
     * Конструктор
     */
    public AlgorithmsToolBar() {
        navBar = new MaterialNavBar();
        MaterialNavBrand brand = new MaterialNavBrand("Алгоритмы и структуры данных Java");
        brand.setFontSize("2.2em");
        brand.setPaddingLeft(60);
        navBar.setActivates("menuOpen");
        navBar.add(brand);

    }

    @Override
    public Widget asWidget() {
        return navBar;
    }
}
