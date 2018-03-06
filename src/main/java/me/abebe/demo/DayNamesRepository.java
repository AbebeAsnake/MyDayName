package me.abebe.demo;

import org.springframework.data.repository.CrudRepository;

public interface DayNamesRepository extends CrudRepository<DayNames , Long>{
    Iterable<DayNames> findByDays(String days);
}
