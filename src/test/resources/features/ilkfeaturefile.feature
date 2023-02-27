@google_search
Feature: ilk feature file

  Background: Google_sayfasina_git
    Given kullanici google gider

  @iphone
  Scenario: TC01_google_iphone_arama

    When kullanici iphone icin arama yapar
    Then sonuclarda iphone oldugunu dogrular
    And close the application

    @tesla
  Scenario: TC02_google_tesla_arama

    When kullanici tesla için arama yapar
    Then sonuclarda tesla olduğunu dogrular
    Then close the application

# 1. Her feature file, "Feature:" kelimesi ile başlamak zorundadır
# 2. Her bil file da, yalnız bir "Feature:" kullanılabilir
#    Gherkin dili ile test senaryolarını oluştururz
# 3. Senaryo (TEST CASE) oluşturmak için "Scenario" kelimesi kullanılır
# 4. Birden fazla Scenari: kullanılabilir
# 5. Her bir adim Given,When,And,Then,But,* kelimelerinden biriyle başlamalıdır
# 6. Given -> Genelde ilk satırlarda, pre condition stepleri için kullanılır
# 7. Then -> Genelde son satırlarda, verification stepleri için kullanılır
# 8. And, When -> Genelde ara adımlarda bağlar olarak kullanılır
# NOTE: Teknik olarak istenilen kelime istenilir, step de kullanılabilir,ama anlam karmaşası olmaması için bu adımlar takip edilir
#  9. Belirli Scenerio ları çalıştırmak için cucumber tags ler kullanılır
#  tag ler Feature, Scenario, Scerio Outline, Examples kelimeleri ile birlikte kullanilabilir
# 10. Background: Her bir Scenario kelimesinden ONCE tek bir sefer calisir.her senaryodan önce çalışmasını istediğimiz adımları ekleni
#                @BeforeMethod'a benzer
#tags kullanmazsak "features"ta ne varsa onu çalıştırır.
#11. dryRun= false --> dryRun yokmuş gibi normal şekilde çalışır.Yani tüm adımları  tek tek browser'da açar
# dryRun = true --> hızlı bir şekilde java kodlarını tarar eksik step var mı onu kontrol eder.Browser açmaz,zamandan tasarruf sağlar
#                    Ne zaman kullanırız? yeni bir step oluşturduysak ve zaman kaybetmeden java kodunu almak istiyorsak kullanırız
#                     Tanımlanmamıiş step definitionları almak için kullanılır
#                   Kodlarımızı browser da çalıştırmak istediğimizde dryRun=false a çevirmemiz lazım
# Without Parameter : Kodlarımızı parametreli ve dinamik hale getirmek için feature file da değişken olarak kullanacağımız kelimeyi "" çift tırnak içine alırız
#                     parametreler datalar için kullanılır
#12.Scenario Ouline : Aynı senaryoyu farklı değerlerle tekrar tekrar run etmek için kullanılır.Mesela senaryo google arama yapmak
#                    birinde iphone aratırıyorsun ,birinde tesla,birinde water...
 #Scenario Outline'ı niçin kullanırız?
  #  1. Tekrar tekrar kullanılan reusable test stepleri oluşturmak için
  #  2. Birden fazla veri ile test case yapmak için
  #  3. Feature file ı kısa hale getirmek için.Birden fazla Scenario yerine tek bir Scenario Outline kullanılır
  #  4. Scenario Outline aynı scenario'yu farklı verilerle test etmek için kullanılır
