package ru.netology.domain;

public class ComplaintsPost {
    private int idComplaint; // id жалобы
    private int idAuthor; // id автора
    private int idReasonComplaint; //id причины жалобы

    public int getIdComplaint() {
        return idComplaint;
    }

    public void setIdComplaint(int idComplaint) {
        this.idComplaint = idComplaint;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getIdReasonComplaint() {
        return idReasonComplaint;
    }

    public void setIdReasonComplaint(int idReasonComplaint) {
        this.idReasonComplaint = idReasonComplaint;
    }
}
