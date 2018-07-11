package com.GWTApp.ui;

import com.google.gwt.user.client.Cookies;
import gwt.material.design.client.base.MaterialWidget;
import gwt.material.design.client.constants.Color;
import gwt.material.design.client.ui.MaterialToast;
import gwt.material.design.themes.amber.ThemeAmber;
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

import java.util.Date;

public class ThemeManager {

    final static String COLOR = "color";

    static java.util.HashMap<MaterialWidget, Integer> map = new java.util.HashMap<>();

    public static final int REGULAR_SHADE = 0;
    public static final int DARKER_SHADE = 1;
    public static final int LIGHTER_SHADE = 2;
    public static final int SO_LIGHTER_SHADE = 3;
    public static ThemeLoader.ThemeBundle currentTheme = ThemePurple.INSTANCE;

    public static void setColor(Color color, Color darkerColor, Color lighterColor, Color soLighter) {
        final long DURATION = 1000 * 60 * 60 * 24 * 14; //duration remembering login - 2 weeks
        Date expires = new Date(System.currentTimeMillis() + DURATION);
        Cookies.setCookie(COLOR, color.getCssName(), expires, null, "/", false);

        for (MaterialWidget w : map.keySet()) {
            switch (map.get(w)) {
                case REGULAR_SHADE:
                    w.setBackgroundColor(color);
                    break;
                case DARKER_SHADE:
                    w.setBackgroundColor(darkerColor);
                    break;
                case LIGHTER_SHADE:
                    w.setBackgroundColor(lighterColor);
                    break;
                case SO_LIGHTER_SHADE:
                    w.setBackgroundColor(soLighter);
                    break;
                default:
                    break;
            }
        }
    }

    public static void loadTheme(ThemeLoader.ThemeBundle themeBundle) {
        currentTheme = themeBundle;
        ThemeLoader.loadAsync(themeBundle, new ThemeLoader.ThemeAsyncCallback() {
            @Override
            public void onSuccess(int resourceCount) {
                if (themeBundle == ThemeAmber.INSTANCE) {
                    setColor(Color.AMBER, Color.AMBER_DARKEN_3, Color.AMBER_LIGHTEN_2, Color.AMBER_LIGHTEN_5);
                } else if (themeBundle == ThemeBlue.INSTANCE) {
                    setColor(Color.BLUE, Color.BLUE_DARKEN_3, Color.BLUE_LIGHTEN_2, Color.BLUE_LIGHTEN_5);
                } else if (themeBundle == ThemeBrown.INSTANCE) {
                    setColor(Color.BROWN, Color.BROWN_DARKEN_3, Color.BROWN_LIGHTEN_2, Color.BROWN_LIGHTEN_5);
                } else if (themeBundle == ThemeGreen.INSTANCE) {
                    setColor(Color.GREEN, Color.GREEN_DARKEN_3, Color.GREEN_LIGHTEN_2, Color.GREEN_LIGHTEN_5);
                } else if (themeBundle == ThemeGrey.INSTANCE) {
                    setColor(Color.GREY, Color.GREY_DARKEN_3, Color.GREY_LIGHTEN_2, Color.GREY_LIGHTEN_5);
                } else if (themeBundle == ThemeOrange.INSTANCE) {
                    setColor(Color.ORANGE, Color.ORANGE_DARKEN_3, Color.ORANGE_LIGHTEN_2, Color.ORANGE_LIGHTEN_5);
                } else if (themeBundle == ThemePink.INSTANCE) {
                    setColor(Color.PINK, Color.PINK_DARKEN_3, Color.PINK_LIGHTEN_2, Color.PINK_LIGHTEN_5);
                } else if (themeBundle == ThemePurple.INSTANCE) {
                    setColor(Color.PURPLE, Color.PURPLE_DARKEN_3, Color.PURPLE_LIGHTEN_2, Color.PURPLE_LIGHTEN_5);
                } else if (themeBundle == ThemeRed.INSTANCE) {
                    setColor(Color.RED, Color.RED_DARKEN_3, Color.RED_LIGHTEN_2, Color.RED_LIGHTEN_5);
                } else if (themeBundle == ThemeYellow.INSTANCE) {
                    setColor(Color.YELLOW, Color.YELLOW_DARKEN_3, Color.YELLOW_LIGHTEN_2, Color.YELLOW_LIGHTEN_5);
                }
            }

            @Override
            public void onFailure(Throwable reason) {
                MaterialToast.fireToast(reason.getMessage());
            }
        });
    }

    public static void initialize() {
        loadTheme(currentTheme);
    }

    public static void register(MaterialWidget widget) {
        register(widget, REGULAR_SHADE);
    }

    public static void register(MaterialWidget widget, int shade) {
        if (!map.containsKey(widget)) {
            map.put(widget, shade);
        }
        initialize();
    }
}
