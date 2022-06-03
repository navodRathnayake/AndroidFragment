package navod.dev.android.fragmentstest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class circle extends Fragment {

    EditText redius;
    EditText txtarea;
    Button circleButton;

    public circle() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_circle, container, false);

        redius = view.findViewById(R.id.txtradius);
        txtarea = view.findViewById(R.id.txtArea);
        circleButton = view.findViewById(R.id.btnCircleSubmit);

        circleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double radius = Double.parseDouble(redius.getText().toString());
                double area = radius *radius * 3.14;
                txtarea.setText(""+area);
            }
        });

        return view;
    }
}