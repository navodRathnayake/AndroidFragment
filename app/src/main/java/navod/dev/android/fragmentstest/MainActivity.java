package navod.dev.android.fragmentstest;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner spinner;
    Button submit;
    String choice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        submit = findViewById(R.id.btnSubmit);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.myData, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        choice = adapterView.getItemAtPosition(i).toString();
//        Toast.makeText(getApplicationContext(),choice,Toast.LENGTH_LONG).show();
        String [] shapes = {"select ", "rect","squre" , "circle"};
        String selected = shapes[i];
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(selected.equals("rect")){
            rectangle rect = new rectangle();
            fragmentTransaction.replace(R.id.myView,rect);
        }
        else if(selected.equals("squre")){
            square squre = new square();
            fragmentTransaction.replace(R.id.myView,squre);
        }
        else if(selected.equals("circle")){
            circle circle = new circle();
            fragmentTransaction.replace(R.id.myView,circle);
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}