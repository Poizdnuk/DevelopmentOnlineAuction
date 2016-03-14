package com.auction.model;

import com.sun.istack.internal.NotNull;

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

    @NotNull
    @Column(name = "name", length = 10)
    private String name;

    @NotNull
    @Column(name = "price", length = 10)
    private float price;

    @NotNull
    @Column(name = "low_price", length = 10)
    private float lowPrice;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Column(name = "actual_price", length = 10)
    private float actualPrice;

    @Column(name = "photo")
    private String photo;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "user_id", nullable = false)
    private User seller;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "interval_start", length = 10)
    private Date intervalStart;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "interval_end")
    private Date intervalEnd;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ITEM_WITH_CATEGORIES",
            joinColumns = {@JoinColumn(name = "ITEM_ID")},
            inverseJoinColumns = {@JoinColumn(name = "CATEGORY_ID")})
    private Set<Category> categories = new HashSet<Category>();

    @NotNull
    @Column(name = "status")
    private int status;

    @Column(name = "bidding")
    private int bidding;

    public Item() {
    }


    public float getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(float actualPrice) {
        this.actualPrice = actualPrice;
    }

    public int getBidding() {
        return bidding;
    }

    public void setBidding(int bidding) {
        this.bidding = bidding;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getIntervalEnd() {
        return intervalEnd;
    }

    public void setIntervalEnd(Date intervalEnd) {
        this.intervalEnd = intervalEnd;
    }

    public Date getIntervalStart() {
        return intervalStart;
    }

    public void setIntervalStart(Date intervalStart) {
        this.intervalStart = intervalStart;
    }

    public float getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(float lowPrice) {
        this.lowPrice = lowPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
