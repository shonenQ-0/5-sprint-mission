package com.sprint.mission.discodeit.entity;


import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BinaryContent implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private UUID id;
    private Instant createdAt;

    private String fileName;
    private String contentType; // jpg png ... 확장자
    private byte[] bytes;
    private Long size;

    public BinaryContent(String fileName, String contentType, byte[] bytes, Long size) {
        this.id = UUID.randomUUID();
        this.createdAt = Instant.now();
        this.fileName = fileName;
        this.contentType = contentType;
        this.bytes = bytes;
        this.size = size;
    }
}
