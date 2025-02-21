package isis.projet.backend.controller;

import isis.projet.backend.controller.ParticipationDTO;
import lombok.Data;
import java.util.List;

@Data
public class PersonneDTO {
    private Integer matricule;
    private String nom;
    private String prenom;
    private String poste;
    private List<ParticipationDTO> participations;
}
