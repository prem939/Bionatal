package com.example.bionatal.Activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.example.bionatal.CustomDialog;
import com.example.bionatal.Preference;
import com.example.bionatal.R;

public abstract class BaseActivity extends FragmentActivity {
    public LayoutInflater inflater;
    public LinearLayout llBody, llheader, llheader2;
    public CustomDialog customDialog;
    public Preference preference;
    //    DatabaseHelper databaseHelper;
    public ImageView imgAdd;
    public TextView txtCancel, txtSave,txt_head;
    private String camera_imagepath = "";
    public static final int MY_PERMISSIONS_REQUEST_CAMERA = 100;
    public static final String ALLOW_KEY = "ALLOWED";
    public static final String CAMERA_PREF = "camera_pref";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.base);
        preference = new Preference(getApplicationContext());
        inflater = this.getLayoutInflater();
//        databaseHelper = new DatabaseHelper(getApplicationContext());
        initilization();
        initialize();

    }

    private void initilization() {
        llBody = findViewById(R.id.llBody);
        llheader = findViewById(R.id.llheader);
//        imgAdd = findViewById(R.id.imgAdd);
        llheader2 = findViewById(R.id.llheader2);
        txtCancel = findViewById(R.id.txtCancel);
        txtSave = findViewById(R.id.txtSave);
        txt_head = findViewById(R.id.txt_head);

    }

    public abstract void initialize();
}
