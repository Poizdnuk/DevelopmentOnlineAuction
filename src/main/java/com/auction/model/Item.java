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

    @Column(name = "seller", length = 12)
    private Integer user_id;

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

    @OneToMany(mappedBy = "item_id")
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}
