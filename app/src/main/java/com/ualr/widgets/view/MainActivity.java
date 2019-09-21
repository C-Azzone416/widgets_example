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
        ChipGroup choiceChipGroup = findViewById(R.id.choice_chip_group);
        choiceChipGroup.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                Log.d(TAG, ((Chip)group.findViewById(checkedId)).getText().toString());
            }
        });

        // TODO 15. Chips. Input chips. Use text from input to create new chips and add them to chipsgroup
        // TODO 16. Chips. Input chips. We have to capture enter key push event when we are typing
        // We'll use a TextView.OnEditorActionListener. This interface provides the method onEditorAction
        // We can capture key events and use them to trigger some actions.
        final TextInputEditText hobbiesEditText = findViewById(R.id.hobbies_edit_text);
        final ChipGroup hobbiesChipGroup = findViewById(R.id.hobbies_chip_group);
        hobbiesEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == EditorInfo.IME_NULL) {
                    Log.d(TAG, "You just have pushed Enter");
                    // TODO 17. Input chips. We have to define a new method in charge of creating and adding a chip to the chipgroup
                    addChipToChipGroup(textView.getText().toString(), hobbiesChipGroup);
                    // TODO 21. Chips. Entry chips. Delete text in edittext
                    hobbiesEditText.setText("");
                }
                return false;
            }
        });
    }

    // TODO 09. Chips. Handle click events
    public void onChipClicked(View view) {
        Log.d(TAG, "Action chip clicked");
    }

    // TODO 17. Chips. Entry chips. We have to define a new method in charge of creating and adding a chip to the chipgroup
    private void addChipToChipGroup(String chipText, ChipGroup chipGroup) {
        // TODO 18. Chips. Entry chips. We create the new chip with the provided as input parameter.
        // TODO 19. Chips. Entry chips. In order to apply the style programmatically we have add a resource
        //  attributes file that points at the desired style: attrs_chip_style
        Chip chip = new Chip(MainActivity.this, null, R.attr.EntryChipStyle);
        chip.setText(chipText);
        // TODO 22. Chips. Entry chips. Add the new chip to the chipGroup
        // TODO 23. Chips. Entry chips. We can handle the click on close icon
        chip.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ViewManager)view.getParent()).removeView(view);
            }
        });
        chipGroup.addView(chip);
    }

}
