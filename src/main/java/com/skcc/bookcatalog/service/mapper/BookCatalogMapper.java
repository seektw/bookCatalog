package com.skcc.bookcatalog.service.mapper;


import com.skcc.bookcatalog.domain.*;
import com.skcc.bookcatalog.service.dto.BookCatalogDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link BookCatalog} and its DTO {@link BookCatalogDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BookCatalogMapper extends EntityMapper<BookCatalogDTO, BookCatalog> {



    default BookCatalog fromId(String id) {
        if (id == null) {
            return null;
        }
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.setId(id);
        return bookCatalog;
    }
}
