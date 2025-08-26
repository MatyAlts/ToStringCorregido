public class Main {
    public static void main(String[] args) {

        Domicilio miCasa = Domicilio.builder()
                .calle("Calle falsa")
                .numero(123)
                .build();
        Persona yo = Persona.builder()
                .nombre("Juan")
                .edad(30)
                .domicilio(miCasa)
                .build();
        miCasa.setResidente(yo);
        System.out.println(yo);

    }
}