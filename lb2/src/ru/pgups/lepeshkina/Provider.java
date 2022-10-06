package ru.pgups.lepeshkina;

public class Provider {
    private String firm;
    private String typeOfProduct ;
    private int agreementDate;

    public Provider(String firm, String typeOfProduct, int agreementDate) {
        this.firm = firm;
        this.typeOfProduct = typeOfProduct;
        this.agreementDate = agreementDate;
    }
    public String getFirm() {
        return this.firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getTypeOfProduct() {
        return this.typeOfProduct;
    }

    public void setTypeOfProduct(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }

    public int getAgreementDate() {
        return this.agreementDate;
    }

    public void setAgreementDate(int agreementDate) {
        this.agreementDate = agreementDate;
    }
}
