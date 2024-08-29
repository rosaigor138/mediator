package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveElogiarEquipeDeSuporte() {
        Funcionario funcionario = new Funcionario();
        assertEquals("A Central de Serviços agradece seu contato.\nA Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Equipe de Suporte agradece a mensagem: Ótimo suporte técnico",
                funcionario.elogiarEquipeDeSuporte("Ótimo suporte técnico"));
    }

    @Test
    void deveReclamarEquipeDeSuporte() {
        Funcionario funcionario = new Funcionario();
        assertEquals("A Central de Serviços agradece seu contato.\nA Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Equipe de Suporte vai procurar melhorar o serviço: Demora na resposta",
                funcionario.reclamarEquipeDeSuporte("Demora na resposta"));
    }

    @Test
    void deveSugerirEquipeDeSuporte() {
        Funcionario funcionario = new Funcionario();
        assertEquals("A Central de Serviços agradece seu contato.\nA Equipe de Suporte respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Equipe de Suporte vai analisar a sugestão: Melhorar atendimento",
                funcionario.sugerirEquipeDeSuporte("Melhorar atendimento"));
    }
}
