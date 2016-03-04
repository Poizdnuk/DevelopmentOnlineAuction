package com.auction.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bid")
public class Bid {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "bid_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn (name = "item_id")
    private Item item_id;

    @Column(name = "price")
    private double price;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    public Bid() {
    }

}
