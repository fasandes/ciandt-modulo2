package com.fsandes;

import com.fsandes.enums.Cor;
import com.fsandes.vo.Figura;

public class Main {

    public static void main(String[] args) {

        Figura figuraA = new Figura(Cor.BLUE);

        System.out.println(figuraA.getCor());
        //TODO - Criar método para área
        //TODO - Criar método para perímetro
        //TODO - Instanciar todas as figuras em um vetor, e imprimir, para cada item, cor, área e perimetro.
        //TODO - Criar uma "estrutura" para novas figuras.
    }
}
