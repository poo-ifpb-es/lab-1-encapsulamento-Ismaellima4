public class RelogioDigital {
    private int hora;
    private int minuto;

    public RelogioDigital(){
        this.hora = 12;
        this.minuto = 20;
    }

    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public void setMinuto(int minuto){
        this.minuto = minuto;
    }

    public int tick(){
        if(this.minuto == 59 && this.hora != 23){
            this.hora += 1;
            return this.minuto = 0;
        }

        else if(this.hora == 23 && this.minuto == 59){
            this.hora = 0;
            return this.minuto = 0;
        }

        return this.minuto += 1;
    }
}
