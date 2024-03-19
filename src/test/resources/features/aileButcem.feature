@ab
Feature: Kullanici aile butcem gorevlerini gerceklestirir

  Scenario: Kullanici verilen gorevler uzerinden test gorevlerini yerine getirir

  * ilk ekran ayarlarini yapin 0 6 880 1400 750 150 1400 500 ve ardindan login "Giriş Yap" sayfasina ulasin
  * "email" ve "password" bilgilerini girerek kullanici bilgileriyle giris yapin
  * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin
  * sol kisimdaki menuden hesabim bolumune gidin
  * hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin
  * ardindan degisiklerin yapildigini dogrulayin


  Scenario: Kullanici farklı ekran boyutlarindaki cihaz uzerinden testlerini gerceklestirir

    * ilk ekran ayarlarini yapin 0 6 500 1000 1000 150 1500 500 ve ardindan login "Giriş Yap" sayfasina ulasin
