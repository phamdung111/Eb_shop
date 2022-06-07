package Service.Impl;

import Entitys.EBook;
import Repository.EBookRepository;
import Service.EBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class EBookServiceImpl implements EBookService {
    @Autowired
    private EBookRepository eBookRepository;

    @Override
    public Iterable<EBook> findAll() {
        if (eBookRepository.findAll().isEmpty()) {
            System.out.println("No Book is here");
        }
        return eBookRepository.findAll();
    }


    @Override
    public EBook createEBook(EBook eBook) {
        eBookRepository.save(eBook);
        return eBook;
    }

    @Override
    public Optional<EBook> findById(Long id) {
        return eBookRepository.findById(id);
    }


    @Override
    public EBook updateEBook(Long id, EBook eBookUpdate) {
        EBook eBook = eBookRepository.findId(id);
        if (eBook.getIsbn().equals(eBookUpdate.getIsbn())){
            eBookUpdate.setId(eBook.getId());
            eBookRepository.save(eBookUpdate);
        }
        return eBook;
    }

    @Override
    public EBook deleteEBook(Long id) {
        EBook eBook = eBookRepository.findId(id);
        eBook.setDeleted(false);
        eBookRepository.save(eBook);
        return eBook;
    }

    @Override
    public Iterable<EBook> findByTitle(String title, String author, String inbs, String publish, Long pri) {
        return eBookRepository.findAllByTitleOrAthorIdOrPublisherIdOrIsbnOrPrice(title,author,inbs,publish,pri);
    }
}
