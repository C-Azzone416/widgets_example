package com.ualr.widgets.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ualr.widgets.R;

public class ContactFormActivity extends AppCompatActivity {

    public static final String PARCELABLE_NAME = "ContactInfo";
    private static final String TAG = ContactFormActivity.class.getSimpleName();
    private static final int PASSWORD_CHARS = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_form);
        //TODO 20: We want to know which is the checked option at any time
        MaterialButtonToggleGroup toggleGroup = findViewById(R.id.contactTypeToggleGroup);
        toggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                if (isChecked) {
                    //TODO 21: Get the id of the current checked button
                    Log.d(TAG, String.format("The new checked element index is: %d", checkedId));
                    // TODO 22: Get information about the corresponding checked button
                    MaterialButton checkedButton = findViewById(checkedId);
                    Log.d(TAG, String.format("The new checked element is: %s", checkedButton.getText().toString()));
                }
            }
        });
        // TODO 25. MaterialCheckbox. Detect state change
        MaterialCheckBox confirmationCheckbox = findViewById(R.id.confirmation_cbx);
        confirmationCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Log.d(TAG, "Conditions have been confirmed!");
                }
            }
        });

        // TODO 29. RadioGroup. Get the currently checked button
        RadioGroup carRadioGroup = findViewById(R.id.cars_radio_group);
        carRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                MaterialRadioButton checkedButton = (MaterialRadioButton) radioGroup.findViewById(i);
                Log.d(TAG, String.format("Option %s has been selected.", checkedButton.getText().toString()));
            }
        });

        // TODO 44. Chips. Get current checked chip
        ChipGroup choiceChipGroup = findViewById(R.id.choice_chip_group);
        choiceChipGroup.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup group, int checkedId) {
                Log.d(TAG, ((Chip)group.findViewById(checkedId)).getText().toString());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.save_action) {
            // TODO 08: Let's validate password in order to see how errors look like in TextInputLayout
            // if (checkPassword()) goToSettings();
            goToSettings();
        }
        return super.onOptionsItemSelected(item);
    }

    private void goToSettings() {
        Intent intent = new Intent(this, FakeSettingsActivity.class);
        startActivity(intent);
    }

    // TODO 08: Let's validate password in order to see how errors look like in TextInputLayout
    private boolean checkPassword() {
        boolean result = true;
        TextInputLayout passwordInput = findViewById(R.id.passwordTextInput);
        TextInputEditText passwordEditText = findViewById(R.id.passwordEditText);
        String password = passwordEditText.getText().toString();
        if (password.length() != PASSWORD_CHARS) {
            passwordInput.setError(getResources().getString(R.string.password_error_msg));
            result = false;
        }
        return result;
    }

    // TODO 40. Chips. Handle click events
    public void onChipClicked(View view) {
        Log.d(TAG, "Action chip clicked");
    }

}
