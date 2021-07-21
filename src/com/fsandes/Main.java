package com.fsandes;

import java.util.ArrayList;
import java.util.List;

import com.fsandes.enums.Cor;
import com.fsandes.vo.FormaGeometrica;
import com.fsandes.vo.Quadrado;
import com.fsandes.vo.Triangulo;

public class Main {
    //TODO - criar uma clase represente um quadrado
    // TODO - criar uma classe que represente um tringulo retangulo
    //TODO - Criar método para área
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(Cor.RED,5d);
        Triangulo triangulo = new Triangulo(Cor.GREEN, 5d, 2d);

        List<FormaGeometrica> formaGeometricaList = new ArrayList<>();
        formaGeometricaList.add(quadrado);
        formaGeometricaList.add(triangulo);

        //TODO - Instanciar todas as figuras em um Lista, e imprimir, para cada item, cor, área e perimetro.

        for (FormaGeometrica formaGeometrica: formaGeometricaList) {
            System.out.println("A Figura é: " + formaGeometrica.getNome());
            System.out.println("A Cor é: " + formaGeometrica.getCor());
            System.out.println("A Area é: " + formaGeometrica.calculaArea());
        }








        //TODO - Criar uma "estrutura" para novas figuras.
        //TODO - Criar método para perímetro
    }
}
