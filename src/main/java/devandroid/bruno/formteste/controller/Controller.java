package devandroid.bruno.formteste.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.bruno.formteste.model.Classe;
import devandroid.bruno.formteste.view.MainActivity;

public class Controller {

    SharedPreferences preferences;
    SharedPreferences.Editor formTeste;
    public static final String NOME_PREFERENCES = "FormTeste";
    public Controller(MainActivity mainActivity) {
        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        formTeste = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("Controller-MVC", "Controller iniciada...");
        return super.toString();
    }

    public Classe buscar(Classe objeto) {
        objeto.setPrimeiroNome(preferences.getString("primeiroNome", "NA"));
        objeto.setSobreNome(preferences.getString("sobreNome", "NA"));
        objeto.setClienteEndereco(preferences.getString("clienteEndereco", "NA"));
        objeto.setClienteEmail(preferences.getString("clienteEmail", "NA"));
        objeto.setClienteSenha(preferences.getString("clienteSenha", "NA"));
        objeto.setClienteCandidatura(preferences.getString("clienteCandidatura", "NA"));
        return(objeto);
    }

    public void salvar(Classe objeto) {
        Log.d("Controller-MVC", "Salvo!" + objeto.toString());

        formTeste.putString("primeiroNome",objeto.getPrimeiroNome());
        formTeste.putString("sobreNome",objeto.getSobreNome());
        formTeste.putString("clienteEndereco",objeto.getClienteEndereco());
        formTeste.putString("clienteEmail",objeto.getClienteEmail());
        formTeste.putString("clienteSenha",objeto.getClienteSenha());
        formTeste.putString("clienteCandidatura",objeto.getClienteCandidatura());
        formTeste.apply();
    }

    public void limpar() {
        formTeste.clear();
        formTeste.apply();
    }
}
