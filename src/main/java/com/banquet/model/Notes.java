package com.banquet.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Notes {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    private int count;
    private String photo;
    private String address;
    private int price;
    private String description;
    @OneToMany(mappedBy = "note", fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Ordering> orderings;
    public Notes(String name, String photo, int price, String description, String address) {
        this.name = name;
        this.address = address;
        this.photo = photo;
        this.price = price;
        this.description = description;
        this.count = 0;
    }
}
