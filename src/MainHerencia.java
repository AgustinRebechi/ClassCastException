public class MainHerencia {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];
        vehiculos[0] = new Moto();      // Upcasting implícito
        vehiculos[1] = new Auto();      // Upcasting implícito

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar(130);
            if (vehiculo instanceof Auto) {
                Auto auto = (Auto) vehiculo;        // Error en tiempo de ejecución
                auto.subirVentanas();}
            else if (vehiculo instanceof Moto){
                System.out.println("tenes una moto como vas a subirle las ventanas sos bolu o que");
            }
        }
    }
}
