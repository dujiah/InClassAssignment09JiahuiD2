package com.example.du.inclassassignment09_jiahuid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference personRef = database.getReference("person");
    private DatabaseReference peopleRef = database.getReference("Multiple people");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //onClick
    public void set(View view) {
        personRef.setValue(new Person("Jiahui", 18, false));
    }

    public void add(View view) {
        peopleRef.push().setValue(new Person("Nigel", 20, true));
    }
}
