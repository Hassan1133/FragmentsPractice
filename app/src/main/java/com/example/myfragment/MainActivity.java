package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnOne,btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        loadFragment(new FragmentOne());

    }

    void init()
    {
        btnOne = findViewById(R.id.one_btn);
        btnTwo = findViewById(R.id.two_btn);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.one_btn:
                loadFragment(new FragmentOne());
                break;
            case R.id.two_btn:
                loadFragment(new FragmentTwo());
                break;
        }

    }

    private void loadFragment(Fragment fragment)
    {
        if(fragment != null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,fragment).commit();
        }
    }
}