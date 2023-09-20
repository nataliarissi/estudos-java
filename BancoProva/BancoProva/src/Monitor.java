public class Monitor{
    public String NomeMarca;
    public int Polegadas;
    public String Descricao;

    public Monitor(String nomeMarca, int polegadas, String descricao){
        NomeMarca = nomeMarca;
        Polegadas = polegadas;
        Descricao = descricao;
    }

    public String getNomeMarca(){
        return NomeMarca;
    }

    public int getPolegadas(){
        return Polegadas;
    }

    public String getDescricao(){
        return Descricao;
    }

    public void setNomeMarca(String nomeMarca){
        NomeMarca = nomeMarca;
    }
    
    public void setPolegadas(int polegadas){
        Polegadas = polegadas;
    }
    
    public void setDescricao(String descricao){
        Descricao = descricao;
    }

    public String mostrarNome(){
        return "Nome do Monitor é: " + NomeMarca;
    }

    public String mostrarPolegadas(){
        return "Número de Polegadas é: " + Polegadas;
    }

    @Override
    public String toString(){
        return "Nome do Monitior é: " + NomeMarca + ", seu número de polegadas é" + Polegadas + ", sua descrição: " + Descricao;
    }
}