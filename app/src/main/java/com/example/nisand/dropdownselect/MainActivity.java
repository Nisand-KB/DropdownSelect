package com.example.nisand.dropdownselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private static final String[] paths = {"item 1", "item 2", "item 3"};
    String selecttext=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selecttext = spinner.getItemAtPosition(i).toString();
                switch (i) {

                    case 0:
                        // Whatever you want to happen when the first item gets selected
                        Toast.makeText(getApplicationContext(),selecttext,Toast.LENGTH_LONG).show();

                        break;
                    case 1:
                        Toast.makeText(getApplicationContext(),selecttext,Toast.LENGTH_LONG).show();
                        // Whatever you want to happen when the second item gets selected
                        break;
                    case 2:
                        Toast.makeText(getApplicationContext(),selecttext,Toast.LENGTH_LONG).show();
                        // Whatever you want to happen when the thrid item gets selected
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
