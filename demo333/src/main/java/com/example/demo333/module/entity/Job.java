package com.example.demo333.module.entity;

import java.io.Serializable;
import java.util.Date;

public class Job implements Serializable {
    private Integer id;
    private String title;
    private String jobContent;
    private Date jobDate;
    private String address;
    private Double salary;
    private Integer contacts;
    private Date createDate;
    private Integer deleteFlag;

    public Job() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getJobContent() {
        return this.jobContent;
    }

    public Date getJobDate() {
        return this.jobDate;
    }

    public String getAddress() {
        return this.address;
    }

    public Double getSalary() {
        return this.salary;
    }

    public Integer getContacts() {
        return this.contacts;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    public void setJobDate(Date jobDate) {
        this.jobDate = jobDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setContacts(Integer contacts) {
        this.contacts = contacts;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Job)) return false;
        final Job other = (Job) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$jobContent = this.getJobContent();
        final Object other$jobContent = other.getJobContent();
        if (this$jobContent == null ? other$jobContent != null : !this$jobContent.equals(other$jobContent))
            return false;
        final Object this$jobDate = this.getJobDate();
        final Object other$jobDate = other.getJobDate();
        if (this$jobDate == null ? other$jobDate != null : !this$jobDate.equals(other$jobDate)) return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$salary = this.getSalary();
        final Object other$salary = other.getSalary();
        if (this$salary == null ? other$salary != null : !this$salary.equals(other$salary)) return false;
        final Object this$contacts = this.getContacts();
        final Object other$contacts = other.getContacts();
        if (this$contacts == null ? other$contacts != null : !this$contacts.equals(other$contacts)) return false;
        final Object this$createDate = this.getCreateDate();
        final Object other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate))
            return false;
        final Object this$deleteFlag = this.getDeleteFlag();
        final Object other$deleteFlag = other.getDeleteFlag();
        if (this$deleteFlag == null ? other$deleteFlag != null : !this$deleteFlag.equals(other$deleteFlag))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Job;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $jobContent = this.getJobContent();
        result = result * PRIME + ($jobContent == null ? 43 : $jobContent.hashCode());
        final Object $jobDate = this.getJobDate();
        result = result * PRIME + ($jobDate == null ? 43 : $jobDate.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $salary = this.getSalary();
        result = result * PRIME + ($salary == null ? 43 : $salary.hashCode());
        final Object $contacts = this.getContacts();
        result = result * PRIME + ($contacts == null ? 43 : $contacts.hashCode());
        final Object $createDate = this.getCreateDate();
        result = result * PRIME + ($createDate == null ? 43 : $createDate.hashCode());
        final Object $deleteFlag = this.getDeleteFlag();
        result = result * PRIME + ($deleteFlag == null ? 43 : $deleteFlag.hashCode());
        return result;
    }

    public String toString() {
        return "Job(id=" + this.getId() + ", title=" + this.getTitle() + ", jobContent=" + this.getJobContent() + ", jobDate=" + this.getJobDate() + ", address=" + this.getAddress() + ", salary=" + this.getSalary() + ", contacts=" + this.getContacts() + ", createDate=" + this.getCreateDate() + ", deleteFlag=" + this.getDeleteFlag() + ")";
    }
}
