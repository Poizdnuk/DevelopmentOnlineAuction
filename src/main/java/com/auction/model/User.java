package com.auction.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user")
public class User {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;

	@NotNull
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

	@OneToMany(mappedBy = "seller", fetch = FetchType.EAGER)
	private List<Item> items;

	@Column(name = "money")
	private long money;

	@NotNull
	@Column(name = "password")
	private String password;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "USER_WITH_ROLE",
			joinColumns ={@JoinColumn(name = "user_id")},
			inverseJoinColumns = {@JoinColumn(name = "user_role_id")} )
	private List<UserRole> userRole;

	@NotNull
	@Transient
	private String passwordConfirm;

	public User() {
	}

	public User(String login, String password, List<UserRole> userRole) {
		this.login = login;
		this.password = password;
		this.userRole = userRole;
	}

	public User(String login, String password, String passwordConfirm) {
		this.login = login;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}

	public User(String address, String email, List<History> history, List<Item> items,
				String login, List<Message> messageFrom, List<Message> messageTo,
				long money, String password, String phone, String userFamilyName,
				String userFirstName, String userLastName, List<UserRole> userRole) {
		this.address = address;
		this.email = email;
		this.history = history;
		this.items = items;
		this.login = login;
		this.messageFrom = messageFrom;
		this.messageTo = messageTo;
		this.money = money;
		this.password = password;
		this.phone = phone;
		this.userFamilyName = userFamilyName;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userRole = userRole;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<History> getHistory() {
		return history;
	}

	public void setHistory(List<History> history) {
		this.history = history;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public List<Message> getMessageFrom() {
		return messageFrom;
	}

	public void setMessageFrom(List<Message> messageFrom) {
		this.messageFrom = messageFrom;
	}

	public List<Message> getMessageTo() {
		return messageTo;
	}

	public void setMessageTo(List<Message> messageTo) {
		this.messageTo = messageTo;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserFamilyName() {
		return userFamilyName;
	}

	public void setUserFamilyName(String userFamilyName) {
		this.userFamilyName = userFamilyName;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public List<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}

	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	@Override
	public String toString() {
		return "User{" +
				"address='" + address + '\'' +
				", email='" + email + '\'' +
				", login='" + login + '\'' +
				", money=" + money +
				", password='" + password + '\'' +
				", phone='" + phone + '\'' +
				", userFamilyName='" + userFamilyName + '\'' +
				", userFirstName='" + userFirstName + '\'' +
				", userLastName='" + userLastName + '\'' +
				'}';
	}
}
