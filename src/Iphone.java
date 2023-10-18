import aplications.BrowserApp;
import aplications.MusicApp;
import aplications.PhoneApp;

public class Iphone {
    public static void main(String[] args) throws Exception {
        
        MusicApp powerMusic = new MusicApp();
        PhoneApp masterPhone = new PhoneApp();
        BrowserApp superBrowser = new BrowserApp();
        
        powerMusic.play();
        powerMusic.pause();
        powerMusic.selectMusic("Nova das Paradas");
        masterPhone.makeCall();
        masterPhone.acceptCall();
        masterPhone.startVoiceMail();
        superBrowser.displayPage();
        superBrowser.updatePage();
        superBrowser.addNewTab();

    }
}
