package cn.edu.upc.yb.integrate.homepage.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ybdevelop on 2016/10/18.
 */
@Entity
@Table(name = "app")
public class App{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    @Column(nullable = false,unique = true)
    private String name;

    public App(String name) {
        this.name = name;
    }
    public App(){}

    public void update(String name){
        this.name = name;
    }
}