import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "residente")
@EqualsAndHashCode(exclude = "residente")

public class Domicilio {
    private String calle;
    private int numero;
    // Asignar el residente después de la creación
    private Persona residente;

    public Domicilio(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }
}
