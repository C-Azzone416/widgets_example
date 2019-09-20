package com.ualr.widgets.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ualr.widgets.R;
import com.ualr.widgets.model.Contact;

/**
 * Created by irconde on 2019-09-17.
 */
public class ContactInfoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);
        Intent intent = getIntent();
        Contact contactInfo = intent.getParcelableExtra(ContactFormActivity.PARCELABLE_NAME);
        if (contactInfo == null) return;
//        TextView name = findViewById(R.id.nameTV);
//        name.setText(contactInfo.getName());
//        TextView phone = findViewById(R.id.phoneTV);
//        phone.setText(contactInfo.getPhone());
//        TextView email = findViewById(R.id.mailTV);
//        email.setText(contactInfo.getEmail());
//        TextView pet = findViewById(R.id.petTV);
//        pet.setText(contactInfo.getPet());
//        TextView notes = findViewById(R.id.notesTV);
//        notes.setText(contactInfo.getNotes());
    }
}
