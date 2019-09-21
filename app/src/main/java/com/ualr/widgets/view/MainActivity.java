package com.ualr.widgets.view;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewManager;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ContextThemeWrapper;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textfield.TextInputEditText;
import com.ualr.widgets.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 13. Chips. Get current checked chip

        // TODO 15. Chips. Input chips. Use text from input to create new chips and add them to chipsgroup
        // TODO 16. Chips. Input chips. We have to capture enter key push event when we are typing
        // We'll use a TextView.OnEditorActionListener. This interface provides the method onEditorAction
        // We can capture key events and use them to trigger some actions.

    }

    // TODO 09. Chips. Handle click events

    // TODO 17. Chips. Entry chips. We have to define a new method in charge of creating and adding a chip to the chipgroup

}
