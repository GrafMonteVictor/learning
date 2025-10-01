package org.example;

public class HumanService {
    private HumanDao humanDao;

    public HumanService(HumanDao humanDao) {
        this.humanDao = humanDao;
    }

    public void createHuman(Human human) {
        humanDao.save(human);
    }
}
