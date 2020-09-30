package br.com.casadocodigo.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String email;

    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    @NotBlank
    private String identification;

    @NotBlank
    private String address;

    @NotBlank
    private String complement;

    @NotBlank
    private String city;

    @ManyToOne
    private Country country;

    @ManyToOne
    private State state;

    @NotBlank
    private String phone;

    @NotBlank
    private String cep;

    private Double totalWithoutDiscount;

    private Double total;

    @ElementCollection
    private List<Book> shoppingCart;

    public User(@NotBlank String email, @NotBlank String name, @NotBlank String lastName, @NotBlank String identification, @NotBlank String address, @NotBlank String complement, @NotBlank String city, @NotBlank String phone, @NotBlank String cep) {
        this.email = email;
        this.name = name;
        this.lastName = lastName;
        this.identification = identification;
        this.address = address;
        this.complement = complement;
        this.city = city;
        this.phone = phone;
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public List<Book> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Book> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Double getTotalWithoutDiscount() {
        return totalWithoutDiscount;
    }

    public void setTotalWithoutDiscount(Double totalWithoutDiscount) {
        this.totalWithoutDiscount = totalWithoutDiscount;
    }
}
