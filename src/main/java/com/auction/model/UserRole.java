package com.auction.model;

import com.auction.model.listrole.ListRole;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="user_role")
public class UserRole {

    @Id @GeneratedValue(strategy = IDENTITY)
    @Column(name = "user_role_id", unique = true, nullable = false)
    private Long userRoleId;

    @ManyToMany(mappedBy = "userRole")
    private List<User> user;

    @Enumerated(EnumType.STRING)
    private ListRole role;

    public UserRole() {
    }

    public ListRole getRole() {
        return role;
    }

    public void setRole(ListRole role) {
        this.role = role;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public Long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }
}
