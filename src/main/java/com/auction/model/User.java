package com.auction.model;

import com.auction.model.enumRole.UserRoleType;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")
public class User {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;

	@Column(name = "login", length = 20)
	private String login;

	@Column(name = "user_first_name", length = 20)
	private String userFirstName;

	@Column(name = "user_last_name", length = 20)
	private String userLastName;

	@Column(name = "user_family_name", length = 20)
	private String userFamilyName;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;

	@OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
	private List<History> history;

    @OneToMany(mappedBy = "from", fetch = FetchType.EAGER)
    private List<Message> messageFrom;

    @OneToMany(mappedBy = "to", fetch = FetchType.EAGER)
    private List<Message> messageTo;

	@Column(name = "money")
	private long money;

	@Column(name = "password")
	private String password;

	@Column(name = "role_user")
	@Enumerated(EnumType.STRING)
	private UserRoleType role;

	public User() {
	}
}
