public class MainRunner {
    public static void main(String[] args) {
        FileUtility fu = new FileUtility();
        fu.copyFolder("C:\\Users\\Jon\\AppData\\Roaming\\.minecraft\\saves", "D:\\Programs\\Dropbox\\Saves\\Minecraft");
        fu.copyFolder("D:\\Programs\\Dropbox\\Saves\\Minecraft", "C:\\Users\\Jon\\AppData\\Roaming\\.minecraft\\saves");
    }
}
