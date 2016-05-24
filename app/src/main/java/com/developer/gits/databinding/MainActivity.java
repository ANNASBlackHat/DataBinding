package com.developer.gits.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.developer.gits.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding =  DataBindingUtil.setContentView(this, R.layout.activity_main);
        student = new Student("13.11.6867","ANNAS BlackHat");
        binding.setMhs(student);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("12.11.6743","Taufik Ibrahim"));
        studentList.add(new Student("12.11.6744","John End Col"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));
        studentList.add(new Student("12.11.6745","Stefani Laurent"));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new StudentAdapter(studentList));

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = /*student.username.get(); */ binding.edtUsername.getText().toString();
                Toast.makeText(MainActivity.this, "USERNAME : "+uname,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
