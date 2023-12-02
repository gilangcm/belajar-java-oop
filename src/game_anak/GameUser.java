package game_anak;

import belajar.oop.basic.interfac3.Phone;

public class GameUser {
    private Game game;

    public GameUser(Game game) {
        this.game = game;

    }

    void GamePenjumlahan() {this.game.penjumlahan();}
    void GamePengurangan() {this.game.pengurangan(); }
    void GamePerkalian() {
        this.game.perkalian();
    }
    void GamePembagian() {
        this.game.pembagian();
    }

    void GameBelahKetupat(){
        this.game.belahKetupat();
    }
    void GameSegitiga(){
        this.game.segitiga();
    }
    void GamePersegi(){
        this.game.persegi();
    }
    void GameKeluar(){
        this.game.keluar();
    }
}
