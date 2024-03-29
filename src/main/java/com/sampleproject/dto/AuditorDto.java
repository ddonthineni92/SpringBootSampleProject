package com.sampleproject.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AuditorDto {
    protected String createdBy;
    protected String modifiedBy;
    protected LocalDateTime createdDate;
    protected LocalDateTime modifiedDate;
}
