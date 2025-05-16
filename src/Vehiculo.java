class Vehiculo {

    int velocidad;

    void acelerar(int incremento) {
        this.velocidad =+ incremento;
        System.out.println("Vehiculo acelerando." + velocidad);
    }
}