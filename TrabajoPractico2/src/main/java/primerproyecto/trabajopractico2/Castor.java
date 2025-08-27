package primerproyecto.trabajopractico2;

public class Castor {

    protected double longitudCola;
    protected int velocidadNado;

    public Castor(double longitudCola, int velocidadNado) {
        this.longitudCola = longitudCola;
        this.velocidadNado = velocidadNado;
    }

    public double getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public int getVelocidadNado() {
        return velocidadNado;
    }

    public void setVelocidadNado(int velocidadNado) {
        this.velocidadNado = velocidadNado;
    }

    public void tocarGuitarra() {
        System.out.println("Esta a punto de tocar la guitarra");
        for (int i = 0; i < 3; i++) {
            int numeroDeCuerda = (int) (Math.random() * 6) + 1;
            System.out.println("Esta tocando la cuerda " + numeroDeCuerda);
        }
    }

    public void nadar() {
        System.out.println("Esta nadando a " + this.velocidadNado + " km/h");
    }
}
