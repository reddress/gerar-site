package br.com.pontualimportbrindes.staging;

public class AddTextToPhoto {
    public static void main(String[] args) {
        Photo p = new Photo("C:\\Users\\heitor\\Desktop\\canivete.jpg");

        p.addCaption("Canivete");
        p.addBrand();
        p.save("C:\\Users\\heitor\\Desktop\\caniveteCaptioned.jpg");
    }
}
