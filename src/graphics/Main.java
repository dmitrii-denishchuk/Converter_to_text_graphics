package graphics;

import graphics.image.Converter;
import graphics.image.TextGraphicsConverter;
import graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new Converter();

        GServer server = new GServer(converter);
        server.start();

        // Вывод в консоль:
        String url = "https://a.deviantart.net/avatars/p/a/pandeadpool.jpg?4";
        String imgTxt = converter.convert(url);
        System.out.println(imgTxt);
    }
}