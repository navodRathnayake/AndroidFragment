package navod.dev.android.fragmentstest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class square extends Fragment {

    EditText txtHeight;
    Button squreSubmit;
    EditText txtarea;

    public square() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_square, container, false);

        txtHeight = view.findViewById(R.id.txtSqureHeight);
        squreSubmit = view.findViewById(R.id.txtSqureSubmit);
        txtarea = view.findViewById(R.id.txtSqureArea);

        squreSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double height = Double.parseDouble(txtHeight.getText().toString());
                double area = height*height;
                txtarea.setText(""+area);
            }
        });

        return view;
    }
}