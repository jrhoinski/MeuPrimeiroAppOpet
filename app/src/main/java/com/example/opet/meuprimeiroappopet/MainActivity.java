package com.example.opet.meuprimeiroappopet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
    }

    public void clique(View view){
        String texto = editText.getText().toString();
        if(view.getId() == R.id.btnClique){
            Toast.makeText(this, texto, Toast.LENGTH_LONG).show();
        }else if(view.getId() == R.id.btnClique2){
            int numero = Integer.parseInt(texto);
            int result = numero * numero;
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
            editText.setText(String.valueOf(result));
        }
    }
}
