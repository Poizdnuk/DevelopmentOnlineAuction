package com.auction.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order_item")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bid_id")
    private Bid bid;

    @Temporal(TemporalType.DATE)
    @Column
    private Date date;

    @Column
    private Integer status;
}
