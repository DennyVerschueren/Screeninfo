package be.thomasmore.screeninfo.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

@Entity
public class VerificationToken {

    @SequenceGenerator(name = "UserSeqGen", sequenceName = "UserSeq", initialValue = 5, allocationSize = 1)
    @GeneratedValue(generator = "UserSeqGen")
    @Id
    private Integer id;

    private String token;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;


}
