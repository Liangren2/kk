package com.example.demo333.module.dto;

import java.io.Serializable;
public class JobDTO implements Serializable {
    private String contactsName;//联系人姓名
    private String contatsPhone;//联系电话

    public JobDTO() {
    }

    public String getContactsName() {
        return this.contactsName;
    }

    public String getContatsPhone() {
        return this.contatsPhone;
    }

    public void setContactsName(String contactsName) {
        this.contactsName = contactsName;
    }

    public void setContatsPhone(String contatsPhone) {
        this.contatsPhone = contatsPhone;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof JobDTO)) return false;
        final JobDTO other = (JobDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$contactsName = this.getContactsName();
        final Object other$contactsName = other.getContactsName();
        if (this$contactsName == null ? other$contactsName != null : !this$contactsName.equals(other$contactsName))
            return false;
        final Object this$contatsPhone = this.getContatsPhone();
        final Object other$contatsPhone = other.getContatsPhone();
        if (this$contatsPhone == null ? other$contatsPhone != null : !this$contatsPhone.equals(other$contatsPhone))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof JobDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $contactsName = this.getContactsName();
        result = result * PRIME + ($contactsName == null ? 43 : $contactsName.hashCode());
        final Object $contatsPhone = this.getContatsPhone();
        result = result * PRIME + ($contatsPhone == null ? 43 : $contatsPhone.hashCode());
        return result;
    }

    public String toString() {
        return "JobDTO(contactsName=" + this.getContactsName() + ", contatsPhone=" + this.getContatsPhone() + ")";
    }
}
