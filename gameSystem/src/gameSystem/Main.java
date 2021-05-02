package gameSystem;

public class Main {

    public static void main(String[] args) {
        //Campaign
        CampaignService _campaignService = new CampaignManager(new CampaignDal());
        Campaign campaign1 = new Campaign(1,"Premium",36);
        Campaign updatedcampaign1 = new Campaign(1,"Sabit",15);
        _campaignService.add(campaign1);
        _campaignService.update(updatedcampaign1);
        _campaignService.delete(campaign1);

        System.out.println("\n");

        //User
        UserService _userService = new UserManager(new UserDal());
        //CheckUser
        User user1 = new User(1,"Tarýk","Barbaros","12345678910","06.08.1988","tarikd","123123456");
        User updateduser1 = new User(1,"Tarik","Barbaros","12345678910","06.08.1998","tarikd","123123456");
        _userService.add(user1);
//        _userService.update(updateduser1);
//        _userService.delete(user1);
        

        System.out.println("\n");

        //Sell
        SellService _sellService = new SellManager(new SellDal());
        Sell sell1 = new Sell(1,"Araba Oyunlarý",120);
        _sellService.sell(sell1,user1,campaign1);

    }
}