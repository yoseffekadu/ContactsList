package com.example.Contacts;

class MFPSample {
    private String district;
    private String position;
    private String name;
    private String telephone;


    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "MFPSample{" +
                "district='" + district + '\'' +
                ", position='" + position + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }


}
