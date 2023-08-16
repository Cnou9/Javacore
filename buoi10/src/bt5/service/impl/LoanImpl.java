package bt5.service.impl;

import bt5.entities.Loan;
import bt5.service.Library;

import java.util.ArrayList;
import java.util.List;

public class LoanImpl implements Library<Loan> {
    private List<Loan> loans=new ArrayList<>();
    @Override
    public List<Loan> getAll() {
        return loans;
    }

    @Override
    public Loan findById(int id) {
        for(Loan l:loans){
            if(l.getReader().getId()==id){
                return l;
            }
        }
        return null;
    }

    @Override
    public void add(Loan l) {
        loans.add(l);
    }

    @Override
    public Loan del(int id) {
        loans.removeIf(loan -> loan.getReader().getId()==id);
    return null;
    }

    @Override
    public void edit(Loan loan) {
        for(int i=0;i< loans.size();i++){
            if(loans.get(i).getReader().getId()==loan.getReader().getId()){
                loans.set(i,loan);
                break;
            }
        }
    }
}
