package service.bookmark.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@Entity
@Table
public class Bookmark {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private String bookmark;

    public Bookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    public Bookmark() {
    }
}
