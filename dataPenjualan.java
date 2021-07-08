package panel.transkasiPenjualan;

import java.util.Date;

public class dataPenjualan {
    private String kode;
    private String namaPelanggan;
    
    private int totalBayar;
    private int bayar;
    private int kembalian;
    
    private String nota;
    private Date tanggal;
    private String kodeBarang;
    private String namaBarang;
    private String jenisBarang;
    private int harga;
    private int jumlahBeli;
    private int potongan;
    
    private int subTotal;
    private int subPotongan;
    private int total;

    /**
     * @return the kode
     */
    public String getKode() {
        return kode;
    }

    /**
     * @param kode the kode to set
     */
    public void setKode(String kode) {
        this.kode = kode;
    }

    /**
     * @return the namaPelanggan
     */
    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    /**
     * @param namaPelanggan the namaPelanggan to set
     */
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    /**
     * @return the totalBayar
     */
    public int getTotalBayar() {
        return totalBayar;
    }

    /**
     * @param totalBayar the totalBayar to set
     */
    public void setTotalBayar(int totalBayar) {
        this.totalBayar = totalBayar;
    }

    /**
     * @return the bayar
     */
    public int getBayar() {
        return bayar;
    }

    /**
     * @param bayar the bayar to set
     */
    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    /**
     * @return the kembalian
     */
    public int getKembalian() {
        return kembalian;
    }

    /**
     * @param kembalian the kembalian to set
     */
    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    /**
     * @return the nota
     */
    public String getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(String nota) {
        this.nota = nota;
    }

    /**
     * @return the tanggal
     */
    public Date getTanggal() {
        return tanggal;
    }

    /**
     * @param tanggal the tanggal to set
     */
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    /**
     * @return the kodeBarang
     */
    public String getKodeBarang() {
        return kodeBarang;
    }

    /**
     * @param kodeBarang the kodeBarang to set
     */
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }

    /**
     * @return the jumlahBeli
     */
    public int getJumlahBeli() {
        return jumlahBeli;
    }

    /**
     * @param jumlahBeli the jumlahBeli to set
     */
    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    /**
     * @return the potongan
     */
    public int getPotongan() {
        return potongan;
    }

    /**
     * @param potongan the potongan to set
     */
    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

    /**
     * @return the subTotal
     */
    public int getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @return the subPotongan
     */
    public int getSubPotongan() {
        return subPotongan;
    }

    /**
     * @param subPotongan the subPotongan to set
     */
    public void setSubPotongan(int subPotongan) {
        this.subPotongan = subPotongan;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the jenisBarang
     */
    public String getJenisBarang() {
        return jenisBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
}
