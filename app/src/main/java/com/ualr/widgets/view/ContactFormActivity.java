package com.ualr.widgets.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.checkbox.MaterialCheckBox;
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
        //TODO 20: We want to know which is the current checked option within the MaterialButtonToggleGroup
        //TODO 21: Get the id of the current checked button
        //TODO 22: Get information about the corresponding checked button. For example, the text
        //TODO 25. MaterialCheckbox. Detect state change
        //TODO 29. RadioGroup. Get the currently checked button in RadioGroup
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings_action:
                // TODO 08: Let's validate password in order to see how errors look like in TextInputLayout
                goToActivity(FakeSettingsActivity.class);
                break;
            case R.id.images_action:
                goToActivity(ImagesActivity.class);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void goToActivity(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }

    // TODO 08: Let's validate password in order to see how errors look like in TextInputLayout
    // TODO 25. MaterialCheckbox. Detect state change

}
