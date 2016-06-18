package array2dimensi;

/**
 *
 * @author Bijak
 */
public class Array2Dimensi {

    public static void main(String[] args) {
        // membuat isi elemen array 
        String[][] country ={
        
        // keterangan {kolom1,kolom2,kolom4}
        {"No","Nama","Negara"}, // baris ke 0
        {"1.","Rifal","Indonesia"}, // baris ke 1
        {"2.","Sofa","Uzbekistan"}, // baris ke 2
        {"3.","Samudra","Indonesia"}, // baris ke 3
        {"4.","Azahra","Indonesia"} // baris ke 4
        
    };
    
    // mendeklarasikan baris dan kolom
    int i,j; //i = baris, j = kolom
           
            for(i=0;i<5;i++){ //menampilkan elemen jumlah baris
    
            for(j=0;j<3;j++){ // menampilkan elemen jumlah kolom
                
            // menampilkan isi elemen baris dan kolom
            System.out.print(country[i][j]+" ");
            }
            System.out.println(" ");     // pindah baris
            
}
}
    
}
