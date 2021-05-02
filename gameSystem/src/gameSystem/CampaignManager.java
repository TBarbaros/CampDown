package gameSystem;

public class CampaignManager implements CampaignService{
    private CampaignDal _campaignDal;

    public CampaignManager(CampaignDal _campaignDao) {
        System.out.println(Messages.campaignTitle);
        this._campaignDal = _campaignDao;
    }

    public void add(Campaign campaign){
        var result = _campaignDal.add(campaign);
        System.out.println(Messages.createdCampaign);
        System.out.println(Messages.campaignName+result.get_campaignName() + Messages.campaignDiscount + result.get_discount());
    }

    @Override
    public void delete(Campaign campaign) {
        var result = _campaignDal.delete(campaign);
        System.out.println(Messages.deletedCampaign);
        System.out.println(Messages.campaignName+result.get_campaignName());
    }

    @Override
    public void update(Campaign campaign) {
        var result = _campaignDal.update(campaign);
        System.out.println(Messages.updatedCampaign);
        System.out.println(Messages.campaignName+result.get_campaignName() + Messages.campaignDiscount+ result.get_discount());
    }
}