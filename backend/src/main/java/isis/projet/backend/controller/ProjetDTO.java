package isis.projet.backend.controller;

import isis.projet.backend.controller.ParticipationDTO;
import lombok.Data;
import java.util.List;

@Data
public class ProjetDTO {
    private Integer id;
    private String nom;
    private String debut;
    private String fin;
    private String status;
    private List<ParticipationDTO> participations;
}
