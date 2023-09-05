

public class Circulo {
    private float raio;
    private float pi = (float) 3.14159;
    private float area;
    private float circunferencia;

    public Circulo(float raio){
        this.raio = raio;
    }

    public float getRaio(){
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getArea(){
        return this.area = (float) pi * raio * raio;
    }

    public float getCircunferencia(){
        return this.circunferencia = (float) pi * (2 * raio);
    }
}
