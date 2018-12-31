package com.shomali.morteza.new7learn;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageButton btnback = (ImageButton) findViewById(R.id.back_button);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button Editavatar = (Button) findViewById(R.id.Edit_avatar);
        Editavatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this, "ویرایش عکس کلیک شد", Toast.LENGTH_LONG).show();

            }

        });


        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/iran_sans.ttf");

        EditText nameEditText = (EditText) findViewById(R.id.edit_text_firstname);
        nameEditText.setTypeface(typeface);


        EditText lastnameEditText = (EditText) findViewById(R.id.edit_text_lastname);
        lastnameEditText.setTypeface(typeface);

        nameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Toast.makeText(ProfileActivity.this, s.toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {
                ;

            }
        });
        CheckBox javaCheckBox = (CheckBox) findViewById(R.id.JAVA_checkbox);
        CheckBox CssCheckBox = (CheckBox) findViewById(R.id.CSS_checkbox);
        CheckBox HtmlCheckBox = (CheckBox) findViewById(R.id.HTML_checkbox);

        javaCheckBox.setTypeface(typeface);
        CssCheckBox.setTypeface(typeface);
        HtmlCheckBox.setTypeface(typeface);
        javaCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(ProfileActivity.this, String.valueOf(isChecked), Toast.LENGTH_SHORT).show();

            }
        });

        RadioButton maleRadio = (RadioButton) findViewById(R.id.male_radio);
        RadioButton femaleRadio = (RadioButton) findViewById(R.id.female_radio);

        maleRadio.setTypeface(typeface);
        femaleRadio.setTypeface(typeface);
        maleRadio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(ProfileActivity.this, String.valueOf(isChecked), Toast.LENGTH_SHORT).show();
                }
        });
        Button SaveForm=(Button)findViewById(R.id.confirm);
        SaveForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProfileActivity.this,"Edit_avatar is clicked", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
