import com.orientacaoobjetos.entity.Professor;

public class OrientacaoAObjetos {
    public static void main(String[] args) {


        Professor professor1 = new Professor();
        professor1.nome = "Carlos";
        professor1.escola = "EBAC";
        professor1.idade = 35;
        professor1.materia = "react";


        Professor professor2 = new Professor();
        professor2.nome = "Bruno";
        professor2.escola = "EBAC";
        professor2.idade = 23;
        professor2.materia = "react";

        System.out.println(professor1);
        System.out.println(professor2);


        System.out.println();

        professor1.lecionarMateria();
        professor2.lecionarMateria();

    }
}
