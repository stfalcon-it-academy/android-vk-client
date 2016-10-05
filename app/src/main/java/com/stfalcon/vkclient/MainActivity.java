package com.stfalcon.vkclient;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by troy379 on 30.09.16.
 */

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private Button button;
    private LinearLayout layout;
    private String text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.button = (Button) findViewById(R.id.button);
        this.layout = (LinearLayout) findViewById(R.id.layout);
        this.button.setOnClickListener(this);

        Button button = new Button(this);
        button.setText("Generated button");

        layout.addView(button);

        this.text = getString(R.string.button_text);
        getResources().getColor(R.color.colorAccent);

        addRelativeLayout();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Toast.makeText(this, text, Toast.LENGTH_SHORT)
                        .show();
                break;
        }
    }

    @SuppressWarnings("all")
    private void addRelativeLayout() {
        EditText editText = new EditText(this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        params.addRule(RelativeLayout.LEFT_OF, 1001);

        editText.setLayoutParams(params);
        editText.setHint("Test hint");

        Button button = new Button(this);
        RelativeLayout.LayoutParams params2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        params2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        button.setLayoutParams(params2);
        button.setText("Click me!");
        button.setId(1001);

        RelativeLayout layout = new RelativeLayout(this);
        layout.setLayoutParams(new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT));
        layout.addView(editText);
        layout.addView(button);

        this.layout.addView(layout);
    }
}
