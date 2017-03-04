public class Acceso
{
    private int ano;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    private String ip;
    private String url;
    private int codigo;
    
    public Acceso(String datos)
    {
        String[] lineaLeida = datos.split(" ");
        
        String primercorchete = "";
        String segundocorchete = "";
        
        this.ip = lineaLeida[0];
        primercorchete = lineaLeida[1].substring(1,5);
        this.ano = Integer.parseInt(primercorchete);
        this.mes = Integer.parseInt(lineaLeida[2]);
        this.dia = Integer.parseInt(lineaLeida[3]);
        this.hora = Integer.parseInt(lineaLeida[4]);
        segundocorchete = lineaLeida[5].substring(0,2);
        this.minutos = Integer.parseInt(segundocorchete);
        this.url = lineaLeida[6];
        this.codigo = Integer.parseInt(lineaLeida[7]);
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