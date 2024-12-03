package com.educamarket.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.lang.Integer;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "preferences")
public class preferences {
    @Id
    private Integer userId;

    @Column(name = "dietary_restrictions")
    private String dietaryRestrictions;

    @Column(name = "notifications_enabled")
    private boolean notificationsEnabled;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
}
