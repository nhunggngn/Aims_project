package Lab_02.src.hust.soict.aims;
import Lab_02.src.hust.soict.aims.cart.Cart;
import Lab_02.src.hust.soict.aims.media.*;
import Lab_02.src.hust.soict.aims.store.Store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Aims {
    static Store store = new Store();
    static Cart cart = new Cart();

    public static void main(String[] args) {
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", 19.95f, 87, "Roger Allers");
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", 24.95f, 87, "George Lucas");
        store.addMedia(dvd2);

        List<String> author = new ArrayList<>();
        author.add("Nguyễn Ngọc Ánh");
        Book book1 = new Book("Tôi thấy hoa vàng trên cỏ xanh", "Truyện ngắn", 30f, author);
        store.addMedia(book1);

        List<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("track 1", 3));
        tracks.add(new Track("track 2", 4));
        CompactDisc cd1 = new CompactDisc("Gieo", "Indie", 20f, "Thắng",
                "Ngọt Band", tracks);
        store.addMedia(cd1);

        showMenu();
    }
    public static void showMenu() {
        int choice;
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        Scanner scanner = new Scanner(System.in);
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    storeMenu();
                    break;
                case 2:
                    updateStore();
                    break;
                case 3:
                    cart.print();
                    cartMenu();
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 0);

    }
    public static void storeMenu() {
        int choice;
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

        Scanner scanner = new Scanner(System.in);
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    seeMediaDetails();
                    break;
                case 2:
                    addMediaToCart();
                    break;
                case 3:
                    playMedia();
                    break;
                case 4:
                    cart.print();
                    break;
                case 0:
                    System.out.println("Going back to the main menu...!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);

    }


    public static void mediaDetailsMenu(Media media) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");

        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    cart.addMedia(media);
                    break;
                case 2:
                    playMedia(media);
                    break;
                case 0:
                    System.out.println("Going back to the main menu...!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 0);

    }

    public static void updateStore(){
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add a media to the store");
            System.out.println("2. Remove a media from the store");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (option) {
                case 1:
                    addMediaToStore();
                    break;
                case 2:
                    removeMediaFromStore();
                    break;
                case 0:
                    System.out.println("Going back to the main menu...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }

    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    filterMedia();
                    break;
                case 2:
                    sortMedia();
                    break;
                case 3:
                    removeMediaFromCart();
                    break;
                case 4:
                    playMediaFromCart();
                    break;
                case 5:
                    placeOrder();
                case 0:
                    System.out.println("Return to Store Menu");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }

        } while (choice != 0);
    }

    public static void filterMedia(){
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart by id");
        System.out.println("2. Filter medias in cart by title");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 1-2");
        option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1){
            System.out.println("Enter the id: ");
            int inputId = scanner.nextInt();
            cart.search(inputId);
        } else if (option == 2) {
            System.out.println("Enter the title:");
            String inputTitle = scanner.nextLine();
            cart.search(inputTitle);
        } else {
            System.out.println("Invalid choice, back to Cart menu");
        }
    }

    public static void sortMedia(){
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Sort medias in cart by cost");
        System.out.println("2. Sort medias in cart by title");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 1-2");
        option = scanner.nextInt();
        scanner.nextLine();
        if (option == 1){
            cart.getItemsOrdered().sort(Media.COMPARE_BY_COST_TITLE);
        } else if (option == 2) {
            cart.getItemsOrdered().sort(Media.COMPARE_BY_TITLE_COST);
        } else {
            System.out.println("Invalid choice");
        }
    }

    public static void removeMediaFromCart(){
        System.out.print("Enter Name of the media: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Media media = store.searchMedia(title);
        cart.removeMedia(media);
    }

    public static void playMediaFromCart(){
        System.out.print("Enter Name of the media: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Media media = cart.searchMedia(title);
        if(media == null){
            System.out.println("Cannot find");
        }
        else {
            playMedia();
        }
    }

    public static void seeMediaDetails(){
        System.out.print("Enter Name of the media: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Media media = store.searchMedia(title);
        if (media == null){
            System.out.println("Cannot find");
        } else {
            System.out.println(media.toString());
            mediaDetailsMenu(media);
        }
    }
    public static void playMedia(Media media){
        if(media instanceof CompactDisc){
            ((CompactDisc) media).play();
        } else if (media instanceof  DigitalVideoDisc) {
            ((DigitalVideoDisc) media).play();
        } else {
            System.out.println("Cannot play media");
        }
    }
    public static void playMedia(){
        System.out.print("Enter Name of the media: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Media media = store.searchMedia(title);
        if(media == null){
            System.out.println("Cannot find");
        }
        else {
            playMedia(media);
        }
    }

    public static void addMediaToCart(){
        System.out.print("Enter Name of the media: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Media item = store.searchMedia(title);
        if(item == null){
            System.out.println("Cannot find");
        }
        else {
            cart.addMedia(item);
        }
    }

    public static void addMediaToStore(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Enter media type (CD/DVD/Book): ");
        String mediaType = scanner.nextLine();

        System.out.println("Enter media title: ");
        String title = scanner.nextLine();

        System.out.println("Enter media category: ");
        String category = scanner.nextLine();

        System.out.println("Enter media cost: ");
        float cost = scanner.nextFloat();
        scanner.nextLine();

        switch (mediaType.toUpperCase()) {
            case "CD":
                System.out.println("Enter media director: ");
                String directorCD = scanner.nextLine();
                System.out.println("Enter media artist: ");
                String artist = scanner.nextLine();
                System.out.println("Enter number of tracks: ");
                ArrayList<Track> trackName = new ArrayList<Track>();
                int numTrack = scanner.nextInt();
                for(int i = 0; i < numTrack; i++){
                    System.out.println("Enter name and length of tracks: ");
                    String nameOfTrack = scanner.nextLine();
                    int length = scanner.nextInt();
                    Track track = new Track(nameOfTrack, length);
                    trackName.add(track);
                }

                CompactDisc cd = new CompactDisc(title,category,cost,directorCD,artist,trackName);
                store.addMedia(cd);
                break;

            case "DVD":
                System.out.println("Enter media director: ");
                String directorDVD = scanner.nextLine();

                System.out.println("Enter media length: ");
                int lengthDVD = scanner.nextInt();

                DigitalVideoDisc dvd = new DigitalVideoDisc(title,category,cost,lengthDVD,directorDVD);
                store.addMedia(dvd);
                break;

            case "BOOK":
                System.out.println("Enter number of authors: ");
                ArrayList<String> name = new ArrayList<String>();
                int numAuthor = scanner.nextInt();
                for(int i = 0; i < numAuthor; i++){
                    String author = scanner.nextLine();
                    name.add(author);
                }
                Book book = new Book(title,category,cost, name);
                store.addMedia(book);
                break;
            default:
                System.out.println("Invalid media type.");
        }
    }

    public static void removeMediaFromStore(){
        System.out.print("Enter Name of the media: ");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        Media item = store.searchMedia(title);
        store.removeMedia(item);
    }
    private static void placeOrder() {
        cart.emptyCart();
        System.out.println("Order created!");

    }

}
