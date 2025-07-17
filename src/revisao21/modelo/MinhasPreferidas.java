package revisao21.modelo;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto de preferidos por todos!");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todos estão curtindo");
        }
    }
}
