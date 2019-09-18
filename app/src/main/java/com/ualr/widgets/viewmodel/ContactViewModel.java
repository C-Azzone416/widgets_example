package com.ualr.widgets.viewmodel;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;

import com.ualr.widgets.model.Contact;

/**
 * Created by irconde on 2019-09-17.
 */
public class ContactViewModel {

    private Contact model;

    // TODO 19. Define observable fields in order to get values from the view
    public ObservableField<String> name = new ObservableField<>();
    public ObservableField<String> phone = new ObservableField<>();
    public ObservableField<String> email = new ObservableField<>();
    public ObservableField<String> pet = new ObservableField<>();
    public ObservableField<String> notes = new ObservableField<>();


    // TODO 18. EditText. Disable when CheckedTextView is not checked.
    //  We use an Observable boolean
    public ObservableBoolean petEnabled = new ObservableBoolean();

    public ContactViewModel() {
        model = new Contact();
    }

    public Contact getContactInfo() {
        model.setName(name.get());
        model.setEmail(email.get());
        model.setPhone(phone.get());
        model.setPet(pet.get());
        model.setNotes(notes.get());
        return model;
    }

}
