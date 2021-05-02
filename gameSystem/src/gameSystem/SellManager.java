package gameSystem;

public class SellManager implements SellService{
    private SellDal _sellDal;
    Sell _sell1;
    User _user1;

    public SellManager(SellDal _sellDao) {
        System.out.println(Messages.sellTitle);
        this._sellDal = _sellDal;
    }

    @Override
    public void sell(Sell sell, User user,Campaign campaign) {
        //id 0 dan büyükse
        if(sell.get_id()>0 && user.get_id()>0){
            //id birbirlerine eþitse Satýþ Baþarýlý
            if(sell.get_id() == user.get_id()){
                this.list(sell,user,campaign);
            }else{
                System.out.println(Messages.sellFailed);
            }
        }else{
            System.out.println(Messages.sellFailed);
        }
    }

    //Clean Code
    private void list(Sell sell, User user,Campaign campaign) {
        if(sell!=null && user !=null){
            System.out.println(Messages.sellSpecialForYouCampaign);
            System.out.println(Messages.campaignName+campaign.get_campaignName() + " "+Messages.campaignDiscount+campaign.get_discount());
            System.out.println(Messages.sellFullName+user.get_firstName() + " "+user.get_lastName()+ " | " +Messages.sellGameName+sell.get_gameName() + " "+Messages.sellGamePrice+ sell.get_gamePrice() +Messages.sellPriceType);
        }
    }
}