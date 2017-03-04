public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    
    public Acceso(String fecha)
    {
        String[] lineaLeida = fecha.split(" ");
        
        this.ano = Integer.parseInt(lineaLeida[0]);
        this.mes = Integer.parseInt(lineaLeida[1]);
        this.dia = Integer.parseInt(lineaLeida[2]);
        this.hora = Integer.parseInt(lineaLeida[3]);
        this.minutos = Integer.parseInt(lineaLeida[4]);
    }
    
    public int getAno() 
    {
        return ano;
    }
    
    public int getMes()
    {
        return mes;
    }
    
    public int getDia()
    {
        return dia;
    }
    
    public int getHora()
    {
        return hora;
    }
    
    public int getMinutos()
    {
        return minutos;
    }
}