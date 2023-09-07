public class Linha {
    private Ponto inicio;
    private Ponto fim;

    public Linha(Ponto inicio, Ponto fim){
        this.fim = fim;
        this.inicio = inicio;
    }

    public Ponto getInicio() {
        return inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public double getComprimento(){
        return Math.sqrt(Math.pow(fim.getX() - inicio.getX(), 2) + Math.pow(fim.getY() - inicio.getY(), 2));
    }
}
