/*      PBO2
 *   Nama  : TEGUH SISWANTO
 *   NIM   : 10117065
 *   Kelas : IF-2 / III
 *   Tanggal/Jam : 6 November 2018 / 08.50 AM
 */
public class Main {
    public static void main(String[] args) {
        Rnb blues = new Rnb();
        blues.setArtistName("Jimmy Hendrik");
        blues.genreBlues(blues.getArtistName());

        Rnb jazz = new Rnb();
        jazz.setArtistName("Chad Baker");
        jazz.genreJazz(jazz.getArtistName());

        Folk folk = new Folk();
        folk.setArtistName("Bob Dylan");
        folk.genreFolk(folk.getArtistName());

        Rockability rockability = new Rockability();
        rockability.setArtistName("Elvis Presley");
        rockability.genreRockability(rockability.getArtistName());

        HardRock hardRock = new HardRock();
        hardRock.setArtistName("DreamTheater");
        hardRock.genreProgressiveRock(hardRock.getArtistName());

        HardRock psychedelicRock = new HardRock();
        psychedelicRock.setArtistName("The Doors");
        psychedelicRock.genrePsychedelicRock(psychedelicRock.getArtistName());

        HardRock popRock = new HardRock();
        popRock.setArtistName("Kiss");
        popRock.genrePopRock(popRock.getArtistName());

        Metal punk = new Metal();
        punk.setArtistName("MXPX");
        punk.genrePunk(punk.getArtistName());

        Metal heavyMetal = new Metal();
        heavyMetal.setArtistName("METALLICA");
        heavyMetal.genreHeavyMetal(heavyMetal.getArtistName());

        Grindcore grindCore = new Grindcore();
        grindCore.setArtistName("Mesin Tempur");
        grindCore.genreGrindcore(grindCore.getArtistName());

        DeathMetal deathMetal = new DeathMetal();
        deathMetal.setArtistName("JASAD");
        deathMetal.genreDeathMetal(deathMetal.getArtistName());

        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        deathCoreKepiting.setArtistName("Revenge The Fate");
        deathCoreKepiting.genreDeathCoreKepiting(deathCoreKepiting.getArtistName());

        BlackMetal blackMetal = new BlackMetal();
        blackMetal.setArtistName("Behemoth");
        blackMetal.genreBlackMetal(blackMetal.getArtistName());

        NewSkul newskul = new NewSkul();
        newskul.setArtistName("HATEBREED");
        newskul.genreNewSkul(newskul.getArtistName());

    }
}
