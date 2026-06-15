package util;

import model.Partida;
import model.Selecao;
import service.Copa;

public class CargaInicial {

    public static void popularCopa(Copa copa) {

        Selecao s1 = new Selecao("Planeta Dev", 'A', "PDV");
        Selecao s2 = new Selecao("Byte Futebol", 'A', "BYT");
        Selecao s3 = new Selecao("Caffeine FC", 'A', "CAF");
        Selecao s4 = new Selecao("Null Pointer", 'A', "NPE");

        Selecao s5 = new Selecao("Git Push", 'B', "GPH");
        Selecao s6 = new Selecao("Stack Overflow", 'B', "STK");
        Selecao s7 = new Selecao("Kernel United", 'B', "KRN");
        Selecao s8 = new Selecao("Binary Stars", 'B', "BIN");

        copa.adicionarSelecao(s1);
        copa.adicionarSelecao(s2);
        copa.adicionarSelecao(s3);
        copa.adicionarSelecao(s4);
        copa.adicionarSelecao(s5);
        copa.adicionarSelecao(s6);
        copa.adicionarSelecao(s7);
        copa.adicionarSelecao(s8);

    }
}