package me.abebe.demo;

import org.springframework.data.repository.CrudRepository;

public interface ZodiacRepository extends CrudRepository<Zodiac , Long> {
    @Override
    Iterable<Zodiac> findAll();

    @Override
    Iterable<Zodiac> findAllById(Iterable<Long> iterable);

}
