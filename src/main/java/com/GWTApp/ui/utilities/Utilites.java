package com.GWTApp.ui.utilities;

import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialLink;

public class Utilites {

    public static MaterialLink createLink(String text, IconType iconType) {
        MaterialLink button = new MaterialLink(text);
        button.setIconType(iconType);
        return button;
    }
}
