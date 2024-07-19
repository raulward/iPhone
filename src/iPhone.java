public class iPhone implements Phone, MusicalPlayer, WebBrowser {

    private int openPages = 0;
    private boolean isPlayingMusic = false;
    private String musicPlaying = "";
    private String [] phoneRecord = new String[100];
    private int currentIndexPhoneRecord = 0;

    public void call(String number) {
        System.out.println("Calling to " + number);
        
        if (currentIndexPhoneRecord < phoneRecord.length) {
            phoneRecord[currentIndexPhoneRecord] = number;
            currentIndexPhoneRecord++;
        } else {
            System.out.println("Reached the maximum phone record limit");
        }
    }

    public void answer() {
        System.out.println("Answering to call");
    }

    
    public void iniciateVoiceMessanger() {
        System.out.println("Welcome to VoiceMessanger! Let's see you inbox");
    }

    
    public void selectMusic(String music) {
        System.out.println("Playing " + music);
        this.musicPlaying = music;
    }

    
    public void start() {
        if(this.isPlayingMusic) {
            System.out.println("Already playing " + this.musicPlaying);
        } else {
            this.isPlayingMusic = true;
            System.out.println("Starting music");
        }
        
    }
    
    public void pause() {
        if (!this.isPlayingMusic) {
            System.out.println("No music is playing");
        } else {
            System.out.println("Stopping music");
        }
        
    }

    public void openURL(String url) {
        System.out.println("Directing to " + url);
    }

    public void openNewPage() {
        if (this.openPages >= 20) {
            System.out.println("Cannot open a new page, maximum limit has been reached.");
        } else {
            System.out.println("Opening new page");
            this.openPages += 1;
        }
    }
    
    public void refreshPage() {
        System.out.println("Refreshing page");
    }

    public void closePage() {
        if (this.openPages <= 0) {
            System.out.println("Cannot close a tab because there is no pages to close.");
        } else {
            this.openPages -= 1;
        }
    }

    public void closeAllPages() {
        if (this.openPages == 0) {
            System.out.println("Cannot close all tabs because there is no pages to close.");
        } else {
            this.openPages = 0;
        }
    }

    public void showStatus() {
        System.out.println("Playing music: " + ((this.isPlayingMusic) ? "Yes" : "No"));
        System.out.println("Tabs open: " + this.openPages);
        System.out.println("Last call: " + this.phoneRecord[currentIndexPhoneRecord]);
    } 

    public void getMusicPlaying() {
        if (isPlayingMusic) {
            System.out.println("Playing " + this.musicPlaying);
        } else {
            System.out.println("None music playing.");
        }
    }

  
}
