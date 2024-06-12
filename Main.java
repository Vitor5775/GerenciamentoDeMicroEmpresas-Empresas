import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReceitaBrutaTotal rbt = new ReceitaBrutaTotal();
        AliquotaEfetiva ae = new AliquotaEfetiva();

        // Seleção do tipo de empresa
        System.out.println("Selecione o tipo de empresa:");
        System.out.println("1. Comércio");
        System.out.println("2. Fábricas Industriais");
        System.out.println("3. Serviços de Instalação");
        System.out.println("4. Serviços Diversos");
        System.out.println("5. Serviços Profissionais");

        int tipoEmpresaEscolha = sc.nextInt();
        sc.nextLine();  
        TipoEmpresa tipoEmpresa = null;
        switch (tipoEmpresaEscolha) {
            case 1:
                tipoEmpresa = new TipoEmpresa("Comércio");
                break;
            case 2:
                tipoEmpresa = new TipoEmpresa("Fábricas Industriais");
                break;
            case 3:
                tipoEmpresa = new TipoEmpresa("Serviços de Instalação");
                break;
            case 4:
                tipoEmpresa = new TipoEmpresa("Serviços Diversos");
                break;
            case 5:
                tipoEmpresa = new TipoEmpresa("Serviços Profissionais");
                break;
            default:
                System.out.println("Tipo de empresa inválido.");
                return;
        }
        System.out.println("Tipo de empresa selecionado: " + tipoEmpresa);
        System.out.println("Informe os valores mensais da receita bruta:");
        float[] valReceitaBruta = new float[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Mês " + (i + 1) + ": ");
            valReceitaBruta[i] = sc.nextFloat();
        }
        // Calcular receita bruta total
        float receitaBrutaTotal = rbt.obtResultado(valReceitaBruta);
        System.out.println("Receita Bruta Total: " + receitaBrutaTotal);
        // Seleção do perfil
        System.out.print("Informe o perfil da empresa (1-5): ");
        int perfil = sc.nextInt();
        // Calcular alíquota efetiva
        double aliquotaEfetiva = ae.obtDeterminado(perfil, receitaBrutaTotal);
        System.out.println("Alíquota Efetiva: " + aliquotaEfetiva);
        // Logar resultados
        logResultado(receitaBrutaTotal, perfil, aliquotaEfetiva, tipoEmpresa);
        // Exibir log
        System.out.print("Digite a data para ver o log (YYYYMMDD): ");
        String logDate = sc.next();
        exibirLog(logDate);
        sc.close();
    }
    public static void logResultado(float receitaBrutaTotal, int perfil, double aliquotaEfetiva, TipoEmpresa tipoEmpresa) {
        LocalDate hoje = LocalDate.now();
        String dataFormatada = hoje.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String logFilename = "log_" + dataFormatada + ".txt";

        try (FileWriter logFile = new FileWriter(logFilename, true)) {
            logFile.write("Tipo de Empresa: " + tipoEmpresa.getTipo() + "\n");
            logFile.write("Receita Bruta Total: " + receitaBrutaTotal + "\n");
            logFile.write("Perfil: " + perfil + "\n");
            logFile.write("Alíquota Efetiva: " + aliquotaEfetiva + "\n");
            logFile.write("------------------------------\n");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo de log: " + e.toString());
        }
    }
    // Método para exibir log
    public static void exibirLog(String logDate) {
        String logFilename = "log_" + logDate + ".txt";

        try (BufferedReader logFile = new BufferedReader(new FileReader(logFilename))) {
            String line;
            System.out.println("Erros registrados em " + logDate + ":");
            while ((line = logFile.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo de log: " + e.toString());
        }
    }
}
