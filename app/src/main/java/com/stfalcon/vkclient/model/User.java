package com.stfalcon.vkclient.model;

import java.util.List;

/**
 * Created by troy379 on 05.10.16.
 */

public class User {

    private String firstName, lastName, avatar;
    private int friendsCount, mutualFriendsCount, followersCount;
    private boolean isOnline;
    private City city;
    private List<String> photos;

    public User(String firstName, String lastName, String avatar, int friendsCount, int mutualFriendsCount,
                int followersCount, boolean isOnline, City city, List<String> photos) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
        this.friendsCount = friendsCount;
        this.mutualFriendsCount = mutualFriendsCount;
        this.followersCount = followersCount;
        this.isOnline = isOnline;
        this.city = city;
        this.photos = photos;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    public int getMutualFriendsCount() {
        return mutualFriendsCount;
    }

    public void setMutualFriendsCount(int mutualFriendsCount) {
        this.mutualFriendsCount = mutualFriendsCount;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }
}