package com.example.litepal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button create=(Button)findViewById(R.id.creat);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LitePal.getDatabase();
                Toast.makeText(MainActivity.this,"create succeed",Toast.LENGTH_SHORT).show();
            }
        });
        Button add=(Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Book book=new Book();
                book.setName("The Da Vinci Code");
                book.setAuthor("Dan");
                book.setPages(500);
                book.setPrice(19.99);
                book.save();
                Toast.makeText(MainActivity.this,"add succeed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
