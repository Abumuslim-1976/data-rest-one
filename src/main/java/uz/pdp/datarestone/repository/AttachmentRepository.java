package uz.pdp.datarestone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.datarestone.entity.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
