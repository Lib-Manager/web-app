package libmanager.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Loan {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "userId")
    private User userId;

    @OneToOne
    @JoinColumn(name = "userProduct")
    private Product userProduct;

    @Column(name = "startingDate")
    private Date startingDate;

    @Column(name = "endingDate")
    private Date endingDate;
}

