package com.gcgo.pojo;

import javax.persistence.*;

/**
 * 简历实体类（在类中要使⽤注解建⽴实体类和数据表之间的映射关系以及属性和字段的映射关系）
 * 1、实体类和数据表映射关系
 * @Entity
 * @Table
 * 2、实体类属性和表字段的映射关系
 * @Id 标识主键
 * @GeneratedValue 标识主键的⽣成策略
 * @Column 建⽴属性和字段映射
 */
@Entity
@Table(name = "tb_resume")
public class Resume {
    @Id
    /**
     * ⽣成策略经常使⽤的两种：
     * GenerationType.IDENTITY:依赖数据库中主键⾃增功能 Mysql
     * GenerationType.SEQUENCE:依靠序列来产⽣主键 Oracle*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "phone")
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
