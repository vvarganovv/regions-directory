package ru.marchenko.regionsdirectory.service;

import ru.marchenko.regionsdirectory.model.Region;

import java.util.List;

/**
 * @author Created by Vladislav Marchenko on 30.09.2020
 */
public interface RegionsService {

    List<Region> findAll();

    Region findById(long id);

    Region deleteById(long id);

    Region insert(Region region);

    boolean update(Region region);

}
