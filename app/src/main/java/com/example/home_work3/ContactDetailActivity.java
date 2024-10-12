package com.example.home_work3;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ContactDetailActivity extends AppCompatActivity {

    private ImageView contactImage;
    private TextView contactName;
    private TextView contactMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_detail);

        contactImage = findViewById(R.id.contact_image);
        contactName = findViewById(R.id.contact_name);
        contactMessage = findViewById(R.id.contact_message);

        Intent intent = getIntent();
        String name = intent.getStringExtra("contact_name");
        String message = intent.getStringExtra("contact_message");
        int imageResId = intent.getIntExtra("contact_image", R.drawable.ic_launcher_background);

        contactName.setText(name);
        contactMessage.setText(message);
        contactImage.setImageResource(imageResId);
    }
}
