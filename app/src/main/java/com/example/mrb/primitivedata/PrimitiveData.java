package com.example.mrb.primitivedata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class PrimitiveData extends AppCompatActivity {

    private byte bytOurVariable;

    private EditText edtxtValueForVar;
    private TextView txtvwOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primitive_data);

        edtxtValueForVar = (EditText) findViewById(R.id.edtxtValueForVar);
        txtvwOutput = (TextView) findViewById(R.id.txtvwOutput);
    }

    public void storeVariable(View vw)
    {
        try
        {
            bytOurVariable = Byte.parseByte(edtxtValueForVar.getText().toString());
        }
        catch(NumberFormatException nfeError)
        {
            edtxtValueForVar.setText("");
            txtvwOutput.setText(R.string.strPleaseEnterValidValue);
        }
    }

    public void retrieveVariable(View vw)
    {
        txtvwOutput.setText(Byte.toString(bytOurVariable));
    }
}
