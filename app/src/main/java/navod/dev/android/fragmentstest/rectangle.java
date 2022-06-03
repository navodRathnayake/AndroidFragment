package navod.dev.android.fragmentstest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class rectangle extends Fragment {

    EditText txtHeight;
    EditText txtWidth;
    Button rectSubmit;
    EditText txtarea;

    public rectangle() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rectangle, container, false);

        txtHeight = view.findViewById(R.id.txtHeight);
        txtWidth = view.findViewById(R.id.txtWidth);
        rectSubmit = view.findViewById(R.id.btnSubmit);
        txtarea = view.findViewById(R.id.txtArea);

        rectSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double height = Double.parseDouble(txtHeight.getText().toString());
                double width = Double.parseDouble(txtWidth.getText().toString());
                double area = height*width;
                txtarea.setText(""+area);
            }
        });

        return view;
    }
}