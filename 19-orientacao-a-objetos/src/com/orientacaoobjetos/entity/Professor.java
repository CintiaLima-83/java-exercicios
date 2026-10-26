package com.orientacaoobjetos.entity;

public class Professor { //-> classe


        public String escola;
        public String nome;
        public String materia;
        public int idade;


        //comportamentos -> métodos
        public void lecionarMateria() {

            System.out.println("O professor " + nome + " finalizou a materia " + materia + " na escola " + escola);

            //algoritmo que realiza o que se propoe para a descricao desse metodo
        }

        public void finalizarMateria() {

            System.out.println("O professor " + nome + " está dando a materia " + materia + " na escola" + escola);

        }

        @Override
        public String toString(){

            return "\nNome: " + nome + "\nEscola: " + escola + "\nmateria: " + materia + "\nidade: " + idade;
        }

      }

