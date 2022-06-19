package com.example.demo333.module.vo;

import java.io.Serializable;
import java.util.Date;
public class JobVO implements Serializable {
    private String title;
    private String jobContent;
    private String address;
    private Date statrDate;//起始时间
    private Date endDate;//结束时间
    private Double mimSalare;//最低工资
    private Double maxSalary;//最高工资
    private Integer currentPage;//当前页
    private Integer pageSize;//页面大小

    public JobVO() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getJobContent() {
        return this.jobContent;
    }

    public String getAddress() {
        return this.address;
    }

    public Date getStatrDate() {
        return this.statrDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public Double getMimSalare() {
        return this.mimSalare;
    }

    public Double getMaxSalary() {
        return this.maxSalary;
    }

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatrDate(Date statrDate) {
        this.statrDate = statrDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setMimSalare(Double mimSalare) {
        this.mimSalare = mimSalare;
    }

    public void setMaxSalary(Double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof JobVO)) return false;
        final JobVO other = (JobVO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$jobContent = this.getJobContent();
        final Object other$jobContent = other.getJobContent();
        if (this$jobContent == null ? other$jobContent != null : !this$jobContent.equals(other$jobContent))
            return false;
        final Object this$address = this.getAddress();
        final Object other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
        final Object this$statrDate = this.getStatrDate();
        final Object other$statrDate = other.getStatrDate();
        if (this$statrDate == null ? other$statrDate != null : !this$statrDate.equals(other$statrDate)) return false;
        final Object this$endDate = this.getEndDate();
        final Object other$endDate = other.getEndDate();
        if (this$endDate == null ? other$endDate != null : !this$endDate.equals(other$endDate)) return false;
        final Object this$mimSalare = this.getMimSalare();
        final Object other$mimSalare = other.getMimSalare();
        if (this$mimSalare == null ? other$mimSalare != null : !this$mimSalare.equals(other$mimSalare)) return false;
        final Object this$maxSalary = this.getMaxSalary();
        final Object other$maxSalary = other.getMaxSalary();
        if (this$maxSalary == null ? other$maxSalary != null : !this$maxSalary.equals(other$maxSalary)) return false;
        final Object this$currentPage = this.getCurrentPage();
        final Object other$currentPage = other.getCurrentPage();
        if (this$currentPage == null ? other$currentPage != null : !this$currentPage.equals(other$currentPage))
            return false;
        final Object this$pageSize = this.getPageSize();
        final Object other$pageSize = other.getPageSize();
        if (this$pageSize == null ? other$pageSize != null : !this$pageSize.equals(other$pageSize)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof JobVO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $jobContent = this.getJobContent();
        result = result * PRIME + ($jobContent == null ? 43 : $jobContent.hashCode());
        final Object $address = this.getAddress();
        result = result * PRIME + ($address == null ? 43 : $address.hashCode());
        final Object $statrDate = this.getStatrDate();
        result = result * PRIME + ($statrDate == null ? 43 : $statrDate.hashCode());
        final Object $endDate = this.getEndDate();
        result = result * PRIME + ($endDate == null ? 43 : $endDate.hashCode());
        final Object $mimSalare = this.getMimSalare();
        result = result * PRIME + ($mimSalare == null ? 43 : $mimSalare.hashCode());
        final Object $maxSalary = this.getMaxSalary();
        result = result * PRIME + ($maxSalary == null ? 43 : $maxSalary.hashCode());
        final Object $currentPage = this.getCurrentPage();
        result = result * PRIME + ($currentPage == null ? 43 : $currentPage.hashCode());
        final Object $pageSize = this.getPageSize();
        result = result * PRIME + ($pageSize == null ? 43 : $pageSize.hashCode());
        return result;
    }

    public String toString() {
        return "JobVO(title=" + this.getTitle() + ", jobContent=" + this.getJobContent() + ", address=" + this.getAddress() + ", statrDate=" + this.getStatrDate() + ", endDate=" + this.getEndDate() + ", mimSalare=" + this.getMimSalare() + ", maxSalary=" + this.getMaxSalary() + ", currentPage=" + this.getCurrentPage() + ", pageSize=" + this.getPageSize() + ")";
    }
}
