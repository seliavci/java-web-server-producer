# java-web-server-producer
Basit bir Java Socket programı kullanılarak oluşturulmuş HTTP web sunucusu.

Java Web Sunucusu

Bu proje, Java Socket Programlama kullanılarak geliştirilmiş, 1989 portu üzerinde çalışan basit bir HTTP web sunucusudur.  
Sunucu, istemci bağlantılarını kabul eder ve HTML çıktısını tarayıcıya iletir.  
Kırklareli Üniversitesi Yazılım Mühendisliği 2. sınıf dersi kapsamında, Nesneye Yönelik Programlama Ödevi olarak hazırlanmıştır.

---

İçindekiler
- Özellikler
- Teknolojiler
- Kurulum
- Kullanım
- Proje Yapısı
- Nasıl Çalışır?
- Öğrenilen Konular
- Yazar


---

Özellikler
**Socket Programlama:** `ServerSocket` ve `Socket` sınıflarıyla geliştirilmiştir.  
**HTTP Protokolü:** Basit `GET` isteklerini işler ve HTML çıktısı döner.  
**Statik HTML Sunumu:** Tarayıcıda bir kişisel sayfa görüntüler.  
**UTF-8 Desteği:** Türkçe karakterler doğru biçimde görüntülenir.  
**Konsol Çıktısı:** Sunucuya yapılan bağlantılar terminalde görüntülenir.  

---

Teknolojiler
- **Java 8 veya üzeri**
- **Socket Programming:** `ServerSocket`, `Socket`
- **I/O Streams:** `PrintWriter`, `OutputStream`
- **HTTP 1.1 Temelleri**

---

Kurulum

### Gereksinimler
- Java JDK 8 veya üzeri  
- IntelliJ IDEA (veya benzeri IDE)

### Adımlar
1️ Projeyi klonlayın veya ZIP olarak indirin.  
2️ `SimpleWebServer.java` dosyasını IntelliJ içinde açın.  
3️ Aşağıdaki komutlarla terminalden de çalıştırabilirsiniz:


```bash
javac SimpleWebServer.java
java SimpleWebServer


Proje Yapısı
java-web-sunucusu/
├── SimpleWebServer.java    # Ana sunucu kodu
└── README.md               # Proje açıklama dosyası


Nasıl Çalışır?
ServerSocket 1989 portunu dinler.
Bir istemci bağlandığında Socket oluşturulur.
Sunucu, HTML çıktısını PrintWriter aracılığıyla istemciye gönderir.
Tarayıcı bu yanıtı alır ve ekranda kişisel web sayfan görünür.


Öğrenilen Konular:
Socket Programlama (ServerSocket & Socket)
HTTP Protokolünün Temelleri
I/O Stream Kullanımı
Basit Sunucu-İstemci İletişimi
Java ile Dinamik İçerik Gönderimi


Yazar:
Selin Avcı
Kırklareli Üniversitesi - Yazılım Mühendisliği 2. Sınıf
📧 E-posta: selinavci2004@icloud.com
Öğrenci No: 5230505117




























