import Adapters.MernisServiceAdapter;
import Concretes.CampaignManager;
import Concretes.CustomerManager;
import Concretes.GameManager;
import Entities.Campaing;
import Entities.Customer;
import Entities.Game;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(1,"98765432123","Dursun","Köktürk",1985);

        // Mernis Sistemi Ile Kisinin Bilgilerini Kontrol Ediyoruz
        MernisServiceAdapter adapter = new MernisServiceAdapter();

        // Kisinin Bilgileri Dogru Ise adapter Degiskeni Uzerinden
        CustomerManager customerManager = new CustomerManager(adapter);

        // CustomerManager Objesi Icindeki CustomerSave Fonksiyonuna Parametre Gonderiyoruz
        customerManager.customerSave(customer);
        System.out.println("");




        Game game = new Game(1,"NFS","Race");

        // GameManager Objesi Olusturuyoruz
        GameManager gameManager = new GameManager();

        // GameManager Objesi Uzerinden GameSave Fonksiyonuna
        // Game Objesi Icindeki Parametreleri Game Degiskeni Uzerinden Gonderiyoruz
        gameManager.gameSave(game);
        System.out.println("");

        // customer Degiskeni Uzerinden Musteri Bilgilerini
        // game Degiskeni Uzerinden Oyun Bilgilerini Gonderiyoruz
        // Bu Sekilde Musteri Bilgileri Ile Oyun Bilgilerini Eslestiriyoruz
        gameManager.gameSell(customer,game);
        System.out.println("");



        // Kampanya Bilgilerinin Girilecegi Obje Olusturuyoruz
        Campaing campaing = new Campaing(1,"Student Campaign","Summer Campaign","30 Days",1000,30);

        // Kampanya Bilgilerini Yazdirmak Icin CampaignManager Objesi Olusturuyoruz
        // Olusturulan Objeyi Degiskene Atama Yapiyoruz
        CampaignManager campaignManager = new CampaignManager();

        // CampaignManager Objesinin Atandigi Degisken Adi Uzerinden
        // ICampaignService Interface i Icindeki Fonksiyona Ulasiyoruz
        // Ulasilan Fonksiyona Campaign Objesi Icindeki Degerleri
        // Parametre Olarak Veriyoruz
        campaignManager.addCampaign(campaing);
        System.out.println("Unit Price : "+campaing.getUnitPrice());
        System.out.println("Unit Price After Discount : "+campaing.getUnitPriceAfterDiscount());
        campaignManager.updateCampaign(campaing);
        campaignManager.deleteCampaign(campaing);
    }
}