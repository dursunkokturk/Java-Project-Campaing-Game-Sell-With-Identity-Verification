package Concretes;

import Abstracts.ICampaignService;
import Entities.Campaing;

public class CampaignManager implements ICampaignService {
    @Override
    public void addCampaign(Campaing campaing) {
        System.out.println("Added Campaing : "+campaing.getCampaingName()+" "+
                campaing.getCampaignType()+" "+
                campaing.getCampaignPeriodOfValidity()+" "+
                campaing.getCampaingDiscount());
    }

    @Override
    public void deleteCampaign(Campaing campaing) {
        System.out.println("Deleted Campaing : "+campaing.getCampaingName()+" "+
                campaing.getCampaignType()+" "+
                campaing.getCampaignPeriodOfValidity()+" "+
                campaing.getCampaingDiscount());
    }

    @Override
    public void updateCampaign(Campaing campaing) {
        System.out.println("Updated Campaing : "+campaing.getCampaingName()+" "+
                campaing.getCampaignType()+" "+
                campaing.getCampaignPeriodOfValidity()+" "+
                campaing.getCampaingDiscount());
    }
}