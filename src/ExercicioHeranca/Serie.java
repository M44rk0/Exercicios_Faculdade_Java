package ExercicioHeranca;

public class Serie extends ProgramaTV{
    int temporadas;
    int episodios;

    public Serie(String nome, String categoria, int temporadas, int episodios) {
        super(nome, categoria);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        StringBuilder programa = new StringBuilder(codigo + "-" + nome + " (" + categoria + ")\n");
        programa.append("Diretor : ").append(diretor).append("\n");
        programa.append("Temporadas: ").append(temporadas).append("\n");
        programa.append("Episodios: ").append(episodios).append("\n");
        programa.append("Artistas : \n");
        for (Pessoa artista : artistas) {
            programa.append(artista).append("\n");
        }
        return programa.toString();
    }
}
