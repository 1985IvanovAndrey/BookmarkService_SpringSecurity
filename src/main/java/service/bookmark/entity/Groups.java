package service.bookmark.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nameGroup;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "group_id")
    private List<Bookmark> bookmarks;

    public Groups(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public Groups(String nameGroup, List<Bookmark> bookmarks) {
        this.nameGroup = nameGroup;
        this.bookmarks = bookmarks;
    }

    public Groups(List<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
    }

    public Groups() {
    }
}
