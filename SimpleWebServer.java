import java.io.*;
import java.net.*;

public class SimpleWebServer {
    private static final int PORT = 2025;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Web sunucusu " + PORT + " portunda başlatıldı...");
            System.out.println("Tarayıcınızda http://localhost:" + PORT + " adresini açın.");

            while (true) {
                try {
                    Socket clientSocket = serverSocket.accept();
                    handleClient(clientSocket);
                } catch (IOException e) {
                    System.err.println("İstemci işlenirken hata: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Sunucu başlatılamadı: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void handleClient(Socket clientSocket) {
        try (
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream())
                );
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        ) {
            String requestLine = in.readLine();
            System.out.println("İstek: " + requestLine);

            String line;
            while ((line = in.readLine()) != null && !line.isEmpty()) {
            }

            String htmlContent = getHtmlContent();

            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html; charset=UTF-8");
            out.println("Content-Length: " + htmlContent.getBytes("UTF-8").length);
            out.println("Connection: close");
            out.println();
            out.println(htmlContent);
            out.flush();

        } catch (IOException e) {
            System.err.println("İstemci işleme hatası: " + e.getMessage());
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                System.err.println("Socket kapatma hatası: " + e.getMessage());
            }
        }
    }

    private static String getHtmlContent() {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"tr\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Selin Avcı - Java Web Sunucusu</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n" +
                "            background: linear-gradient(135deg, #7e22ce 0%, #1e3c72 100%);\n" +
                "            color: #fff;\n" +
                "            margin: 0;\n" +
                "            padding: 0;\n" +
                "        }\n" +
                "        .container {\n" +
                "            max-width: 900px;\n" +
                "            margin: 40px auto;\n" +
                "            background: rgba(255, 255, 255, 0.1);\n" +
                "            padding: 40px;\n" +
                "            border-radius: 20px;\n" +
                "            backdrop-filter: blur(15px);\n" +
                "            box-shadow: 0 10px 40px rgba(0,0,0,0.3);\n" +
                "        }\n" +
                "        h1 {\n" +
                "            font-size: 3em;\n" +
                "            background: linear-gradient(45deg, #fde68a, #fff);\n" +
                "            -webkit-background-clip: text;\n" +
                "            -webkit-text-fill-color: transparent;\n" +
                "            text-align: center;\n" +
                "            margin-bottom: 10px;\n" +
                "        }\n" +
                "        h2 {\n" +
                "            text-align: center;\n" +
                "            color: #e0e7ff;\n" +
                "            margin-bottom: 20px;\n" +
                "        }\n" +
                "        .section {\n" +
                "            background: rgba(255, 255, 255, 0.08);\n" +
                "            padding: 25px;\n" +
                "            border-radius: 15px;\n" +
                "            margin-bottom: 25px;\n" +
                "            border-left: 4px solid #a78bfa;\n" +
                "        }\n" +
                "        .section-title {\n" +
                "            font-size: 1.4em;\n" +
                "            color: #c4b5fd;\n" +
                "            margin-bottom: 10px;\n" +
                "        }\n" +
                "        .bio {\n" +
                "            line-height: 1.8;\n" +
                "            font-size: 1.05em;\n" +
                "        }\n" +
                "        footer {\n" +
                "            text-align: center;\n" +
                "            margin-top: 30px;\n" +
                "            color: #c4b5fd;\n" +
                "            font-size: 0.9em;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <h1>Selin Avcı</h1>\n" +
                "        <h2>Öğrenci No: 5230505117</h2>\n" +
                "        <div class=\"section\">\n" +
                "            <div class=\"section-title\">Hakkımda</div>\n" +
                "            <p class=\"bio\">\n" +
                "                Merhaba! Ben Selin Avcı, Kırklareli Üniversitesi Yazılım Mühendisliği 2. sınıf öğrencisiyim. \n" +
                "                Kod yazmayı, problem çözmeyi ve yeni teknolojiler öğrenmeyi seviyorum. \n" +
                "                Yazılım geliştirme sürecinde özellikle <strong>Java web tasarımı</strong> ve <strong>backend geliştirme</strong> alanlarına ilgi duyuyorum.\n" +
                "            </p>\n" +
                "        </div>\n" +
                "        <div class=\"section\">\n" +
                "            <div class=\"section-title\">İlgi Alanlarım</div>\n" +
                "            <p class=\"bio\">\n" +
                "                ☕ Java Programlama <br>\n" +
                "                💻 Web Geliştirme <br>\n" +
                "                🔐 Siber Güvenlik <br>\n" +
                "                🎨 Arayüz Tasarımı <br>\n" +
                "                📚 Yeni Teknolojiler Öğrenmek\n" +
                "            </p>\n" +
                "        </div>\n" +
                "        <footer>\n" +
                "            <p>Bu sayfa Java Socket Programlama ile oluşturulmuştur.</p>\n" +
                "            <p>Port: 1989 | Localhost Web Server</p>\n" +
                "        </footer>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
    }
}
