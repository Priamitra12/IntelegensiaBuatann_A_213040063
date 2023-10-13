package id.ac.unpas.ib;

import id.ac.unpas.ib.bfs.BreadthFirstSearch;
import id.ac.unpas.ib.dls.DepthLimitedSearch;
import id.ac.unpas.ib.ucs.NodeUCS;
import id.ac.unpas.ib.ucs.UniformCostSearch;

public class MainTest {
    public static void main(String[] args) {
        Node pandeglang = new Node("Pandeglang");
        Node tangerang = new Node("Tangerang");
        Node jakarta = new Node("Jakarta");
        Node bekasi = new Node("Bekasi");
        Node depok = new Node("Depok");
        Node karawang = new Node("Karawang");
        Node subang = new Node("Subang");
        Node purwakarta = new Node("Purwakarta");
        Node cirebon = new Node("Cirebon");
        Node tegal  = new Node("Tegal");
        Node pekalongan = new Node("Pekalongan");
        Node lebo = new Node("Lebo");
        Node kendal = new Node("Kendal");
        Node semarang = new Node("Semarang");



        pandeglang.addTetangga(tangerang);
        pandeglang.addTetangga(banten);

        tangerang.addTetangga(pandeglang);
        tangerang.addTetangga(jakarta);
        tangerang.addTetangga(depok);

        jakarta.addTetangga(tangerang);
        jakarta.addTetangga(bekasi);
        jakarta.addTetangga(Depok);

        bekasi.addTetangga(jakarta);
        bekasi.addTetangga(subang);
        bekasi.addTetangga(karawang);
        bekasi.addTetangga(purwakarta);

        depok.addTetangga(jakarta);

        karawang.addTetangga(jakarta);
        karawang.addTetangga(bekasi);

        subang.addTetangga(bekasi);
        subang.addTetangga(cirebon);

        purwakarta.addTetangga(bekasi);

        cirebon.addTetangga(subang);
        cirebon.addTetangga(tegal);

        tegal.addTetangga(cirebon);
        tegal.addTetangga(pekalongan);

        pekalongan.addTetangga(lebo);
        pekalongan.addTetangga(tegal);

        lebo.addTetangga(kendal);
        lebo.addTetangga(semarang);
        lebo.addTetangga(pekalongan);

        kendal.addTetangga(lebo);
        kendal.addTetangga(semarang);


        semarang.addTetangga(lebo);
        semarang.addTetangga(kendal);
        semarang.addTetangga(unggaran);


        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(tangerang, semarang);
        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(tangerang, semarang);
        System.out.println();


        NodeUCS pandeglangUCS = new NodeUCS(Pandeglang, 160);
        NodeUCS tangerangUCS = new NodeUCS(Tangerang, 242);
        NodeUCS jakartaUCS = new NodeUCS(jakartaUCS, 161);
        NodeUCS bekasiUCS = new NodeUCS(Bekasi, 176);
        NodeUCS depokUCS = new NodeUCS(Depok, 77);
        NodeUCS karawangUCS = new NodeUCS(Karawang, 151);
        NodeUCS subangUCS = new NodeUCS(Subang, 226);
        NodeUCS purwakartajUCS = new NodeUCS(Purwakarta, 244);
        NodeUCS cirebonUCS = new NodeUCS(Cirebon, 241);
        NodeUCS tegalUCS = new NodeUCS(Tegal, 234);
        NodeUCS pekalonganUCS = new NodeUCS(Pekalongan, 380);
        NodeUCS leboUCS = new NodeUCS(Lebo, 10);
        NodeUCS kendalUCS = new NodeUCS(Kendal, 193);
        NodeUCS semarangUCS = new NodeUCS(Semarang, 253);



        pandeglangUCS.addTetangga(tangerangUCS);
        pandeglangUCS.addTetangga(bantenUCSUCS);

        tangerangUCS.addTetangga(pandeglangUCS);
        tangerangUCS.addTetangga(jakartaUCS);
        tangerangUCS.addTetangga(depokUCS);

        jakartaUCS.addTetangga(tangerangUCS);
        jakartaUCS.addTetangga(bekasiUCS);
        jakartaUCS.addTetangga(DepokUCS);

        bekasiUCS.addTetangga(jakartaUCS);
        bekasiUCS.addTetangga(subangUCS);
        bekasiUCS.addTetangga(karawangUCS);
        bekasiUCS.addTetangga(purwakartaUCS);

        depokUCS.addTetangga(jakartaUCS);

        karawangUCS.addTetangga(jakartaUCS);
        karawangUCS.addTetangga(bekasiUCS);

        subangUCS.addTetangga(bekasiUCS);
        subangUCS.addTetangga(cirebonUCS);

        purwakartaUCS.addTetangga(bekasiUCS);

        cirebonUCS.addTetangga(subangUCS);
        cirebonUCS.addTetangga(tegalUCS);

        tegalUCS.addTetangga(cirebonUCS);
        tegalUCS.addTetangga(pekalonganUCS);

        pekalonganUCS.addTetangga(leboUCS);
        pekalonganUCS.addTetangga(tegalUCS);

        leboUCS.addTetangga(kendalUCS);
        leboUCS.addTetangga(semarangUCS);
        leboUCS.addTetangga(pekalonganUCS);

        kendalUCS.addTetangga(leboUCS);
        kendalUCS.addTetangga(semarangUCS);


        semarangUCS.addTetangga(leboUCS);
        semarangUCS.addTetangga(kendalUCS);
        semarangUCS.addTetangga(unggaranUCS);


        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(tangerangUCS, semarangUCS);
        System.out.println();
    }
}
