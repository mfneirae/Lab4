package com.example.MyContact;

import android.app.Application;
import com.example.MyContact.data.Contact;

import java.util.ArrayList;

/**
 * Created by fcecursos on 23/06/2015.
 */
public class MyContacts extends Application {
    public ArrayList<Contact> myContacts;

    public MyContacts(){ myContacts = new ArrayList<Contact>();}

    public Contact searchContactByName(String name){
        Contact myContact = null;
        for (Contact contact : myContacts){
            if(contact.getName()==name){
                myContact = contact;
                break;
            }
        }
        return myContact;
    }
}
