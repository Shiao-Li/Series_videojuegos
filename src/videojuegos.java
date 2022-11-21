public class videojuegos {
    String titulo;
    int horasEstimadas;
    boolean entregado;
    String genero;
    String compania;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public videojuegos(){
        titulo = "God of War-Rgnarock";
        horasEstimadas = 5;
        entregado =false;
        genero="Accion";
        compania="SCE Santa Monica Studio";
    }
    public videojuegos(String titulo1, int horasEstimadas1){
        this.titulo=titulo1;
        this.horasEstimadas=horasEstimadas1;
    }
    public void infoJuegos(videojuegos juegos[]){
        juegos[0].setTitulo("God of war-2");
        juegos[0].setCompania("SCE Santa Monica Studio");
        juegos[0].setGenero("Accion");
        juegos[0].setHorasEstimadas(8);
    }
}
