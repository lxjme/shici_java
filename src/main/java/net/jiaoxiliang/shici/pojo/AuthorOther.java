package net.jiaoxiliang.shici.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AuthorOther
 */
@Entity
@Table(name = "mysite_author_detail_bak")
public class AuthorOther {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private int author_id;
    @Column
    private String author_other;
    @Column
    private String author_other_short;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the author_id
     */
    public int getAuthor_id() {
        return author_id;
    }

    /**
     * @param author_id the author_id to set
     */
    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    /**
     * @return the author_other
     */
    public String getAuthor_other() {
        return author_other;
    }

    /**
     * @param author_other the author_other to set
     */
    public void setAuthor_other(String author_other) {
        this.author_other = author_other;
    }

    /**
     * @return the author_other_short
     */
    public String getAuthor_other_short() {
        return author_other_short;
    }

    /**
     * @param author_other_short the author_other_short to set
     */
    public void setAuthor_other_short(String author_other_short) {
        this.author_other_short = author_other_short;
    }

    
    
}