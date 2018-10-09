package com.drozee.drozeebvest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.editText4)
    EditText editText4;
    @BindView(R.id.imageButton)
    Button imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "Madeleina Sans.otf");
        imageButton.setTypeface(typeface);

    }

    @OnClick(R.id.imageButton)
    public void onViewClicked() {
        startActivity(new Intent(this, PreferencesActivity.class));
    }
}
