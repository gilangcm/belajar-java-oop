package belajar.oop.basic.interfac3;

public class Nokia implements Phone{
    private int volume;
    private boolean isPowerOn;

    public Nokia(){
//        volume awal
        this.volume = 50;
    }

    public int getVolume(){
        return this.volume;
    }



    @Override
    public void powerOn() {
    isPowerOn = true;
        System.out.println("Handphone Menyala");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone Dimatikan");

    }

    @Override
    public void volumeUp() {
        if (isPowerOn){
            if (this.volume == MAX_VOLUME){
                System.out.println("Volume Full");
                System.out.println("Volume sekarang " + this.getVolume() + "%" );
            } else {
                this.volume += 10;
                System.out.println("Volume " + this.getVolume());
            }
        } else {
            System.out.println("Nyalahakan HP terlebih dahulu");
        }

    }



    @Override
    public void volumeDown() {
        if (isPowerOn){
            if (this.volume == MIN_VOLUME){
                System.out.println("Volume tidak bisa dikecilkan lagi");
                System.out.println("volume sekarang " + this.getVolume() + "%" );
            } else {
                this.volume -= 10;
                System.out.println("Volume " + this.getVolume());
            }
        } else {
            System.out.println("Nyalahakan HP terlebih dahulu");
        }

    }


}
