package com.user.library.service;

import com.user.library.model.Borrower;
import com.user.library.repository.BorrowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BorrowerService {

    @Autowired
    private BorrowerRepository borrowerRepository;

    public List<Borrower> getAllBorrowers() {
        return borrowerRepository.findAll();
    }

    public Optional<Borrower> getBorrowerById(Long id) {
        return borrowerRepository.findById(id);
    }

    public Borrower createBorrower(Borrower borrower) {
        return borrowerRepository.save(borrower);
    }

    public Borrower updateBorrower(Long id, Borrower borrowerDetails) {
        Optional<Borrower> optionalBorrower = borrowerRepository.findById(id);
        if (optionalBorrower.isPresent()) {
            Borrower borrower = optionalBorrower.get();
            borrower.setName(borrowerDetails.getName());
            borrower.setEmail(borrowerDetails.getEmail());
            borrower.setPhone(borrowerDetails.getPhone());
            return borrowerRepository.save(borrower);
        }
        return null;
    }

    public void deleteBorrower(Long id) {
        borrowerRepository.deleteById(id);
    }
}
