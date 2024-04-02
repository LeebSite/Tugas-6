package com.example.nationapp;

public class CountryModel {
    private String namaNegara;
    private int gambarNegara;
    private String infoNegara;
    private String deskripsiNegara;

    public CountryModel(String namaNegara, int gambarNegara, String infoNegara, String deskripsiNegara) {
        this.namaNegara = namaNegara;
        this.gambarNegara = gambarNegara;
        this.infoNegara = infoNegara;
        this.deskripsiNegara = deskripsiNegara;
    }

    // Getter dan setter

    public String getNamaNegara() {
        return namaNegara;
    }

    public void setNamaNegara(String namaNegara) {
        this.namaNegara = namaNegara;
    }

    public int getGambarNegara() {
        return gambarNegara;
    }

        public void setGambarNegara(int gambarNegara) { this.gambarNegara = gambarNegara;}
    public String getInfoNegara() {
        return infoNegara;
    }

    public void setInfoNegara(String infoNegara) {
        this.infoNegara = infoNegara;
    }

    public String getDeskripsiNegara() {
        return deskripsiNegara;
    }

    public void setDeskripsiNegara(String deskripsiNegara) {
        this.deskripsiNegara = deskripsiNegara;
    }
}
