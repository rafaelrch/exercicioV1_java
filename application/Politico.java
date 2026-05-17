package application;

import java.util.Objects;

public class Politico {

    private String name;
    private Integer votos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    public Politico(String name, Integer votos) {
        this.name = name;
        this.votos = votos;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Politico politico = (Politico) o;
        return Objects.equals(name, politico.name) && Objects.equals(votos, politico.votos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, votos);
    }
}
