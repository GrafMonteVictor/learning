package org.example.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.example.dto.Human;
import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.util.List;

@Component
@RequiredArgsConstructor
public class HumanDao {

    private final ObjectMapper objectMapper;

    @SneakyThrows
    public void save(Human human)  {
        Path pathFile = Path.of("src/main/resources/humans.json");
        List<Human> humanList = objectMapper.readValue(pathFile.toFile(), new TypeReference<>() {});
        humanList.add(human);
        objectMapper.writeValue(pathFile.toFile(), humanList);
    }
}
