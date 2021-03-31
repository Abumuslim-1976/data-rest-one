package uz.pdp.datarestone.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.datarestone.entity.AttachmentContent;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

    Optional<AttachmentContent> findByAttachmentId(Integer attachment_id);
    void deleteByAttachmentId(Integer attachment_id);
}
