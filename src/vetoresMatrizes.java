public class vetoresMatrizes {
    public static void main(String[] args) {
        String[] cidades = {"Londres","Madrid","Nova York","Buenos Aires","Asuncion","Sao Paulo","Lima","Santiado de Chile","Lisboa","Tokyo"};
        double[][] temperaturas = {{-2,33}, {-3,32}, {-8,27}, {4,37}, {6,42}, {5,43}, {0,39}, {-7,26}, {-1,31}, {-10,35}};
        for (int i = 0; i < cidades.length; i++){
            System.out.println(cidades[i]+" Temperatura minima de "+temperaturas[i][0] + ", Temperatura maxima "+ temperaturas[i][1]);
            //for (int u = 0; u < 2; u++){
            //    System.out.println(temperaturas[i][u]);
            }
        }
    }
//}
