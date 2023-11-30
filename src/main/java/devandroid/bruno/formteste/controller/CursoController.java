package devandroid.bruno.formteste.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.bruno.formteste.model.CursoDesejado;

public class CursoController {

    private List<CursoDesejado> listaCursos;

    public List<CursoDesejado> getListaCursos(){
        listaCursos = new ArrayList<CursoDesejado>();

        listaCursos.add(new CursoDesejado("Java"));
        listaCursos.add(new CursoDesejado("HTML/CSS"));
        listaCursos.add(new CursoDesejado("PHP"));
        listaCursos.add(new CursoDesejado("Dart"));
        listaCursos.add(new CursoDesejado("Flutter"));
        listaCursos.add(new CursoDesejado("Swift"));
        listaCursos.add(new CursoDesejado("JavaScript"));
        listaCursos.add(new CursoDesejado("C"));
        listaCursos.add(new CursoDesejado("C++"));
        listaCursos.add(new CursoDesejado("C#"));

        return listaCursos;
    }

    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaCursos().size(); i++) {

            CursoDesejado objeto = (CursoDesejado) getListaCursos().get(i);
            dados.add(objeto.getNomeCurso());

        }

        return dados;

    }
}
