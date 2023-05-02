package ru.yandex.practicum.filmorate.storage.dao;

import ru.yandex.practicum.filmorate.model.Genre;

import java.util.Collection;
import java.util.Optional;

public interface GenreStorage {
    Optional<Genre> findById(long id);

    Collection<Genre> getAll();

    boolean existsById(long id);
}
