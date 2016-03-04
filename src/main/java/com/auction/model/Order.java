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

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    private User seller;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @Temporal(TemporalType.DATE)
    @Column
    private Date date;

    @Column
    private Integer status;
}
