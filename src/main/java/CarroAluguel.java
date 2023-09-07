
public class CarroAluguel {
    private float valorPorKm;
    private int distanciaPercorrida;
    private boolean disponivel = true;
    private boolean sinistro = false;
    private float debito = 0;

    public CarroAluguel(float valorPorKm) {
        this.valorPorKm = valorPorKm;
    }

    public void setValorPorKm(float valor) {
        this.valorPorKm = valor;
    }

    public float getValorPorKm() {
        return this.valorPorKm;
    }

    public void setDistanciaPercorrida(int distancia) {
        this.distanciaPercorrida = distancia;
    }

    public float getDistanciaPercorrida() {
        return this.distanciaPercorrida;
    }

    public void alugar() throws CarroIndisponivelException {
        if (!this.disponivel) {
            throw new CarroIndisponivelException("O carro está indisponível.");
        }
        this.disponivel = false;
    }

    public void devolver() throws CarroDisponivelException, CarroNaoPagoException {
        if (this.disponivel) {
            throw new CarroDisponivelException("O carro está disponível.");
        }
        if (this.debito > 0) {
            throw new CarroNaoPagoException("O carro não foi pago.");
        }
        this.disponivel = true;
        this.sinistro = false;
        this.distanciaPercorrida = 0;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public boolean hasSinistro() {
        return this.sinistro;
    }

    public boolean setSinistro(boolean sinistro) {
        return this.sinistro = sinistro;
    }

    public float getDebito() {
        float totalDebito = this.valorPorKm * this.distanciaPercorrida;
        if (this.sinistro) {
            totalDebito += totalDebito * 0.6f;
            this.sinistro = false;
        }
        return totalDebito - debito;
    }

    public void pagar() throws CarroDisponivelException {
        if (this.disponivel) {
            throw new CarroDisponivelException("O carro está disponível.");
        }
        this.debito = 0;
    }
}
