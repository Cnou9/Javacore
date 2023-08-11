package lab3.entilies;

import lab3.Service.WorkerService;

import java.time.LocalDate;
import java.util.ArrayList;

public class History {
    private Worker worker;
    private double newSalary;
    private String status;
    private LocalDate updatedTime;

    public History(Worker worker, double newSalary, String status) {
        this.worker = worker;
        this.newSalary = newSalary;
        this.status = status;
        this.updatedTime = LocalDate.now();
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDate updatedTime) {
        this.updatedTime = LocalDate.now();

    }

    @Override
    public String toString() {
        return " History{" +
                " workersID=" + worker.getId()+
                " workersName=" + worker.getName()+
                " alary=" + newSalary +
                " status='" + status + '\'' +
                " updatedTime=" + updatedTime +
                '}';
    }
}
