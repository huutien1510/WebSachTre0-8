package ute.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Book book;
    @ManyToOne
    @JoinColumn(name = "fk_account")
    private Account account;
    @Column
    private Float star;
    @Column(columnDefinition = "date")
    private Date date_rate;

}