package com.codebox.coachmark.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

public class Util {

    public static int getScreenWidth(Context context) {
        Display display = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();

        int screenWidth = 0;
        if (hasHoneycombMR2()) {
            Point size = new Point();
            display.getSize(size);
            screenWidth = size.x;
        } else {
            screenWidth = display.getWidth();
        }

        return screenWidth;
    }

    public static int getScreenHeight(Context context) {
        Display display = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int screenHeight = 0;
        if (hasHoneycombMR2()) {
            Point size = new Point();
            display.getSize(size);
            screenHeight = size.y;
        } else {
            screenHeight = display.getHeight();
        }

        return screenHeight;
    }

    private static  boolean hasHoneycombMR2() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2;
    }
}
