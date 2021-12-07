import java.util.ArrayList;
import java.util.Scanner;

public class MainEmpregado {
    public static void main(String[] args) {
        ArrayList <Empregado> e = new ArrayList<Empregado>();
        Scanner input = new Scanner(System.in);
        Scanner inputS = new Scanner(System.in);
        System.out.println("Digite o número de empregados");
        int n = input.nextInt();

        for (int i=0; i<n; i++) {
            Empregado j = new Empregado();
            e.add(j);
        }
        System.out.println("Quantidade empregados:" + e.size()+ "\n");

        System.out.println("Imprimindo empregados[...]");
        for (int i = 0; i < n; i++) {
            System.out.println(e.get(i).imprimirEmpregado(i));
        }

        String option;
        do {
            System.out.println("Qual empregado deseja modificar: ");
            int empregadoID = input.nextInt();
            System.out.println("Qual nome do empregado: ");
            String empregadoNome = inputS.nextLine();
            System.out.println("Qual salário:");
            double empregadoSalario = input.nextDouble();

            e.get(empregadoID).setNome(empregadoNome);
            e.get(empregadoID).setSalario(empregadoSalario);

            System.out.println("\nDeseja modificar mais empregados? (S ou N)");
            option = input.next();

        }while(option.equalsIgnoreCase("S"));

        for (int i = 0; i < n; i++) {
            System.out.println(e.get(i).imprimirEmpregado(i));
        }

        double mediaSalario = 0;
        System.out.println("Calculando Média dos salários");
        for (Empregado empregado : e) {
            mediaSalario += empregado.getSalario();
        }
        mediaSalario = mediaSalario/e.size();

        System.out.println("Média dos salários:" + mediaSalario + "\n");
        System.out.println("Aumentando salários abaixo da média[...]\n");
        for (Empregado empregado : e) {
            if (empregado.getSalario() < mediaSalario) {
                double salarioEmpregado = empregado.getSalario();
                empregado.setSalario(salarioEmpregado + (salarioEmpregado * 0.10));
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(e.get(i).imprimirEmpregado(i));
        }

        double menorSalario = e.get(0).getSalario();
        for (int i = 1; i < e.size(); i++){
            if (e.get(i).getSalario()<menorSalario) {
                menorSalario = e.get(i).getSalario();
            }
        }

        System.out.println("Menor salário (Após correção 10%): " + menorSalario);
        }
    }
