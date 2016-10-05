package com.stfalcon.vkclient.ui.custom;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by troy379 on 05.10.16.
 */
public class StatusBarSpace extends RelativeLayout {
    public StatusBarSpace(Context context) {
        super(context);
    }

    public StatusBarSpace(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public StatusBarSpace(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        init();
    }

    private void init() {
        ViewGroup.LayoutParams params = getLayoutParams();
        params.height = getStatusBarHeight(getContext());
        setLayoutParams(params);
    }

    private int getStatusBarHeight(Context context) {
        int statusbarHeight = 0;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (resourceId > 0)
                statusbarHeight = context.getResources().getDimensionPixelSize(resourceId);
        }
        return statusbarHeight;
    }
}
