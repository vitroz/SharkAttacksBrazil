package labML.etc;

import labML.Instancia.Ataque;
import weka.classifiers.bayes.NaiveBayes;


public class Printer {
    
    public void printChanceSobrevivencia(Ataque ataque, NaiveBayes nb) throws Exception{
        
        //previsao da pessoa acima gastar muito/pouco
        double probabilidade[] = nb.distributionForInstance(ataque.getInstance());
        
        System.out.println("Ataques de Tubarao no Brasil - DataSet ");
        System.out.println("=======================================");
        System.out.println("Chances de sobrevivencia de ataque caso: ");
        System.out.println("-");
        System.out.println("Tipo de ocorrencia: "+ataque.getTipoOcorrencia());
        System.out.println("Ocorrido no estado: "+ataque.getEstado());
        System.out.println("Atividade: "+ataque.getAtividade());
        System.out.println("Sexo da vitima: "+ataque.getSexoVitima());
        
        System.out.println("------------------------------------");
        
        System.out.println("Sobreviver: "+ (int) Math.ceil((1 - probabilidade[1]) * 100)+ "%"); 
        System.out.println("Nao Sobreviver: "+ (int) Math.ceil((1 - probabilidade[0]) * 100)+ "%");  
        
    }

}
