package com.developer.gits.databinding;

import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Sasha Grey on 5/16/2016.
 */
public class Student {
    private final String nim;
    private final String name;
    public ObservableField<String> username = new ObservableField<>();

    public Student(String nim, String name) {
        this.nim = nim;
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.i("xxxx", "onClick: ");
            Toast.makeText(v.getContext(),"NIM Clicked...",Toast.LENGTH_SHORT).show();
        }
    };
}
