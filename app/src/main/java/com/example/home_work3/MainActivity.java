package com.example.home_work3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ContactsAdapter contactsAdapter;
    private List<Contact> contactList;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        contactList = new ArrayList<>();
        contactList.add(new Contact("Sigma", "+1 234 567 890", "Hello! How are you my little Sigma?", R.drawable.contact1));
        contactList.add(new Contact("Satoru Gojo", "+1 987 654 321", "Hollow Purple", R.drawable.contact2));
        contactList.add(new Contact("Gigachad", "+1 555 678 123", "GO TO GYM BRO!", R.drawable.contact3));
        contactList.add(new Contact("Cristiano Ronaldo", "+1 777 111 222", "I'm a real GOAT!", R.drawable.contact4));
        contactList.add(new Contact("Арбуз", "+1 888 999 000", "Привет, я Арбуз:)XD!", R.drawable.contact5));

        contactsAdapter = new ContactsAdapter(this, contactList);
        recyclerView.setAdapter(contactsAdapter);
    }
}
