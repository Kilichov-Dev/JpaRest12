package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task_1.entity.AttachmentContent;

import java.util.Optional;
//@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",excerptProjection = CustomAttachment.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
    Optional<AttachmentContent> findByAttachmentsId(Integer attachments_id);
    Optional<AttachmentContent> findAttachmentContentByAttachmentsId(Integer attachments_id);
    void deleteAllByAttachments_Id(Integer attachments_id);
}
