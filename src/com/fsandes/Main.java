package com.fsandes;

import java.util.ArrayList;
import java.util.List;

import com.fsandes.enums.Cor;
import com.fsandes.exceptions.LadoNegativo;
import com.fsandes.vo.AnalistaQualidade;
import com.fsandes.vo.AndroidBotaoSair;
import com.fsandes.vo.Assalariado;
import com.fsandes.vo.CargoDeConfianca;
import com.fsandes.vo.Estagiario;
import com.fsandes.vo.Evento;
import com.fsandes.vo.FormaGeometrica;
import com.fsandes.vo.Funcionario;
import com.fsandes.vo.Gerente;
import com.fsandes.vo.Programador;
import com.fsandes.vo.Tela;
import com.fsandes.vo.quadrados.Quadrado;
import com.fsandes.vo.Triangulo;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //linux - quero saber se clicou no botão sair.
        Tela.acao(new Evento() {
            @Override
            public void clicar() {

                System.out.println("Saindo da aplicação");
                //código de sair
            }

            @Override
            public void arrastar() {

                System.out.println("arrastou");

            }
        });

        Thread.sleep(2000);

        //android - sair do app
        Tela.acao(new AndroidBotaoSair());

        //android - logar o usuário no app
    }
















    public static void aula3_1() throws LadoNegativo {
        aula3_2();
    }

    public static void aula3_2() throws LadoNegativo {
        aula3_3();
    }

    public static void aula3_3() throws LadoNegativo {
        Quadrado quadrado = new Quadrado(Cor.GREEN,-2d);
        System.out.println("fazer o quê amigo.");
    }




    public static void aula3()   {

        Double a = 0d/0d;
        System.out.println("divisão é : " + a);
        //1.00000000000000000000000000000000000000000000000000000000000000000000000000000000000000 / 0.000000000

//        try {
//            aula3_1();
//        } catch (LadoNegativo ladoNegativo) {
//            ladoNegativo.printStackTrace();
//            System.out.println("faz nada não.");
//        }
        //lado == 0
        //lado == -1
        //lado == 2


    }

    public static void aula2_2() {
        //dado RGB eu quero escolher, sem usar if qual é a cor passada;

        Cor corPassada = Cor.BLUE;
        System.out.println(Cor.BLUE.ordinal());
        System.out.println(Cor.BLUE.name());
        System.out.println(Cor.valueOf("MAGENTA").hexadecimal);

    }

    public static void traduzaONomeDaCor(Cor cor) {
            String hex = cor.hexadecimal;
        switch (cor) {
            case RED -> {

            }
            case GREEN -> {
            }
            case BLUE -> {
            }
        }

    }

    public static void aula2() {
        //TODO - criar uma lista com todos os funcionarios
        //TODO - criar uma lista com todos assalariados
        // TODO - imprimir o salário dinâmicamente.

        List<Funcionario> listaFuncionarios = new ArrayList<>();
        List<Assalariado> listaAssalariado = new ArrayList<>();
        List<CargoDeConfianca> listaCargoDeConfianca = new ArrayList<>();

        Gerente gerente = new Gerente();
        listaCargoDeConfianca.add(gerente);
        listaFuncionarios.add(gerente);

        Estagiario estagiario = new Estagiario();
        listaFuncionarios.add(estagiario);

        AnalistaQualidade analista = new AnalistaQualidade();
        listaFuncionarios.add(analista);
        listaAssalariado.add(analista);
//        listaCargoDeConfianca.add(analista);

        Programador programador = new Programador();
        listaFuncionarios.add(programador);
        listaAssalariado.add(programador);

        listaFuncionarios.get(0).trabalha();
    }

    public static void aula1() {

        Quadrado quadrado = null;
        try {
            quadrado = new Quadrado(Cor.RED,5d);
        } catch (LadoNegativo ladoNegativo) {
            ladoNegativo.printStackTrace();
        }
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
