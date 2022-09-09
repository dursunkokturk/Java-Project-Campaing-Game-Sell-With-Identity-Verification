package Entities;

public class Campaing {
    private int id;
    private String campaingName;
    private String campaignType;
    private String campaignPeriodOfValidity;
    private double unitPrice;
    private double campaignDiscount;

    public Campaing(){

    }
    public Campaing(int id,String campaingName,String campaignType,String campaignPeriodOfValidity,double unitPrice,int campaignDiscount){
        this.id = id;
        this.campaingName = campaingName;
        this.campaignType = campaignType;
        this.campaignPeriodOfValidity = campaignPeriodOfValidity;
        this.unitPrice = unitPrice;
        this.campaignDiscount = campaignDiscount;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCampaingName() {
        return campaingName;
    }
    public void setCampaingName(){
        this.campaingName = campaingName;
    }
    public String getCampaignType() {
        return campaignType;
    }
    public void setCampaignType(String campaignType){
        this.campaignType = campaignType;
    }
    public String getCampaignPeriodOfValidity() {
        return campaignPeriodOfValidity;
    }
    public void setCampaignPeriodOfValidity(String campaignPeriodOfValidity){
        this.campaignPeriodOfValidity = campaignPeriodOfValidity;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(){
        this.unitPrice = unitPrice;
    }
    public double getCampaingDiscount() {
        return campaignDiscount;
    }
    public double setCampaingDiscount(double campaingDiscount){
        this.campaignDiscount = campaignDiscount;
        return campaingDiscount;
    }
    public double getUnitPriceAfterDiscount(){
        return this.unitPrice - (this.unitPrice * this.campaignDiscount / 100);
    }
}