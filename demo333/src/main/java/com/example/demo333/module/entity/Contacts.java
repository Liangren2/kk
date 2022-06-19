package com.example.demo333.module.entity;

import java.io.Serializable;
import java.util.Date;

/*
 *联系人
 * @auther ke
 * @version 1.0
 * @date 2022-6-18
 */
//自动生成getter setter
public class Contacts implements Serializable {
    private Integer id;//用户编号
    private String name;//用户姓名
    private String phono;//联系电话
    private Date createDate;//创建日期

    public Contacts() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhono() {
        return this.phono;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhono(String phono) {
        this.phono = phono;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Contacts)) return false;
        final Contacts other = (Contacts) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$phono = this.getPhono();
        final Object other$phono = other.getPhono();
        if (this$phono == null ? other$phono != null : !this$phono.equals(other$phono)) return false;
        final Object this$createDate = this.getCreateDate();
        final Object other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Contacts;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $phono = this.getPhono();
        result = result * PRIME + ($phono == null ? 43 : $phono.hashCode());
        final Object $createDate = this.getCreateDate();
        result = result * PRIME + ($createDate == null ? 43 : $createDate.hashCode());
        return result;
    }

    public String toString() {
        return "Contacts(id=" + this.getId() + ", name=" + this.getName() + ", phono=" + this.getPhono() + ", createDate=" + this.getCreateDate() + ")";
    }
}
