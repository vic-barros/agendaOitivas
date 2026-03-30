package agendaOitivas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Agenda agenda = new Agenda();
        ListaPendentes listaPendentes = new ListaPendentes();
        int opcao;

        do {
            System.out.println("\n=== AGENDA DE OITIVAS ===");
            System.out.println("1 - Agendar Oitiva");
            System.out.println("2 - Listar Oitivas Agendadas");
            System.out.println("3 - Alterar Status de Oitiva");
            System.out.println("4 - Remover Oitiva");
            System.out.println("5 - Adicionar Oitiva Pendente");
            System.out.println("6 - Listar Pendentes");
            System.out.println("7 - Remover Pendente");
            System.out.println("8 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\n--- AGENDAR OITIVA ---");
                    System.out.print("Nome da pessoa: ");
                    String nome = leia.nextLine();
                    System.out.print("CPF: ");
                    String cpf = leia.nextLine();
                    System.out.println("Tipo (1-VITIMA, 2-SUSPEITO, 3-TESTEMUNHA): ");
                    int tipoPessoa = leia.nextInt();
                    leia.nextLine();
                    TipoPessoa tipo = tipoPessoa == 1 ? TipoPessoa.VITIMA
                                   : tipoPessoa == 2 ? TipoPessoa.SUSPEITO
                                   : TipoPessoa.TESTEMUNHA;
                    Pessoa pessoa = new Pessoa(nome, cpf, tipo);

                    System.out.print("Número do procedimento: ");
                    int numeroProc = leia.nextInt();
                    System.out.print("Ano do procedimento: ");
                    int anoProc = leia.nextInt();
                    leia.nextLine();
                    System.out.print("Crime: ");
                    String crime = leia.nextLine();
                    ProcedimentoPolicial proc = new ProcedimentoPolicial(numeroProc, anoProc, crime);

                    System.out.print("Dia: ");
                    int dia = leia.nextInt();
                    System.out.print("Mês: ");
                    int mes = leia.nextInt();
                    System.out.print("Ano: ");
                    int ano = leia.nextInt();
                    System.out.print("Hora: ");
                    int hora = leia.nextInt();
                    System.out.print("Minuto: ");
                    int minuto = leia.nextInt();
                    leia.nextLine();
                    System.out.print("Observação: ");
                    String obs = leia.nextLine();

                    Oitiva oitiva = new Oitiva(pessoa, proc, dia, mes, ano, hora, minuto, obs);
                    agenda.adicionarOitiva(oitiva);
                    break;

                case 2:
                    agenda.listarOitivas();
                    break;

                case 3:
                    agenda.listarOitivas();
                    System.out.print("Índice da oitiva: ");
                    int indiceStatus = leia.nextInt();
                    System.out.println("Status (1-PENDENTE, 2-AGENDADA, 3-REMARCADA, 4-CANCELADA, 5-REALIZADA): ");
                    int novoStatus = leia.nextInt();
                    leia.nextLine();
                    StatusOitiva status = novoStatus == 1 ? StatusOitiva.PENDENTE
                                       : novoStatus == 2 ? StatusOitiva.AGENDADA
                                       : novoStatus == 3 ? StatusOitiva.REMARCADA
                                       : novoStatus == 4 ? StatusOitiva.CANCELADA
                                       : StatusOitiva.REALIZADA;
                    agenda.alterarStatus(indiceStatus, status);
                    break;

                case 4:
                    agenda.listarOitivas();
                    System.out.print("Índice da oitiva a remover: ");
                    int indiceRemover = leia.nextInt();
                    leia.nextLine();
                    agenda.removerOitiva(indiceRemover);
                    break;

                case 5:
                    System.out.println("\n--- ADICIONAR OITIVA PENDENTE ---");
                    System.out.print("Nome da pessoa: ");
                    String nomePend = leia.nextLine();
                    System.out.print("CPF: ");
                    String cpfPend = leia.nextLine();
                    System.out.println("Tipo (1-VITIMA, 2-SUSPEITO, 3-TESTEMUNHA): ");
                    int tipoPend = leia.nextInt();
                    leia.nextLine();
                    TipoPessoa tipoPessoa2 = tipoPend == 1 ? TipoPessoa.VITIMA
                                          : tipoPend == 2 ? TipoPessoa.SUSPEITO
                                          : TipoPessoa.TESTEMUNHA;
                    Pessoa pessoaPend = new Pessoa(nomePend, cpfPend, tipoPessoa2);

                    System.out.print("Número do procedimento: ");
                    int numProcPend = leia.nextInt();
                    System.out.print("Ano do procedimento: ");
                    int anoProcPend = leia.nextInt();
                    leia.nextLine();
                    System.out.print("Crime: ");
                    String crimePend = leia.nextLine();
                    ProcedimentoPolicial procPend = new ProcedimentoPolicial(numProcPend, anoProcPend, crimePend);

                    System.out.print("Observação: ");
                    String obsPend = leia.nextLine();

                    OitivaPendente pendente = new OitivaPendente(pessoaPend, procPend, obsPend);
                    listaPendentes.adicionarOitivaPendente(pendente);
                    break;

                case 6:
                    listaPendentes.listarOitivaPendente();
                    break;

                case 7:
                    listaPendentes.listarOitivaPendente();
                    System.out.print("Índice do pendente a remover: ");
                    int indicePend = leia.nextInt();
                    leia.nextLine();
                    listaPendentes.removerOitivaPendente(indicePend);
                    break;

                case 8:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 8);

        leia.close();
    }
}