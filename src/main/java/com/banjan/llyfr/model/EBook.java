package com.banjan.llyfr.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.util.Objects;
import java.util.UUID;

@ToString
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "e_book")
public class EBook {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "language")
    private String language;

    @Column(name = "genre")
    private String genre;

    @Lob
    @Column(name = "cover_image_link", nullable = false)
    private String coverImageLink = "https://i.ibb.co/gz1Zy6x/book-cover-placeholder.jpg";

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Lob
    @Column(name = "download_link", nullable = false, unique = true)
    private String downloadLink;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EBook eBook = (EBook) o;
        return id != null && Objects.equals(id, eBook.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}