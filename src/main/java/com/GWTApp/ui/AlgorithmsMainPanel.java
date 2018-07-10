package com.GWTApp.ui;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import gwt.material.design.client.ui.MaterialContainer;

/**
 * <br/><i>N.Nikitina on 22.06.2018.</i>
 */
public class AlgorithmsMainPanel implements IsWidget {

    private MaterialContainer body;

    /**
     * Конструктор
     */
    public AlgorithmsMainPanel() {
        AlgorithmsToolBar toolBar = new AlgorithmsToolBar();

        body = new MaterialContainer();
        body.add(toolBar);
        body.add(new AlgorithmsNavPushMenu());
    }

    @Override
    public Widget asWidget() {
        return body;
    }
}
