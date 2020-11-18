public class Serie {
   //Atributos da classe
   private int duracao, numTemporadas, epTemporadas;
   private String idiomaAudio;
   private String idiomaLegenda;
   private boolean estaPausado;
   private String nome;
   private int lancamento;
      

    //Metodos Construtores
    public Serie(String nomeSerie, int temporadas, int episodiosPorTemporada, int duracao, int ano){
        this.nome = nomeSerie;
        this.numTemporadas = temporadas;
        this.epTemporadas = episodiosPorTemporada;
        this.lancamento = ano;
        this.duracao = duracao;
        this.idiomaAudio = "Português(Brasil)";
        this.idiomaLegenda = "Português(Brasil)";
        this.estaPausado = false;
    }

    //Metodos especificos da classe
    public void executar() {
        if(estaPausado == false){
            System.out.println("Você iniciou a reproducão de: "+ getNome());
        }else{
            System.out.println("Sua série está sendo executada");
        }
    }

    public void pausar() {
        estaPausado = true;
        System.out.println("Série pausada.");
    }

    public void mudarAudio() {
        if(idiomaAudio == "Inglês(Original)"){
            idiomaAudio = "Português(Brasil)";
        }else{
            idiomaAudio = "Inglês(Original)";
        }    
        
        System.out.println("Idioma alterado para: " + idiomaAudio);
    
    }

    public void mudarLegenda() {
        if(idiomaLegenda == "Filme sem legenda"){
            idiomaLegenda = "Português(Brasil)";
        }else{
            idiomaLegenda = "Filme sem legenda";
        }
        System.out.println("Legenda alterada para: "+ idiomaLegenda);
    }

    public String exibirDetalhes() {
        System.out.println("Detalhes da Série: " + getNome() + " // Quantidade de Temporadas: " + getNumTemporadas() + " // Quantidade de episodios por temporada: " + getEpTemporadas());
        System.out.println("Media de minutos por episodio: " + getDuracao() +" Minutos" + "  // Ano de Lancamento: " + getLancamento());
        return null;
    }



    // Getter e setters
    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int temporadas) {
        this.numTemporadas = temporadas;
    }

    public int getEpTemporadas() {
        return epTemporadas;
    }

    public void setEpTemporadas(int episodiosPorTemporada) {
        this.epTemporadas = episodiosPorTemporada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeSerie) {
        this.nome = nomeSerie;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int ano) {
        this.lancamento = ano;
    }


}
