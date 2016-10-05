package com.stfalcon.vkclient.utils;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;

import com.stfalcon.vkclient.R;
import com.stfalcon.vkclient.model.City;

import java.util.Locale;

/**
 * Created by troy379 on 05.10.16.
 */

public final class StringFormatter {
    private StringFormatter() {
        throw new AssertionError();
    }

    public static String getFriendsString(Context context, int friendsCount, int mutualCount) {
        String friendsString = context.getResources().getQuantityString(R.plurals.fiends_plurals, friendsCount, friendsCount);
        String mutualString = context.getResources().getString(R.string.mutual);
        return String.format(Locale.getDefault(), "%s • %d %s", friendsString, mutualCount, mutualString);
    }

    public static String getFollowersString(Context context, int followersCount) {
        return context.getResources().getQuantityString(R.plurals.followers_plurals, followersCount, followersCount);
    }

    public static String getCityString(Context context, City city) {
        return String.format("%s: %s",
                context.getResources().getString(R.string.city),
                city.getName());
    }

    public static CharSequence getPhotosTitle(Context context, int photosCount) {
        String title = context.getResources().getString(R.string.photos);

        SpannableStringBuilder builder = new SpannableStringBuilder(
                String.format(Locale.getDefault(), "%s  %d", title, photosCount));
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(
                context.getResources().getColor(android.R.color.black));

        builder.setSpan(colorSpan, 0, title.length(), Spannable.SPAN_INCLUSIVE_INCLUSIVE);

        return builder;
    }
}
