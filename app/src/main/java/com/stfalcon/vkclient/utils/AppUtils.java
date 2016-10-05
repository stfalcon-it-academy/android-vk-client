package com.stfalcon.vkclient.utils;

import android.content.Context;
import android.support.annotation.StringRes;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

/**
 * Created by troy379 on 05.10.16.
 */

public final class AppUtils {
    private AppUtils() {
        throw new AssertionError();
    }

    public static void loadImage(ImageView target, String url) {
        Picasso.with(target.getContext()).load(url).into(target);
    }

    public static void showToast(Context context, @StringRes int text, boolean isLong) {
        showToast(context, context.getResources().getString(text), isLong);
    }

    public static void showToast(Context context, String text, boolean isLong) {
        Toast.makeText(context, text, isLong ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT).show();
    }
}
