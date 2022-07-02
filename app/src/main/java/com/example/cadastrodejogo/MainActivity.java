package com.example.cadastrodejogo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText nome,idade;
    private RadioButton masculino, feminino;
    private TextView resultadoNome, resultadoIdade, resultadoSexo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.editNome);
        idade = findViewById(R.id.editIdade);
        masculino = findViewById(R.id.radioButtonMasculino);
        feminino = findViewById(R.id.radioButtonFeminino);
        resultadoNome = findViewById(R.id.resultadoNome);
        resultadoIdade = findViewById(R.id.resultadoIdade);
        resultadoSexo = findViewById(R.id.resultadoSexo);
        Button botaoCadastrar = findViewById(R.id.bt_Cadastrar);

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editNome = nome.getText().toString();
                String editIdade = idade.getText().toString();

                if (editNome.isEmpty() || editIdade.isEmpty()) {
                    Snackbar.make(v,"Preencha o nome e a idade", Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }
}