package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> selection=new ArrayList<String>();
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.txtFinalResult);
        textView.setEnabled(false);

    }

    public void SelectItem(View view) {

        boolean checked=((CheckBox)view).isChecked();
        switch (view.getId()){


            case R.id.fruit_apple:
                if(checked){
                    selection.add("Apple");
                }
                else {
                    selection.remove("Apple");
                }

             break;

            case R.id.fruit_orange:
                if(checked){
                    selection.add("Orange");
                }
                else {
                    selection.remove("Orange");
                }

                break;

            case R.id.fruit_lemon:
                if(checked){
                    selection.add("Lemon");
                }
                else {
                    selection.remove("Lemon");
                }

                break;
        }

    }

    public void finalSelection(View view) {

        String final_fruit_selection="";

        for(String s : selection){
            final_fruit_selection+=s +"\n";
            textView.setText(final_fruit_selection);
            textView.setEnabled(true);
        }

    }
}
