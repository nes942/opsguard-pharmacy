package com.opsguard.pharmacy.category.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import java.time.LocalDateTime;

/***
 * Objetivo: modelar los siguientes campos (atributos de clase):
 * id
 * name
 * description
 * active
 * createdAt --> nomenclatura para Java || created_at --> nomenclatura para SQL
 * updatedAt
 */

@Entity(name = "category")
@Table(name = "categories") // La entidad es categorías
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 100, nullable = false, unique = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "active", nullable = false)
    private Boolean active;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // --- CONSTRUCTOR VACÍO ---

    // Este es el constructor que utiliza el JPA
    public Category(){
    }

    // --- GETTERS Y SETTERS ---

    // id
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    // name
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // description
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    // active
    public Boolean getActive(){
        return active;
    }

    public void setActive(Boolean active){
        this.active = active;
    }

    // createdAt
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt
    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }

}
