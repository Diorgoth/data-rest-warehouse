package com.example.demo.repository;

import com.example.demo.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

    Optional<AttachmentContent> findAttachmentContentByAttachmentId(Integer attachment_id);

}
