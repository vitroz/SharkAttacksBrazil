package labML.Instancia;

import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;


public class Ataque{
    
    private Instance instance;
    
    public void setInstance(Instance ins, Instances dtset){
        this.instance = new DenseInstance(5);
        this.instance.setDataset(dtset);        
    } 
    
    public void setAtaque(String tipo, String estado, String atividade, String sexo){
       this.instance.setValue(0, tipo);
       this.instance.setValue(1, estado);
       this.instance.setValue(2, atividade);
       this.instance.setValue(3, sexo);
    }
    
    public void setTipoAtaque(String tipo){
        this.instance.setValue(0, tipo);
    }
    
    public void setEstado(String estado){
        this.instance.setValue(1, estado);
    }

    public void setAtividade(String atividade){
        this.instance.setValue(2, atividade);
    }
    
    public void setSexo(String sexo){
        this.instance.setValue(3, sexo);
    }
    
    public Instance getInstance(){
        return this.instance;
    }
    
    public String getTipoOcorrencia(){
        return this.instance.toString(0);
    }
    
    public String getEstado(){
        return this.instance.toString(1);
    }
    
    public String getAtividade(){
        return this.instance.toString(2);
    }
    
    public String getSexoVitima(){
        return this.instance.toString(3);
    }
    

}
