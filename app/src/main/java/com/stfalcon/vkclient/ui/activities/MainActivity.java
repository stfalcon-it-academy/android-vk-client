package com.stfalcon.vkclient.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.stfalcon.vkclient.R;
import com.stfalcon.vkclient.model.User;
import com.stfalcon.vkclient.utils.AppUtils;
import com.stfalcon.vkclient.utils.Fixtures;
import com.stfalcon.vkclient.utils.StringFormatter;

/**
 * Created by troy379 on 30.09.16.
 */

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private ImageView ivAvatar;
    private TextView tvFullName, tvOnlineStatus;
    private TextView tvFriendsInfo, tvFollowersInfo, tvCityInfo, tvFullInfo, tvPhotosTitle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivAvatar = (ImageView)findViewById(R.id.ivAvatar);
        tvFullName = (TextView)findViewById(R.id.tvFullName);
        tvOnlineStatus = (TextView)findViewById(R.id.tvOnlineStatus);

        tvFriendsInfo = (TextView)findViewById(R.id.tvFriendsInfo);
        tvFollowersInfo = (TextView)findViewById(R.id.tvFollowersInfo);
        tvCityInfo = (TextView)findViewById(R.id.tvCityInfo);
        tvFullInfo = (TextView)findViewById(R.id.tvFullInfo);
        tvPhotosTitle = (TextView)findViewById(R.id.tvPhotosTitle);

        initToolbar();

        initUser();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_gift:
                return true;
            case R.id.action_demo:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initUser() {
        User user = Fixtures.getUser();

        AppUtils.loadImage(ivAvatar, user.getAvatar());
        tvFullName.setText(user.getFullName());
        tvOnlineStatus.setText(user.isOnline() ? getString(R.string.online) : getString(R.string.offline));

        tvFriendsInfo.setText(
                StringFormatter.getFriendsString(this, user.getFriendsCount(), user.getMutualFriendsCount()));

        tvFollowersInfo.setText(
                StringFormatter.getFollowersString(this, user.getFollowersCount()));

        tvCityInfo.setText(StringFormatter.getCityString(this, user.getCity()));

        tvPhotosTitle.setText(StringFormatter.getPhotosTitle(this, user.getPhotos().size()));
    }
}
