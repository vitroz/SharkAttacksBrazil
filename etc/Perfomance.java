package labML.etc;

import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instances;


public class Perfomance {
    
    public void avaliarPerfomance(Instances ins, Classifier nb) throws Exception{
        
        Evaluation evaluation = new Evaluation(ins);
        evaluation.evaluateModel(nb, ins);
        
        String result = evaluation.toSummaryString();
        System.out.println("Result (toSummaryString):\n" + result);
        
        String confusionMatrix = evaluation.toMatrixString();
        System.out.println("Result (toMatrixString):\n" + confusionMatrix);

        String accuracy = evaluation.toClassDetailsString();
        System.out.println("Result (toClassDetailsString):\n" + accuracy);
        
    }

}
