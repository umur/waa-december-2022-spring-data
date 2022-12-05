package w1d3.app01.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import w1d3.app01.entity.AuditFields;

import java.time.LocalDateTime;


@Getter
@Setter
public class AuditFieldsDto {
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
}
