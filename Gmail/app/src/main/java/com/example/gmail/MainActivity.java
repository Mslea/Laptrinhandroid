package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMail;
    ArrayList<Mail> arrayMail;
    MailAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        adapter = new MailAdapter(this,R.layout.emailstream,arrayMail);
        lvMail.setAdapter(adapter);
    }
    private void Anhxa(){
        lvMail = (ListView) findViewById(R.id.listViewMail);
        arrayMail = new ArrayList<>();
        arrayMail.add(new Mail("Hoang Pham Huy","Lớp nghỉ học sáng thứ 4",R.drawable.ch,"Hi sáng mai mình có việc bận ...","21:59"));
        arrayMail.add(new Mail("Hoang Pham Huy","Lớp nghỉ học sáng thứ 4",R.drawable.ch,"Hi sáng mai mình có việc bận ...","21:59"));
        arrayMail.add(new Mail("Hoang Pham Huy","Lớp nghỉ học sáng thứ 4",R.drawable.ch,"Hi sáng mai mình có việc bận ...","21:59"));
        arrayMail.add(new Mail("Hoang Pham Huy","Lớp nghỉ học sáng thứ 4",R.drawable.ch,"Hi sáng mai mình có việc bận ...","21:59"));
        arrayMail.add(new Mail("Hoang Pham Huy","Lớp nghỉ học sáng thứ 4",R.drawable.ch,"Hi sáng mai mình có việc bận ...","21:59"));
        arrayMail.add(new Mail("Hoang Pham Huy","Lớp nghỉ học sáng thứ 4",R.drawable.ch,"Hi sáng mai mình có việc bận ...","21:59"));
        arrayMail.add(new Mail("Hoang Pham Huy","Lớp nghỉ học sáng thứ 4",R.drawable.ch,"Hi sáng mai mình có việc bận ...","21:59"));


    }
}