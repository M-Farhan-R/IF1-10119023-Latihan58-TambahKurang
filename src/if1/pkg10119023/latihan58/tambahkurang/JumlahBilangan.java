/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan58.tambahkurang;

/**
 *
 * @author Muhammad Farhan R 
 */
public class JumlahBilangan extends Bilangan{
    public void tampilHasilJumlah(){
        int x = super.getX();
        int y = super.getY();
        
        int jumlah = x + y;
        
        System.out.println("Hasil penjumlahan = "+jumlah);
    }
}
