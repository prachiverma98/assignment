package com.prachi.verma.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.prachi.verma.assignment1.R;

public class MainActivity extends Activity {

    TextView stringTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        stringTextView = (TextView)findViewById(R.id.textView2);



        //Initializing string array list;
        List<String> stringData = new ArrayList<String>();


        //Dynamically adding values to integer array list.


        //Dynamically adding values to string array list.

        stringData.add("ANDROID");
        stringData.add("JAVA");
        stringData.add("PYTHON");
        stringData.add("KOTLIN");
        stringData.add("BIG DATA");
        stringData.add("JAVASCRIPT");
        stringData.add("PHP");





        //Printing string array list values on screen.

        for(int i=0; i < stringData.size(); i++){

            stringTextView.setText(stringTextView.getText() + stringData.get(i) + " , ");
        }

    }

}