package org.projeto_composicao_devsuperior.projeto_compisocao_dev_superior.app;

import org.projeto_composicao_devsuperior.projeto_compisocao_dev_superior.entities.Department;
import org.projeto_composicao_devsuperior.projeto_compisocao_dev_superior.entities.HourContract;
import org.projeto_composicao_devsuperior.projeto_compisocao_dev_superior.entities.Worker;
import org.projeto_composicao_devsuperior.projeto_compisocao_dev_superior.entities.WorkerLevel;

import java.time.LocalDate;
import java.util.Locale;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);

        Department department = new Department("Design");

        Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.0, department);

        HourContract contract1 = new HourContract(LocalDate.of(2018, 8, 20), 50.0, 20);
        HourContract contract2 = new HourContract(LocalDate.of(2018, 6, 13), 30.0, 18);
        HourContract contract3 = new HourContract(LocalDate.of(2018, 8, 25), 80.0, 10);

        worker.addContract(contract1);
        worker.addContract(contract2);
        worker.addContract(contract3);

        IO.println("Nome: " + worker.getName());
        IO.println("Departamento: " + worker.getDepartment().getName());
        IO.println("Ganho para 08/2018: " + String.format("%.2f", worker.income(2018, 9)));
    }
}
