package org.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logo")
public class Logo {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name_logo")
    private  String nameLogo;

    public Logo(Integer id, String nameLogo) {
        this.id = id;
        this.nameLogo = nameLogo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameLogo() {
        return nameLogo;
    }

    public void setNameLogo(String nameLogo) {
        this.nameLogo = nameLogo;
    }
}
