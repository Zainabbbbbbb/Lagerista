package at.spengergasse.med_px.therapyrooms;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITherapyRepo extends JpaRepository<TherapyEntitie, String> {
}
