package Entidades;

public class Relogio{

    private int _minuto;
    private int _segundo;
    private int _hora;

    public Relogio(){
    }

    public void configuraHorario(int segundo, int minuto, int hora){
        _segundo = segundo;
        _minuto = minuto;
        _hora = hora;
    }

    public void configuraHorario(int minuto, int hora){
        _minuto = minuto;
        _hora = hora;
    }

    @Override
    public String toString(){
        return "Horário no relógio: " + _hora + ":" +  _minuto + ":"+ _segundo;
    }
}