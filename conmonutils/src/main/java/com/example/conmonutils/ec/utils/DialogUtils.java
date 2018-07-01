package com.example.conmonutils.ec.utils;

import android.support.annotation.StyleRes;

import com.example.conmonutils.ec.R;


/**
 * Created by LiuGuoDong on 2017/8/29
 *
 * @author LiuGuoDong
 */

public class DialogUtils {

    private static int mStyle = R.style.EasyDialogStyle;

    private static int mListStyle = R.style.EasyListDialogStyle;

    public static void initStyle(@StyleRes int style) {
        mStyle = style;
    }

    public static void initListStyle(@StyleRes int style) {
        mListStyle = style;
    }

    public static int getStyle() {
        return mStyle;
    }

    public static int getListStyle() {
        return mListStyle;
    }

}
