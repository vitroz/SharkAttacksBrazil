package labML;

import labML.Instancia.Ataque;
import labML.etc.Perfomance;
import labML.etc.Printer;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instances;
import weka.core.Instance;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author vitor
 */
public class LabWeka {

    public static void main(String[] args) throws Exception {
        DataSource ds = new DataSource("src/labML/DataSet/sharkattacks.arff");
        Instances ins = ds.getDataSet();        
        
        // Atributo que define a pergunta (possibilidade de sobrevivencia)
        ins.setClassIndex(4); 
        
        //Usando classificador
        NaiveBayes nb = new NaiveBayes();
        nb.buildClassifier(ins);
        
        Printer printer = new Printer();
        Perfomance pfmc = new Perfomance();
        
        Instance insAtaque = new DenseInstance(5); //Quantidade de atributos
        Ataque ataque = new Ataque();
        ataque.setInstance(insAtaque,ins);
        
        //ATRIBUTOS - ATAQUE
        //@attribute tipo {NaoProvocado, Provocado, Invalido}
        //@attribute estado {SantaCatarina, Pernambuco, RiodeJaneiro, 
        // RioGrandeDoSul, Maranhao, Bahia, Paraiba, RioGrandeDeNorte}
        
        //@attribute atividade {Surfing, Swimming, Fishing, Spearfishing, Bathing, 
        //Wading, Diving, ScubaDiving, Bodyboarding, Boogieboarding, 
        //Windsurfing, Scientificresearch, SeaDisaster}
        
        //@attribute sexo {M, F}
        
        ataque.setAtaque("NaoProvocado", "Pernambuco", "Surfing", "M");
        
        printer.printChanceSobrevivencia(ataque, nb);
        
        //pfmc.avaliarPerfomance(ins, nb);
        
    }
    
}
