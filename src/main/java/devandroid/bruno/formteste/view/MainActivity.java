package devandroid.bruno.formteste.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import devandroid.bruno.formteste.R;
import devandroid.bruno.formteste.controller.Controller;
import devandroid.bruno.formteste.controller.CursoController;
import devandroid.bruno.formteste.model.Classe;
import devandroid.bruno.formteste.model.CursoDesejado;

public class MainActivity extends AppCompatActivity {

    Controller controller;
    CursoController cursoController;
    List<String> nomeCurso;
    Classe objeto;
    EditText editNome;
    EditText editSobrenome;
    EditText editEndereco;
    EditText editEmail;
    EditText editSenha;
    EditText editCandidatura;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new Controller(MainActivity.this);
        controller.toString();

        objeto = new Classe();
        controller.buscar(objeto);

        editNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editEndereco = findViewById(R.id.editEndereco);
        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);
        editCandidatura = findViewById(R.id.editCurso);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);
        spinner = findViewById(R.id.spinner);

        cursoController = new CursoController();
        nomeCurso = cursoController.dadosParaSpinner();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                cursoController.dadosParaSpinner());

        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);


        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editSobrenome.setText("");
                editEndereco.setText("");
                editEmail.setText("");
                editSenha.setText("");
                editCandidatura.setText("");

                controller.limpar();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                objeto.setPrimeiroNome(editNome.getText().toString());
                objeto.setSobreNome(editSobrenome.getText().toString());
                objeto.setClienteEndereco(editEndereco.getText().toString());
                objeto.setClienteEmail(editEmail.getText().toString());
                objeto.setClienteSenha(editSenha.getText().toString());
                objeto.setClienteCandidatura(editCandidatura.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo!"+objeto.toString(), Toast.LENGTH_SHORT).show();
                controller.salvar(objeto);
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Finalizado!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        Log.i("POOAndroid", "FormTESTE"+objeto.toString());
    }
}