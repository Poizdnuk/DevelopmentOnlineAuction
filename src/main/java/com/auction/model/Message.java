package com.auction.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="message")
public class Message {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long id;

    @Column(name = "topic", length = 55)
    private String topic;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User from;

    @ManyToOne
    @JoinColumn(name = "user", nullable = false)
    private User to;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    @Temporal(TemporalType.DATE)
    @Column(name  = "date")
    private Date date;

    @Column (name  = "seen")
    private boolean seen;

    public Message() {
    }
}
