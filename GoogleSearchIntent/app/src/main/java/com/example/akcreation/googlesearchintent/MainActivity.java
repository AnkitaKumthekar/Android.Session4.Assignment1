package com.example.akcreation.googlesearchintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (EditText)findViewById(R.id.et_google_search);
        search=(Button)findViewById(R.id.b_search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value =  text.getText().toString();
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com/search?q=" + value));
                Intent browserChooserIntent = Intent.createChooser(browserIntent , "Choose browser of your choice");
                startActivity(browserChooserIntent );
            }
        });

    }
}
