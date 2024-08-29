package org.example;

public class CentralDeServicos {

    private static CentralDeServicos instancia = new CentralDeServicos();

    private CentralDeServicos() {}

    public static CentralDeServicos getInstancia() {
        return instancia;
    }

    public String receberElogioEquipeDeSuporte(String mensagem) {
        return "A Central de Serviços agradece seu contato.\n" +
                "A Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeDeSuporte.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoEquipeDeSuporte(String mensagem) {
        return "A Central de Serviços agradece seu contato.\n" +
                "A Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeDeSuporte.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoEquipeDeSuporte(String mensagem) {
        return "A Central de Serviços agradece seu contato.\n" +
                "A Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeDeSuporte.getInstancia().receberSugestao(mensagem);
    }
}

