package net.jiaoxiliang.shici.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Category
 */
@Entity
@Table(name="t_category")
public class Category {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    
    @Column
    private String c_name;

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
     * @return the c_name
     */
    public String getC_name() {
        return c_name;
    }

    /**
     * @param c_name the c_name to set
     */
    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
    
}