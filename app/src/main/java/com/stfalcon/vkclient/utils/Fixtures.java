package com.stfalcon.vkclient.utils;

import com.stfalcon.vkclient.model.City;
import com.stfalcon.vkclient.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troy379 on 05.10.16.
 */

public final class Fixtures {
    private Fixtures() {
        throw new AssertionError();
    }

    private static final String USER_FIRST_NAME = "Elvis";
    private static final String USER_LAST_NAME = "Presley";
    private static final String USER_AVATAR = "http://www.livestory.com.ua/images/elvis-presli-3.jpg";
    private static final int USER_FRIENDS_COUNT = 512;
    private static final int USER_MUTUAL_FRIENDS = 53;
    private static final int USER_FOLLOWERS = 82746;
    private static final boolean USER_IS_ONLINE = false;
    private static final String USER_CITY = "Kalamazoo";

    public static User getUser() {
        return new User(
                USER_FIRST_NAME,
                USER_LAST_NAME,
                USER_AVATAR,
                USER_FRIENDS_COUNT,
                USER_MUTUAL_FRIENDS,
                USER_FOLLOWERS,
                USER_IS_ONLINE,
                new City(123, USER_CITY),
                getUserPhotos()
        );
    }

    private static List<String> getUserPhotos() {
        ArrayList<String> photos = new ArrayList<>();

        photos.add("http://4.bp.blogspot.com/-5QxupO72ah4/VNpJsMrrsqI/AAAAAAAAMGE/MaLCyx_g-bA/s1600/Elvis_Pink_Cadillac.jpg");
        photos.add("https://s-media-cache-ak0.pinimg.com/originals/3d/e4/5a/3de45ac23bff88da3e7d60967826c239.jpg");
        photos.add("https://s-media-cache-ak0.pinimg.com/564x/31/a2/27/31a2276e160f5069c0b0247d7b2b012d.jpg");
        photos.add("https://24smi.org/public/media/app/public/media/uploads/elvis_presley-1459174.jpg");


        return photos;
    }
}