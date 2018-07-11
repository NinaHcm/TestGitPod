package com.GWTApp.ui;

import com.GWTApp.ui.utilities.Buttons;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.ui.MaterialPanel;

public class AlgorithmsContent implements IsWidget {
    private MaterialPanel panel;

    public AlgorithmsContent(){
        panel = new MaterialPanel();
        panel.add(Buttons.createLinkDefaultButton("test",  null));
    }

    public void showWidget(IsWidget widget) {

        ThemeManager.register((MaterialWidget) widget, ThemeManager.LIGHTER_SHADE);
        panel.add(widget);
    }

    @Override
    public Widget asWidget() {
        return panel;
    }
}
