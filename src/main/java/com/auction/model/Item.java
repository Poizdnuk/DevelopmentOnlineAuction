package com.auction.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id", nullable = false)
    private Long id;

    @Column(name = "name", length = 10)
    private String name;

    @Column(name = "price", length = 10)
    private float price;

    @Column(name = "low_price", length = 10)
    private float lowPrice;

    @Column(name = "actual_price", length = 10)
    private float actualPrice;

    @Column(name = "photo")
    private String photo;

    @Temporal(TemporalType.DATE)
    @Column(name = "interval_start", length = 10)
    private Date intervalStart;

    @Temporal(TemporalType.DATE)
    @Column(name = "interval_end")
    private Date intervalEnd;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ITEM_WITH_CATEGORIES",
            joinColumns = {@JoinColumn(name = "ITEM_ID")},
            inverseJoinColumns = {@JoinColumn(name = "CATEGORY_ID")})
    private Set<Category> categories = new HashSet<Category>();

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    private User user_id;

    @Column(name = "status")
    private int status;

    @Column(name = "bidding")
    private int bidding;

    public Item() {
    }

}
