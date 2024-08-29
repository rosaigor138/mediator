package org.example;

public class EquipeDeSuporte implements Setor {

    private static EquipeDeSuporte instancia = new EquipeDeSuporte();

    private EquipeDeSuporte() {}

    public static EquipeDeSuporte getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Equipe de Suporte vai procurar melhorar o serviço: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Equipe de Suporte agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Equipe de Suporte vai analisar a sugestão: " + mensagem;
    }
}
