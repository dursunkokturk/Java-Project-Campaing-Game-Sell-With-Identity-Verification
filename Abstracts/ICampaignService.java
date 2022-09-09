package Abstracts;

import Entities.Campaing;

public interface ICampaignService {
    public void addCampaign(Campaing campaing);

    public void deleteCampaign(Campaing campaing);

    public void updateCampaign(Campaing campaing);
}