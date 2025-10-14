# java-web-server-producer
Basit bir Java Socket programı kullanılarak oluşturulmuş HTTP web sunucusu.

Java Web Sunucusu (SimpleWebServer)
Öğrenci Bilgileri:
Ad Soyad: Selin Avcı
Öğrenci No: 5230505117
Üniversite: Kırklareli Üniversitesi
Bölüm: Yazılım Mühendisliği – 2. Sınıf

Proje Amacı:
Bu proje, Java Socket Programlama kullanılarak geliştirilmiş basit bir web sunucusudur.
Amaç, tarayıcıdan gelen HTTP isteğini (GET request) yakalayıp kullanıcıya bir HTML sayfası döndürmektir.
Proje, Nesneye Yönelik Programlama dersi kapsamında hazırlanmıştır.

Çalışma Mantığı:
-Java programı belirtilen bir port üzerinden (örnek: 1989) dinleme yapar.
-Tarayıcıdan http://localhost:2025 adresine istek geldiğinde sunucu bağlantıyı kabul eder.
-Sunucu, kullanıcıya HTML formatında bir sayfa gönderir.
-Sayfada öğrencinin adı, numarası ve proje bilgileri yer alır.

Kullanılan Teknolojiler:
-Java 24 (JDK)
-Socket Programlama
-IntelliJ IDEA CE
-HTTP Protokolü (Temel 200 OK Yanıtı)

Çalıştırma Adımları:
-Proje dosyasını IntelliJ IDEA veya terminal üzerinden açın.
-SimpleWebServer.java dosyasını derleyip çalıştırın:
-javac SimpleWebServer.java
-java SimpleWebServer

Tarayıcıya gidin ve şu adresi yazın:
http://localhost:1989

Sayfa yüklendiğinde projenin HTML çıktısı görüntülenecektir.

Tarayıcıda aşağıdaki gibi bir ekran görüntülenir:


<img width="1710" height="1107" alt="Ekran Resmi 2025-10-15 ÖÖ 12 05 07" src="https://github.com/user-attachments/assets/03e7ee5b-8543-445c-a866-c929f15470f1" />






Selin Avcı
Öğrenci No: 5230505117
Kırklareli Üniversitesi - Yazılım Mühendisliği 2. Sınıf
Nesneye Yönelik Programlama Dersi Ödevi


Bu proje yalnızca öğrenme ve ödev amaçlı hazırlanmıştır.
HTTP sunucu yapısının temel çalışma prensibini göstermek için basit düzeyde tasarlanmıştır.





