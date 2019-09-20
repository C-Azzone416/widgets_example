package com.ualr.widgets.view;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.ualr.widgets.R;

/**
 * Created by irconde on 2019-09-17.
 */
public class FakeSettingsActivity extends AppCompatActivity {

    public static final String TAG = FakeSettingsActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_settings);
        //TODO 31. SwitchMaterial. We can handle state changes as we did with checkboxes
    }
}
