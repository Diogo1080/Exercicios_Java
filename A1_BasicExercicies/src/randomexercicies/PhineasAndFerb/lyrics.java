package randomexercicies.PhineasAndFerb;

public class lyrics {
    String lyrics = "Cento e quatro dias que fazem as férias\n" +
            "E a escola acaba com elas\n" +
            "Mas o grande problema que todos vivemos\n" +
            "É saber como aproveitá-las\n" +
            "Nós vamos\n" +
            "Andar no espaço\n" +
            "Lutar com uma múmia\n" +
            "Ou a torre Eiffel vais escalar\n" +
            "Achar uma coisa que não exista\n" +
            "Ou pôr um macaco a brilhar\n" +
            "Surfar em maremotos\n" +
            "Criar nanobots\n" +
            "Um Frankenstein dissecar\n" +
            "(Está aqui!)\n" +
            "Encontrar um dodó\n" +
            "Pintar o continente\n" +
            "E pôr a irmã a gritar\n" +
            "(Phineas!)\n" +
            "É bom de ver, há tanto a fazer\n" +
            "A escola está a começar\n" +
            "(Vamos Perry!)\n" +
            "Fiquem aí porque o Phineas e o Ferb tudo vão experimentar\n" +
            "Fiquem aí porque o Phineas e o Ferb tudo vão experimentar\n" +
            "(Mãe! O Phineas e o Ferb cantaram a canção de abertura!)\n";

    public lyrics (){}

    public void getLyrics(){
        System.out.println(lyrics);
    }
    public void getLyricsOnLine(int line){
        String[] lines = lyrics.split("\r\n|\r|\n");
        System.out.println(lines[line-1]);
    }

    public int getLyricsLinesLength(){
        String[] lines = lyrics.split("\r\n|\r|\n");
        return lines.length + 1;
    }
}
