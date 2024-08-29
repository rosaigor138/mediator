package org.example;

public class Pessoa {

    public String elogiarEquipeDeSuporte(String mensagem) {
        return CentralDeServicos.getInstancia().receberElogioEquipeDeSuporte(mensagem);
    }

    public String reclamarEquipeDeSuporte(String mensagem) {
        return CentralDeServicos.getInstancia().receberReclamacaoEquipeDeSuporte(mensagem);
    }

    public String sugerirEquipeDeSuporte(String mensagem) {
        return CentralDeServicos.getInstancia().receberSugestaoEquipeDeSuporte(mensagem);
    }
}

