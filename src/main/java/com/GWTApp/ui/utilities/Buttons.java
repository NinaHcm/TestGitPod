package com.GWTApp.ui.utilities;

import com.GWTApp.ui.ThemeManager;
import com.google.gwt.event.dom.client.ClickHandler;
import gwt.material.design.client.constants.ButtonType;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.ui.MaterialButton;

/**
 * <br/><i>N.Nikitina on 22.06.2018.</i>
 */
public class Buttons {

    /**
     * Создать стандартную кнопку типа FLAT
     *
     * @param text     текст кнопки
     * @param handler  обработчик нажатия
     * @return кнопка
     */
    public static MaterialButton createFlatDefaultButton(String text, ClickHandler handler) {
        MaterialButton button = createButton(text, handler);
        button.setType(ButtonType.FLAT);
        return button;
    }

    /**
     * Создать стандартную кнопку типа RAISED
     *
     * @param text     текст кнопки
     * @param iconType тип иконки для кнопки
     * @param handler  обработчик нажатия
     * @return кнопка
     */
    public static MaterialButton createRaisedDefaultButton(String text, IconType iconType, ClickHandler handler) {
        MaterialButton button = createButton(text, handler);
        button.setType(ButtonType.RAISED);
        return button;
    }

    /**
     * Создать стандартную кнопку типа FLOATING без текста
     *
     * @param handler  обработчик нажатия
     * @return кнопка
     */
    public static MaterialButton createFloatingDefaultButton(ClickHandler handler) {
        MaterialButton button = createButton("", handler);
        button.setType(ButtonType.FLOATING);
        return button;
    }

    /**
     * Создать стандартную кнопку типа LINK
     *
     * @param text     текст кнопки
     * @param handler  обработчик нажатия
     * @return кнопка
     */
    public static MaterialButton createLinkDefaultButton(String text, ClickHandler handler) {
        MaterialButton button = createButton(text, handler);
        button.setType(ButtonType.LINK);
        return button;
    }

    /**
     * Общаяя кнопка
     *
     * @param text     текст кнопки
     * @param handler  обработчик нажатия
     * @return кнопка
     */
    public static MaterialButton createButton(String text, ClickHandler handler) {
        MaterialButton button = new MaterialButton();
        ThemeManager.register(button, ThemeManager.LIGHTER_SHADE);
        if (text != null) button.setText(text);
        button.addClickHandler(handler);
        return button;
    }
}
