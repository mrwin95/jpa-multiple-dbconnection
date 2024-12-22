package win.ddd.jpa.entity.platform;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "TBL_REPORT_SETTINGS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReportSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String status;
    private String destination;
    private String transferMode;
    private String operationKey;
    private String operationMode;
    private String setFrequency;
    private Date updatedAt;

}
