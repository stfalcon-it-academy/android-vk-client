package com.stfalcon.vkclient.ui;

import android.support.v7.widget.GridLayoutManager;

/**
 * Created by troy379 on 07.10.16.
 */

public class CurvedSpanLookup extends GridLayoutManager.SpanSizeLookup {

    @Override
    public int getSpanSize(int position) {
        return (3 - position % 3);
    }

}