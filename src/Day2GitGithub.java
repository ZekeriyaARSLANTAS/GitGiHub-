public class Day2GitGithub {

/*
1-) git init --> Local repo oluşturmak için yani .git ile klasörümüzün
içindeki dosyaları ilişkilendirmek için kullanılır
2-) git add . --> Working space'den (yani yerel) dosyalarımı staging area'ya
(yani commitlemek için beklenen yer) gönderir
3- git status --> Working space'de durumu gösterir
4-) git commit -m "mesaj" --> Staging area'dan commit stora
dosyalarımı göndermek için kullanılır (commit yani versiyon
yani sürüm oluşturmuş olurum)
5-) git push --> Uzak repo'ya(yani remote - Github)
göndermek için kullandığımız kod Yalnız git push komutunu direk kullanmak istersek 1 kez
            git remote add origin adres
            git push -u origin master
Not: Yukarıdaki iki komutu tek seferde kullandıktan sonra ikinci commit'lerim için sadece git push
kullanırız
 */
public static void main(String[] args) {
    System.out.println("Github ı ogrendik");
    System.out.println("Branch zekeriya ");

}
}
        /*
        Dosyayı İlk defa göndereceğinizde
1) git init
2) git add .
3) git commit -m "versiyon_adi"
4) git remote add origin https://github.com/.....
5) git push -u origin master


Kodlarınızda değişiklik yaptığınızda tekrar güncellemek için
1) git add .
2) git commit -m "versiyon_adı"
3) git push
         */