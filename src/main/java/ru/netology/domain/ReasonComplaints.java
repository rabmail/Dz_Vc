package ru.netology.domain;

public class ReasonComplaints {
    private int idReasonComplaint; //id причины жалобы
    private String reasonComplaint; //текст жалобы

    // + get/set на все поля


    public int getIdReasonComplaint() {
        return idReasonComplaint;
    }

    public void setIdReasonComplaint(int idReasonComplaint) {
        this.idReasonComplaint = idReasonComplaint;
    }

    public String getReasonComplaint() {
        return reasonComplaint;
    }

    public void setReasonComplaint(String reasonComplaint) {
        this.reasonComplaint = reasonComplaint;
    }
}
