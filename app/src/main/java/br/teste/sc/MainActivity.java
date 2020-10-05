package br.teste.sc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnMostrar(View v){
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);
        Toast.makeText(MainActivity.this, editText.getText() + " " + editText2.getText(), Toast.LENGTH_LONG). show();
    }

    public void onClickBtnLimpar(View v){
        EditText editText = findViewById(R.id.et_texto);
        EditText editText2 = findViewById(R.id.et_texto2);
        editText.setText("");
        editText2.setText("");
    }

}