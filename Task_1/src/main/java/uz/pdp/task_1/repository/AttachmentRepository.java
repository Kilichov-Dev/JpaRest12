package uz.pdp.task_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.task_1.entity.Attachments;

public interface AttachmentRepository extends JpaRepository<Attachments,Integer> {
}
