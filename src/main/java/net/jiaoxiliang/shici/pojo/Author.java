package net.jiaoxiliang.shici.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Author
 */
@Entity
@Table(name = "mysite_author_bak")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String author_name;

    @Column
    private int f_year_id;

    @Column
    private String f_year;

    @Column
    private String img_url;

    @Column
    private String author_desc;
    
    @Column
    private Date create_time;
    

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
     * @return the author_name
     */
    public String getAuthor_name() {
        return author_name;
    }

    /**
     * @param author_name the author_name to set
     */
    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    /**
     * @return the f_year_id
     */
    public int getF_year_id() {
        return f_year_id;
    }

    /**
     * @param f_year_id the f_year_id to set
     */
    public void setF_year_id(int f_year_id) {
        this.f_year_id = f_year_id;
    }

    /**
     * @return the f_year
     */
    public String getF_year() {
        return f_year;
    }

    /**
     * @param f_year the f_year to set
     */
    public void setF_year(String f_year) {
        this.f_year = f_year;
    }

    /**
     * @return the img_url
     */
    public String getImg_url() {
        return img_url;
    }

    /**
     * @param img_url the img_url to set
     */
    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    /**
     * @return the author_desc
     */
    public String getAuthor_desc() {
        return author_desc;
    }

    /**
     * @param author_desc the author_desc to set
     */
    public void setAuthor_desc(String author_desc) {
        this.author_desc = author_desc;
    }

    /**
     * @return the create_time
     */
    public Date getCreate_time() {
        return create_time;
    }

    /**
     * @param create_time the create_time to set
     */
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }



}