package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dao.HumanDao;
import org.example.dto.Human;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HumanService {

    private final HumanDao humanDao;


    public void createHuman(Human human) {
        humanDao.save(human);
    }
}
